package com.example.product_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequestDTO {

    @NotBlank(message = "Product name must not be empty")
    private String name;

    private String description;

    @Positive(message = "Price must be positive")
    private double price;
}
