package service;

import utils.DateUtils;
import model.ECategory;
import model.Product;
import utils.FileUtils;

import java.io.*;
import java.util.*;

public class ProductServiceInFile {
    private final String path = "D:\\Module_2\\casetemplate\\data\\product.csv";
    public String getPath(){
        return path;
    }
    private Scanner scanner = new Scanner(System.in);

    //Đọc sản phẩm từ file
    public List<Product> findAllProduct(){
        List<Product> products = FileUtils.readFile(path, Product.class);
        return products;
    }
    public Product findProduct(long idProduct){
        List<Product> products = findAllProduct();
        for (Product product: products){
            if (product.getId() == idProduct){
                System.out.println(product);
                return product;
            }
        }
        return null;
    }

    //Thêm sản phẩm và ghi vào file
    public void addProduct(Product product) {
        List<Product> products = findAllProduct();
        products.add(product);
        FileUtils.writeProductToFile(path, products);
    }
    //Ghi sản phẩm vào file


    public void editProduct(long idProduct, Product product) {
        List<Product> products = findAllProduct();
        for (Product p: products){
            if (p.getId() == idProduct){
                p.setName(product.getName());
                p.setDescription(product.getDescription());
                p.setPrice(product.getPrice());
                p.setCreateAt(product.getCreatAt());
                p.setECategory(product.getECategory());
            }
        }
        FileUtils.writeProductToFile(path, products);
    }
    public void removeProduct() {
        List<Product> products = findAllProduct();

        System.out.println("Nhập ID cần xoá:");
        long idRemove = Long.parseLong(scanner.nextLine());

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
//            Product product = iterator.next();
            if (idRemove == iterator.next().getId()) {
                iterator.remove();
            }
        }
        FileUtils.writeProductToFile(path, products);


    }
}
