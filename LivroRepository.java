package com.josyani.repository;

import com.exemplo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    // Aqui você pode adicionar consultas personalizadas, se necessário
}
