package vn.techmaster.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.techmaster.demo.model.Products;
import vn.techmaster.demo.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public String getProducts(Model model) {
        List<Products> products = productService.getAllProducts();
        model.addAttribute("products",products);
        return "AllProducts";
    }
    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id, Model model) {
        Products Product = productService.getProductById(id);
        System.out.println(Product);
        model.addAttribute("product",Product);
        return "id";
    }

    @GetMapping("/search/{name}")
    public String getProducts(@PathVariable String name, Model model) {
        List<Products> products = productService.getProductsByName(name);
        model.addAttribute("products",products);
        return "SearchProducts";
    }

}
