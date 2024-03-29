package med.voll.api.domain.medico.dto;

import med.voll.api.domain.medico.Especialidade;
import med.voll.api.domain.endereco.Endereco;
import med.voll.api.domain.medico.Medico;

public record DadosMedicoDetalhadoDTO(Long id, String nome, String email, String crm, String telefone,
                                      Especialidade especialidade, Endereco endereco) {

    public DadosMedicoDetalhadoDTO(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
