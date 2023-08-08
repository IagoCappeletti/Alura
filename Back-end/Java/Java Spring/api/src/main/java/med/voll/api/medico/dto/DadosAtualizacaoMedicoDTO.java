package med.voll.api.medico.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEnderecos;

public record DadosAtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecos enderecos) {
}
