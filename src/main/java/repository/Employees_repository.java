package repository;

import entity.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employees_repository extends CrudRepository<Employees ,Long> {
}
