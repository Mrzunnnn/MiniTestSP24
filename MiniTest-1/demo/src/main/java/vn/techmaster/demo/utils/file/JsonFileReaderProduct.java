package vn.techmaster.demo.utils.file;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import vn.techmaster.demo.model.Products;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Component
public class JsonFileReaderProduct implements IFileReaderProduct{
    @Override
    public List<Products> readFile(String filePath) {
        System.out.println("Read data from JSON file");
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Products> products = mapper.readValue(new File(filePath), new TypeReference<List<Products>>() {});
            return products;
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();  // Trả về danh sách rỗng nếu có lỗi xảy ra
        }
    }
}
