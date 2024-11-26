package orgSenac.aula01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import orgSenac.aula01.Model.Produto;
import orgSenac.aula01.repository.ProdutoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produto")
public class ProdutoController {
 
    @Autowired
    private ProdutoRepository repository;
 
    @GetMapping
    public List<Produto> get() {
        return repository.findAll();
    }    

    
	@PostMapping
	public Produto save(@RequestBody Produto produto){
		return repository.save(produto);
}

   
}