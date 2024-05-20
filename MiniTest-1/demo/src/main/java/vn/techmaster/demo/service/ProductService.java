package vn.techmaster.demo.service;

import vn.techmaster.demo.model.Products;

import java.util.List;

public interface ProductService {
    List<Products> getAllProducts();
    Products getProductById(int id);
    List<Products> getProductsByName(String name);
}

