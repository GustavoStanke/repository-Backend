package orgSenac.aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import orgSenac.aula01.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer>{

    
}