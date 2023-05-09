package model;

import utils.DateUtils;

import java.util.Date;

public class Product implements IModel {
    private long id;
    private String name;
    private String description;
    private double price;
    private Date creatAt;
    private ECategory eCategory;

    public Product() {
    }

    public Product(long id, String name, String description, double price, Date creatAt, ECategory eCategory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.creatAt = creatAt;
        this.eCategory = eCategory;
    }

    @Override
    public void parseData(String line) {
        String[] items = line.split(",");
        long idProduct = Long.parseLong(items[0]);
        double priceProduct = Float.parseFloat(items[3]);
        Date createAt = DateUtils.parse(items[4]);
        ECategory eCategory = ECategory.getECategoryByName(items[5]);
//        Product p = new Product(idProduct, items[1], items[2], priceProduct, createAt, eCategory);
        this.setId(idProduct);
        this.setName(items[1]);
        this.setDescription(items[2]);
        this.setPrice(priceProduct);
        this.setCreateAt(createAt);
        this.setECategory(eCategory);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s", id, name, description,price, DateUtils.format(creatAt), eCategory);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreateAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public ECategory getECategory() {
        return eCategory;
    }

    public void setECategory(ECategory eCategory) {
        this.eCategory = eCategory;
    }


}
