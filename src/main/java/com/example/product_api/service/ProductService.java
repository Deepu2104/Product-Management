package com.example.product_api.service;

import com.example.product_api.dto.ProductRequestDTO;
import com.example.product_api.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getProductById(Long id);

    ProductResponseDTO createProduct(ProductRequestDTO productDTO);

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO productDTO);

    void deleteProduct(Long id);
}
