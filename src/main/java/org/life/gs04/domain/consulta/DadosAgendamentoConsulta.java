package org.life.gs04.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import org.life.gs04.domain.orgao.Orgao;
import org.life.gs04.domain.paciente.Doador;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        Orgao orgao,

        Doador doador) {
}