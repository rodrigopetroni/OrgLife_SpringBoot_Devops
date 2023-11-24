package org.life.gs04.domain.medico;

import jakarta.validation.constraints.NotNull;
import org.life.gs04.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}

