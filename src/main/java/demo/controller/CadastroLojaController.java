package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import demo.dto.LojaDto;
import demo.model.Loja;
import demo.model.Produto;
import demo.model.ProdutoVenda;
import demo.repository.LojaRepository;
import demo.repository.ProdutoRepository;
import demo.repository.ProdutoVendaRepository;

@Controller
public class CadastroLojaController {
	
	@Autowired
	private LojaRepository lojaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ProdutoVendaRepository produtoVendaRepository;
	
	@GetMapping("/cadastroLoja")
	public String paginaCadastroLoja() {
		return "cadastroLoja";
	}
	
	@PostMapping("/cadastrarDespesa")
	public String cadastrarDespesa(LojaDto loj) { 
		
		Loja loja = new Loja();
		loja.setDespesas(loj.getDespesas());
		lojaRepository.save(loja);
		 
		int quantidadeItens = 0;
		
		List<Produto> prod = produtoRepository.findAll();
		
		for(int i = 0; i < prod.size(); i++) {
			Produto pr = new Produto();
			pr = prod.get(i);
			quantidadeItens += pr.getEstoque();
		}
		
		Double valorRateio = loja.getDespesas() / quantidadeItens;
		
		for(int i = 0; i < prod.size(); i++) {
			ProdutoVenda prodVenda = new ProdutoVenda();
			prodVenda.setProduto(prod.get(i));
			prodVenda.calcularVenda(prod.get(i), valorRateio);
			produtoVendaRepository.save(prodVenda);
		} 
		
		return "cadastroLoja";
	}

}
