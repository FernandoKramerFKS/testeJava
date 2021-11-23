package demo.dto;

import java.text.DecimalFormat;

import demo.model.ProdutoVenda;

public class ProdutoVendaDto {
	
	private Long id;
	private String nome;
	private String descricao;
	private int estoque; 
	private String precoVenda;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public String getPrecoVenda() {
		return precoVenda;
	}
	
	public void converter(ProdutoVenda prod) {
		this.nome = prod.getProduto().getNome();
		this.descricao = prod.getProduto().getDescricao();
		this.estoque = prod.getProduto().getEstoque();
		this.precoVenda = new DecimalFormat("#,##0.00").format(prod.getPrecoVenda());
	}

}
