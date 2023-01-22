package com.Erp.Mini.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CustomerBean {
    @Override
    public String toString() {
        return "CustomerBean{" +
                "cus_id=" + cus_id +
                ", cus_name='" + cus_name + '\'' +
                ", cus_code='" + cus_code + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    private int cus_id;

    public CustomerBean(int cus_id, String cus_name, String cus_code) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_code = cus_code;
    }

    private String cus_name;
    private String cus_code;

    public CustomerBean() {
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_code() {
        return cus_code;
    }

    public void setCus_code(String cus_code) {
        this.cus_code = cus_code;
    }
}
