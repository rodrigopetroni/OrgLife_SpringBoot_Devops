package org.life.gs04.domain.medico;

import org.life.gs04.domain.endereco.Endereco;
import org.life.gs04.domain.orgao.Orgao;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone, Orgao orgao, Endereco endereco) {
    public DadosDetalhamentoMedico (Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getOrgao(), medico.getEndereco());

    }
}