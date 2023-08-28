package org.onlinebookstore.com.onlinebookstore.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartDTO {
    private String bookName;
    private int quantity;
    private double price;
}
