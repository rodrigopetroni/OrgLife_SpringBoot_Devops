package org.life.gs04.domain.paciente;

import org.life.gs04.domain.endereco.Endereco;
import org.life.gs04.domain.orgao.Orgao;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String cpf, String telefone, Orgao orgao, Doador doador, Endereco endereco) {
    public DadosDetalhamentoPaciente (Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getOrgao(), paciente.getDoador(), paciente.getEndereco());

    }
}

