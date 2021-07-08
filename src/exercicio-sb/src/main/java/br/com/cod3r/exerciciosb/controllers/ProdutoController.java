package br.com.cod3r.exerciciosb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciosb.model.entities.Produto;
import br.com.cod3r.exerciciosb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	// injeção de dependência
	// autowired -> automaticamente vai inserir um objeto dentro do atributo 'produtoRepository'
	@Autowired
	private ProdutoRepository produtoRepository;
	
//	@PostMapping
//	public @ResponseBody Produto novoProduto(
//			@RequestParam String nome,
//			@RequestParam double preco,
//			@RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
//		// após instanciar l. 20, aqui consigo utilizar essas 'ferramentas' fornecida pelo próprio spring, e agora meu dado será persistido.
//		produtoRepository.save(produto);
//		return produto;
//	}
	// é possível instanciar um objeto no parametro, assim não precisa escrever todos os parametros existentes
	// unindo 2 métodos
	// @PostMapping
	
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	// cuidado com método q retorna tudo. O interessante é paginar;
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path= "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		// return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepository.searchByNameLike(parteNome);
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdPagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPagina) {
		if( qtdPagina >= 5) qtdPagina = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdPagina);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	
}