package med.voll.api.paciente.dto;

import med.voll.api.endereco.Endereco;
import med.voll.api.paciente.Paciente;

public record DadosPacienteDetalhadoDTO(String nome, String email, String telefone, String cpf, Endereco endereco) {

    public DadosPacienteDetalhadoDTO(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }

}
