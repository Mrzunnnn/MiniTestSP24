package vn.techmaster.demo.dao;

import vn.techmaster.demo.model.Products;

import java.util.List;

public interface ProductDAO {
    List<Products> findAll();
    Products findId(int id);
    List<Products> findByName(String name);

}
