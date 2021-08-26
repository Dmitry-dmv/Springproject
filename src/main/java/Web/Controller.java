package Web;

import Entity.Customer;
import dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/{login}")
    public String getSomeData(@PathVariable Integer id, @PathVariable String login) {
        return "enter your username" + id;
    }

    @GetMapping("/password")
    public List<Customer> getAll() {
        return Customer.getAll();
    }
    @PostMapping
    public Customer create(@RequestBody CustomerDto dto) {
        return Customer.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        Customer.delete(id);
    }

}

