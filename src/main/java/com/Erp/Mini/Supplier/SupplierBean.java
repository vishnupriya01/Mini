package com.Erp.Mini.Supplier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SupplierBean {
    @Id
    @GeneratedValue
    private int sup_id;

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_Person() {
        return contact_Person;
    }

    public void setContact_Person(String contact_Person) {
        this.contact_Person = contact_Person;
    }

    public String getContact_No() {
        return contact_No;
    }

    public void setContact_No(String contact_No) {
        this.contact_No = contact_No;
    }

    public String getNature() {
        return Nature;
    }

    public void setNature(String nature) {
        Nature = nature;
    }

    public double getOpening_Balance() {
        return opening_Balance;
    }

    public void setOpening_Balance(double opening_Balance) {
        this.opening_Balance = opening_Balance;
    }

    public int getMax_credit_days() {
        return max_credit_days;
    }

    public void setMax_credit_days(int max_credit_days) {
        this.max_credit_days = max_credit_days;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getGST_No() {
        return GST_No;
    }

    public void setGST_No(String GST_No) {
        this.GST_No = GST_No;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }


    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getSupplier_Location_id() {
        return supplier_Location_id;
    }

    public void setSupplier_Location_id(int supplier_Location_id) {
        this.supplier_Location_id = supplier_Location_id;
    }

    public boolean isActive_status() {
        return active_status;
    }

    public void setActive_status(boolean active_status) {
        this.active_status = active_status;
    }

    private String sup_name;
    private String sup_code;
    private String mobile_no;
    private String email;
    private String contact_Person;
    private String contact_No;
    private String Nature;
    private double opening_Balance;
    private int max_credit_days;
    private String address1;
    private String address2;
    private String address3;
    private String GST_No;
    private int country_id;
    private int state_id;

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    private int city_id;
    private String pinCode ;
    private int supplier_Location_id;
    private boolean active_status;

    public SupplierBean() {
    }

    public int getSup_id() {
        return sup_id;
    }

    public void setSup_id(int sup_id) {
        this.sup_id = sup_id;
    }

    public String getSup_name() {
        return sup_name;
    }

    public void setSup_name(String sup_name) {
        this.sup_name = sup_name;
    }

    public String getSup_code() {
        return sup_code;
    }

    public void setSup_code(String sup_code) {
        this.sup_code = sup_code;
    }

    public SupplierBean(int sup_id, String sup_name, String sup_code) {
        this.sup_id = sup_id;
        this.sup_name = sup_name;
        this.sup_code = sup_code;
    }
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;
}
