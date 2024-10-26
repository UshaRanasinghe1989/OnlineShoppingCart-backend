package edu.ex.shoppingcart.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ex.shoppingcart.model.Product;
import edu.ex.shoppingcart.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ObjectMapper mapper;

    @Override
    public Product persist(Product product) {
        return product;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void update(Product product, Long id) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public List<Product> findByProductName(String productName) {
        return null;
    }

    @Override
    public List<Product> findByBrandName(String brandName) {
        return null;
    }

    @Override
    public List<Product> findByCategoryName(String categoryName) {
        return null;
    }

    @Override
    public List<Product> findByBrandAndCategory(String brand, String category) {
        return null;
    }
}
