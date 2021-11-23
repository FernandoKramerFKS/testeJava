package demo.dto;

public class ProdutoDto {
	
	private String nomeProduto;
	private Double precoCusto;
	private int margemLucro;
	private String descricao;
	private int estoque;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public int getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(int margemLucro) {
		
		this.margemLucro = margemLucro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}
