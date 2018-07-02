package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {
	private static final List<Produto> produtos = Arrays
			.asList(new Produto(1L,"Notebook"),new Produto(2L,"Relógio"),new Produto(3L,"Bola")); 
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping
	public List<Produto> listaProduto(){
		return produtos;
	}

}
