package repository;

import entity.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Catalog_repository extends CrudRepository<Catalog ,Long> {
}
