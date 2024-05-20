package vn.techmaster.demo.utils.file;

import vn.techmaster.demo.model.Products;

import java.util.List;

public interface IFileReaderProduct {
    List<Products> readFile(String filePath);
}
