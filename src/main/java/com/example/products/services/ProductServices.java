package com.example.products.services;
import com.example.products.models.ProductModel;
import com.example.products.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductServices {
    private final ProductRepository repo;

    public ProductServices(ProductRepository repo) {
        this.repo = repo;
    }
    public ProductModel addProduct(ProductModel product) {
        return repo.save(product);
    }
    public List<ProductModel> getProducts() {
        return repo.findAll();
    }
    public ProductModel updateProduct(String id, ProductModel product) {
        ProductModel existing = repo.findById(id).orElseThrow();
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        return repo.save(existing);
    }

    public void deleteProduct(String id) {
        repo.deleteById(id);
    }
}
