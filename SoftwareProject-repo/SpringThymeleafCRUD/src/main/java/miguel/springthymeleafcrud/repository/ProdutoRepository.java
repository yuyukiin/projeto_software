package miguel.springthymeleafcrud.repository;

import miguel.springthymeleafcrud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
