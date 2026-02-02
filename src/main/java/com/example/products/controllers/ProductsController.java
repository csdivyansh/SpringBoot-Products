package com.example.products.controllers;
import com.example.products.models.ProductModel;
import com.example.products.services.ProductServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductsController {
    private final ProductServices service;

    public ProductsController(ProductServices service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ProductModel addProduct(@Valid @RequestBody ProductModel product) {
        return service.addProduct(product);
    }

    @GetMapping("/products")
    public List<ProductModel> getProducts() {
        return service.getProducts();
    }

    @PutMapping("/update/{id}")
    public ProductModel updateProduct(@PathVariable String id, @RequestBody ProductModel product) {
        return service.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable String id) {
        service.deleteProduct(id);
        return "Deleted";
    }
}
