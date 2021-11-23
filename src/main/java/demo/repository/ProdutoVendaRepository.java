package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.ProdutoVenda;

public interface ProdutoVendaRepository extends JpaRepository<ProdutoVenda, Long>{

}
