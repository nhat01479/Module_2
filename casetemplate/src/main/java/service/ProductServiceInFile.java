package service;

import utils.DateUtils;
import model.ECategory;
import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductServiceInFile {
    //Đọc sản phẩm từ file
    public List<Product> findAllProduct(){
        List<Product> products = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\test\\Test\\casetemplate\\data\\product.csv"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                String[] items = line.split(",");
                long idProduct = Long.parseLong(items[0]);
                double priceProduct = Double.parseDouble(items[3]);
                Date createAt = DateUtils.parse(items[4]);
                ECategory eCategory = ECategory.getECategoryByName(items[5]);

                Product p = new Product(idProduct, items[1], items[2], priceProduct, createAt, eCategory);
                products.add(p);
            }
            bufferedReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return products;
    }

    //Thêm sản phẩm và ghi vào file
    public void addProduct(Product product) {
        List<Product> products = findAllProduct();
        products.add(product);
        writeProductToFile(products);
    }
    //Ghi sản phẩm vào file
    public void writeProductToFile(List<Product> products){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\test\\Test\\casetemplate\\data\\product.csv"));
            for (Product product: products){
                bufferedWriter.write(product.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
