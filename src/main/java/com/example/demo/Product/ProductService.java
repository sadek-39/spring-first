package com.example.demo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepo.saveAll(products);
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }
}
