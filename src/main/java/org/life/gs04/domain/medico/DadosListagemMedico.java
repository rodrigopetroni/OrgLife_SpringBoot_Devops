package org.life.gs04.domain.medico;

import org.life.gs04.domain.orgao.Orgao;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Orgao orgao) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getOrgao());
    }

}
