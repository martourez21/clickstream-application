package com.nestorworks.productsales;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSales implements Serializable {

    @JsonProperty
    private Double price;
    @JsonProperty
    private String productName;
}
