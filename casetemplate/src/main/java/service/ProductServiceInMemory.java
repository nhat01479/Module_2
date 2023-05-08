package service;

import utils.DateUtils;
import model.ECategory;
import model.Product;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceInMemory {
    private List<Product> products;
//Chưa dùng
    public ProductServiceInMemory(List<Product> products) {
        this.products = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat();

        products.add(new Product(System.currentTimeMillis()%1000, "Iphone 11", "dep lam 11",
                1000.0f, DateUtils.parse("08-05-2023 10:40"), ECategory.PHONE));

        products.add(new Product(System.currentTimeMillis()%1000, "Iphone 12", "dep lam 12",
                3000.0f, DateUtils.parse("15-05-2023 10:40"), ECategory.PHONE));
        products.add(new Product(System.currentTimeMillis()%1000, "Ipad 2", "dep lam Ipad 2",
                2000.0f, DateUtils.parse("10-05-2023 10:40"), ECategory.TABLE));
    }
    public List<Product> findAllProducts(){
        return this.products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
}
