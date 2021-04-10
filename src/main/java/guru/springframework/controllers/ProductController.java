package guru.springframework.controllers;

import guru.springframework.services.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class ProductController {

    ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String getProduct() {
        return "index";
    }

    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model) {
        model.addAttribute("prod", productService.getProduct(id));

        return "product";
    }
}
