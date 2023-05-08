package model;

import utils.DateUtils;

import java.util.Date;

public class Product {
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

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public ECategory geteCategory() {
        return eCategory;
    }

    public void seteCategory(ECategory eCategory) {
        this.eCategory = eCategory;
    }


}
