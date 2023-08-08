package med.voll.api.paciente.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEnderecos;

public record DadosAtualizacaoPacienteDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        @Email
        String email,
        DadosEnderecos enderecos
) {
}
