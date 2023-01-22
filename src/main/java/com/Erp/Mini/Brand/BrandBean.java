package com.Erp.Mini.Brand;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BrandBean {

    public BrandBean() {
    }

    public BrandBean(int brand_id, String brand_name, String brand_code) {
        this.brand_id = brand_id;
        Brand_name = brand_name;
        Brand_code = brand_code;
    }

    @Override
    public String toString() {
        return "BrandBean{" +
                "brand_id=" + brand_id +
                ", Brand_name='" + Brand_name + '\'' +
                ", Brand_code='" + Brand_code + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    private int brand_id;
    private String Brand_name;
    private String Brand_code;

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return Brand_name;
    }

    public void setBrand_name(String brand_name) {
        Brand_name = brand_name;
    }

    public String getBrand_code() {
        return Brand_code;
    }

    public void setBrand_code(String brand_code) {
        Brand_code = brand_code;
    }
}
