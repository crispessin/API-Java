package com.aula.aula;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoControler {
    private ProdutoRepository produtoRepository;

    public ProdutoControler(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public Collection<Produto> getNomeProduto(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        System.out.print(produto);
        produtoRepository.save(produto);
        return produto;
    }

    @PutMapping
    public Produto alterarProduto(@RequestBody Produto produto) {
        System.out.println(produto);
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping
    public void removeProduto(@RequestBody Produto produto) {
        System.out.println(produto);
        produtoRepository.delete(produto);
    }
}
