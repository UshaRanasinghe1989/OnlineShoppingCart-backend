package edu.ex.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {
    private Long id;
    private String fileName;
    private String fileType;
    private Blob image;
    private String downloadUrl;
}
