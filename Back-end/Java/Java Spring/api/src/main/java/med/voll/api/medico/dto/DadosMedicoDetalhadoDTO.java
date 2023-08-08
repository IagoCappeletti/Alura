package med.voll.api.medico.dto;

import med.voll.api.endereco.Endereco;
import med.voll.api.medico.Especialidade;
import med.voll.api.medico.Medico;

public record DadosMedicoDetalhadoDTO(Long id, String nome, String email, String crm, String telefone,Especialidade especialidade, Endereco endereco) {

    public DadosMedicoDetalhadoDTO(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
