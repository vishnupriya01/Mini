package com.Erp.Mini.Customer;

import com.Erp.Mini.Supplier.SupplierBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerBean,Integer> {
}
