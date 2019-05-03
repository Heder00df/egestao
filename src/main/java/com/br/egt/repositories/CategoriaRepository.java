package com.br.egt.repositories;

import com.br.egt.entidade.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    Categoria findByDescricao(String descricao);
}
