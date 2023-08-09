package med.voll.api.domain.paciente.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEnderecos;

public record DadosCadastroPacienteDTO(
        //Só para Strings
        @NotBlank(message = "{nome.obrigatorio}")
        String nome,
        @NotBlank(message = "{email.obrigatorio}")
        @Email(message = "{email.invalido}")
        String email,
        @NotBlank(message = "{telefone.obrigatorio}")
        String telefone,
        @NotBlank(message = "{cpf.obrigatorio}")
        @Pattern(regexp = "\\d{11}", message = "{cpf.invalido}")
        String cpf,
        @NotNull(message = "{endereco.obrigatorio}")
        @Valid
        DadosEnderecos endereco) {
}
