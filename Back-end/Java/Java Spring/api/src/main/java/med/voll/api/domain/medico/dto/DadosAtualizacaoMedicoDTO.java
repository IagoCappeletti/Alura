package med.voll.api.domain.medico.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEnderecos;

public record DadosAtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecos enderecos) {
}
