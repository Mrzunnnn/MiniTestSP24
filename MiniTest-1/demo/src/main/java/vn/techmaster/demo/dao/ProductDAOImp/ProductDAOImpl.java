package vn.techmaster.demo.dao.ProductDAOImp;

import org.springframework.stereotype.Repository;
import vn.techmaster.demo.dao.ProductDAO;
import vn.techmaster.demo.database.ProductDB;
import vn.techmaster.demo.model.Products;

import java.util.List;
@Repository
public class ProductDAOImpl implements ProductDAO {
    @Override
    public List<Products> findAll() {
        return ProductDB.products;
    }

    @Override
    public Products findId(int id) {
        return findAll().stream()
                .filter(b->b.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Products> findByName(String name) {
        return findAll().stream()
                .filter(b->b.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }
}
