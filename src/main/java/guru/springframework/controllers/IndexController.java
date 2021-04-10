package guru.springframework.controllers;

import guru.springframework.services.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class IndexController {

    ProductServiceImpl productService;

    public IndexController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model){
        model.addAttribute("productsList", productService.listProducts());

        return "index";
    }
}
