package org.life.gs04.domain.medico;

import org.life.gs04.domain.orgao.Orgao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);

    @Query("""
                select m from Medico m
                where
                m.ativo = true
                and
                m.orgao = :orgao
                and
                m.id not in(
                        select c.medico.id from Consulta c
                        where
                        c.data = :data
                )
                order by rand()
                limit 1
                """)

    Medico escolherMedicoAleatorioLivreNaData(Orgao orgao, LocalDateTime data);

    @Query("""
            select m.ativo
            from Medico m
            where
            m.id = :id
            """)

    Boolean findAtivoById(Long id);
}
