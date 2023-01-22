package com.Erp.Mini.ProductCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CategoryBean {

    public CategoryBean() {
    }

    public CategoryBean(int category_id, String category_name, String category_code, int brand_key) {
        this.category_id = category_id;
        Category_name = category_name;
        Category_code = category_code;
        this.brand_key = brand_key;
    }

    @Override
    public String toString() {
        return "CategoryBean{" +
                "category_id=" + category_id +
                ", Category_name='" + Category_name + '\'' +
                ", Category_code='" + Category_code + '\'' +
                ", brand_key=" + brand_key +
                '}';
    }

    @Id
    @GeneratedValue
    private int category_id;
    private String Category_name;
    private String Category_code;
    private int brand_key;
    private String brand_name;

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getBrand_key() {
        return brand_key;
    }

    public void setBrand_key(int brand_key) {
        this.brand_key = brand_key;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return Category_name;
    }

    public void setCategory_name(String category_name) {
        Category_name = category_name;
    }

    public String getCategory_code() {
        return Category_code;
    }

    public void setCategory_code(String category_code) {
        Category_code = category_code;
    }
}
