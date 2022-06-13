package com.biblioteca.apibiblioteca.repository;

import com.biblioteca.apibiblioteca.entities.Obras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObrasRepository extends JpaRepository<Obras, Long> {

    public void deleteById(Long id);
}
