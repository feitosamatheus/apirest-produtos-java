package com.produtos.apirest.controller;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping(value = "/produto")
    @ApiOperation(value = "Retorna uma Lista de Produtos ")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping(value = "/produto/{id}")
    @ApiOperation(value = "Retorna um Produto especifico ")
    public Produto produtoEspecifico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping(value = "/produto")
    @ApiOperation(value = "Salva um produto no banco de dados ")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping(value = "/produto")
    @ApiOperation(value = "Deleta um produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @PutMapping(value = "/produto")
    @ApiOperation(value = "Atualiza um produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
