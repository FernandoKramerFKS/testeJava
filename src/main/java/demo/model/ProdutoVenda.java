package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProdutoVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Produto produto;
	private Double precoVenda;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public Long getId() {
		return id;
	}
	
	public void calcularVenda(Produto prod, Double rateio) {
		
		Double valorLucro = (prod.getPrecoCusto() + rateio) * prod.getMargemLucro() / 100;
		
		this.precoVenda = prod.getPrecoCusto() + rateio + valorLucro;
	}

}
