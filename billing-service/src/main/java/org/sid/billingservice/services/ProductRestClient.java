package org.sid.billingservice.services;

import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.print.Pageable;

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductRestClient {
    @GetMapping(path = "/products/{id}")
    Product findProductById(@PathVariable("id") Long id);
    @GetMapping(path = "/products")
    PagedModel<Product> AllProducts();
}
