package br.edu.ufabc.leocaliza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufabc.leocaliza.entity.Branch;;

@Repository
public interface FilialRepository extends JpaRepository<Branch, Long> {
}
