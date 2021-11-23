package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import demo.dto.ProdutoDto;
import demo.model.Produto;
import demo.repository.ProdutoRepository;

@Controller
public class CadastroProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/")
	public String paginaCadastroProduto() {
		return "cadastroProduto";
	}
	
	@PostMapping("/cadastrarProduto")
	public String cadastrarProduto(ProdutoDto prod) {

		Produto produto = new Produto();
		produto.setNome(prod.getNomeProduto());
		produto.setDescricao(prod.getDescricao());
		produto.setPrecoCusto(prod.getPrecoCusto());
		produto.setMargemLucro(prod.getMargemLucro());
		produto.setEstoque(prod.getEstoque());
		
		produtoRepository.save(produto);
		
		return "cadastroProduto";
	}
}
