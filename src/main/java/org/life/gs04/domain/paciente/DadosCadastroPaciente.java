package org.life.gs04.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.antlr.v4.runtime.misc.NotNull;
import org.life.gs04.domain.endereco.DadosEndereco;
import org.life.gs04.domain.orgao.Orgao;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
        String cpf,
        @NotNull
        Orgao orgao,

        @NotNull
        Doador doador,

        @NotNull @Valid DadosEndereco endereco) {
}