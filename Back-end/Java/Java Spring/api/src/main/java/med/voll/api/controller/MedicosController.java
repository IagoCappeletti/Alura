package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.medico.dto.DadosCadastroMedicoDTO;
import med.voll.api.domain.medico.DadosListagemMedico;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.medico.dto.DadosAtualizacaoMedicoDTO;
import med.voll.api.domain.medico.dto.DadosMedicoDetalhadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroMedicoDTO dados, UriComponentsBuilder uriBuilder) {
        var medico = new Medico(dados);
        repository.save(medico);

        var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
        /*Para fazer um parametro dinâmico usar {id} */

        return ResponseEntity.created(uri).body(new DadosMedicoDetalhadoDTO(medico));
        /*Devolvendo o código 201, com cabeçalho location com URI e devolver no corpo da resposta uma representação
        do recurso recém criado*/
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemMedico>>listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoMedicoDTO dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atulizarInfromacoes(dados);

        return ResponseEntity.ok(new DadosMedicoDetalhadoDTO(medico));
        //200
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        var medico = repository.getReferenceById(id);
        medico.inativar();

        return ResponseEntity.noContent().build();
        //204
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var medico = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosMedicoDetalhadoDTO(medico));
    }

}
