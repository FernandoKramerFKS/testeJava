package demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import demo.dto.ProdutoVendaDto;
import demo.model.ProdutoVenda;
import demo.repository.ProdutoVendaRepository;

@Controller
public class ListagemProdutoController {
	
	@Autowired
	private ProdutoVendaRepository produtoVendaRepository;
	
	@GetMapping("/listagemProduto")
	public String listarProdutos(Model model) {
		
		List<ProdutoVendaDto> produtos = new ArrayList<ProdutoVendaDto>();
		List<ProdutoVenda> prodVenda = produtoVendaRepository.findAll();
		ProdutoVendaDto produto = null;
		for(int i = 0; i < prodVenda.size(); i++) {
			ProdutoVenda p = prodVenda.get(i);
			produto = new ProdutoVendaDto();
			produto.converter(p);
			produtos.add(produto);
		}
		
		for(int i =0 ; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).getNome());
		}
		
		model.addAttribute("produto", produtos);
		return "listagemProduto";
	}

}
