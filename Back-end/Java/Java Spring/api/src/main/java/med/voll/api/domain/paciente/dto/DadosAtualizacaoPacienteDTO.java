package med.voll.api.domain.paciente.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.paciente.Paciente;
import med.voll.api.domain.endereco.DadosEnderecos;

public record DadosAtualizacaoPacienteDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        @Email
        String email,
        DadosEnderecos enderecos) {
public record DadosListagemPaciente(Long id, String nome, String email, String cpf) {
        public DadosListagemPaciente(Paciente paciente) {
                this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
                }
        }
}
