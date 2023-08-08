package med.voll.api.paciente.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEnderecos;
import med.voll.api.paciente.Paciente;

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
