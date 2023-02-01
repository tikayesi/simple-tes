package com.enigma.example.service;

import com.enigma.example.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product getProductById(String id);
    public Product saveProduct(Product product);
    public void delete(String id);
    public Page<Product> getProductPerPage(Pageable pageable);
    List<Product> findProductMinStock();

}
