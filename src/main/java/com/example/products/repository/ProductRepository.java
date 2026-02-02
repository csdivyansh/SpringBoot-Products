package com.example.products.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.products.models.ProductModel;
public interface ProductRepository extends MongoRepository<ProductModel, String> {

}
