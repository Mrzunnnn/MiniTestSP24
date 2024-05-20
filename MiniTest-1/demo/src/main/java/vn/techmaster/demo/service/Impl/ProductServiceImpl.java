package vn.techmaster.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.techmaster.demo.dao.ProductDAO;
import vn.techmaster.demo.model.Products;
import vn.techmaster.demo.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;
    @Override
    public List<Products> getAllProducts() {
        return productDAO.findAll();
    }

    @Override
    public Products getProductById(int id) {
        return productDAO.findId(id);
    }

    @Override
    public List<Products> getProductsByName(String name) {
        return productDAO.findByName(name);
    }


}
