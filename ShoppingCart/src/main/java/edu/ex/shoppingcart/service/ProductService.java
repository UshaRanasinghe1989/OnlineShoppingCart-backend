package edu.ex.shoppingcart.service;

import edu.ex.shoppingcart.model.Product;

import java.util.List;

public interface ProductService {
    //SAVE NEW PRODUCT
    Product persist(Product product);

    //FIND ALL PRODUCTS
    List<Product> findAll();

    //UPDATE AN EXISTING PRODUCT
    void update(Product product, Long id);

    //DELETE AN EXISTING PRODUCT
    void delete(Long id);

    //FIND A PRODUCT BY ID
    Product findById(Long id);

    //FIND BY PRODUCT NAME
    List<Product> findByProductName(String productName);

    //FIND PRODUCTS BY BRAND NAME
    List<Product> findByBrandName(String brandName);

    //FIND PRODUCTS BY CATEGORY NAME
    List<Product> findByCategoryName(String categoryName);

    //FIND PRODUCTS BY BRAND AND CATEGORY
    List<Product> findByBrandAndCategory(String brand, String category);
}
