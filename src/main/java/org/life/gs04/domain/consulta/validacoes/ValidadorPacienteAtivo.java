package org.life.gs04.domain.consulta.validacoes;

import org.life.gs04.domain.ValidacaoException;
import org.life.gs04.domain.consulta.DadosAgendamentoConsulta;
import org.life.gs04.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados){

        if(dados.idPaciente() == null){
            return;
        }

        var pacienteEstaAtivo = repository.findAtivoById(dados.idMedico());
        if (!pacienteEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com paciente excluído");
        }

    }
}

