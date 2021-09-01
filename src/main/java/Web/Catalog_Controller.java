package Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Catalog_Controller {
    @GetMapping("/{name}")
    public String getSomeData(@PathVariable Integer id, @PathVariable Double price) {
        return "enter your name" + id;
    }
}
