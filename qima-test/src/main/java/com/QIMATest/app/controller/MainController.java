package com.QIMATest.app.controller;
import com.QIMATest.app.model.Product;
import com.QIMATest.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
@RequestMapping("/products")
public class MainController {
    private final ProductService productService;
    @Autowired
    public MainController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }
    @GetMapping("/{id}")
    public String getProductById(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product";
    }

    @GetMapping("/{id}/edit")
    public String showEditProductForm(@PathVariable Long id, Model model) {
    Product product = productService.getProductById(id);
    if (product == null) {
        return "redirect:/products"; // Or show an error page
    }
    model.addAttribute("product", product);
    return "editProduct"; // Assuming you have an editProduct.html in your templates
    }

    @PostMapping
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/products";
    }

    @PostMapping("/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute Product product) {
    productService.updateProduct(id, product);
    return "redirect:/products";
    }

    @PostMapping("/{id}/delete")
    public String deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
    return "redirect:/products";
    }
}