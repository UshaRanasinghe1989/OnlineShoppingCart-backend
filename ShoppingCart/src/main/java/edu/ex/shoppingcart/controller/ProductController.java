package edu.ex.shoppingcart.controller;

import edu.ex.shoppingcart.model.Product;
import edu.ex.shoppingcart.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping("")
    Product persist(@RequestBody Product product){
        return service.persist(product);
    }
}
