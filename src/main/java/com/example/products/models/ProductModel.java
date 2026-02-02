package com.example.products.models;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class ProductModel {
    @Id
    private String id;
    @Min(1)
    private int price;
    @NotBlank(message = "Name cannot be blank!")
    private String name;
    private String category;
    private int quantity;
}
