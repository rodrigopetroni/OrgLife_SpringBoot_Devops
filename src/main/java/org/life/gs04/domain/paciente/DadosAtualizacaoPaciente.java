package org.life.gs04.domain.paciente;

import jakarta.validation.constraints.NotNull;
import org.life.gs04.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
