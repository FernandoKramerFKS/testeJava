package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Long>{

}
