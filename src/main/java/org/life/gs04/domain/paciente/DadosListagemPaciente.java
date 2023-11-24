package org.life.gs04.domain.paciente;

import org.life.gs04.domain.orgao.Orgao;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf, Orgao orgao, Doador doador) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getOrgao(), paciente.getDoador());
    }

}