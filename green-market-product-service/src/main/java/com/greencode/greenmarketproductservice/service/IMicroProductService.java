package com.greencode.greenmarketproductservice.service;

import com.greencode.GreenMarket.entities.Product;
import com.greencode.GreenMarket.services.microservices.FindPageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface IMicroProductService {
    @RequestMapping("/findAll")
    Page<Product> findAll(FindPageable findPageable);

    @RequestMapping("/getOneById")
    Product getOneById(Long id);

    @RequestMapping("/getAllProducts")
    List<Product> getAllProducts();

    @RequestMapping("/saveProduct")
    Product saveProduct(Product product);

    @RequestMapping("/deleteAll")
    void deleteAll();

    @RequestMapping("/deleteOne")
    void deleteOne(Long id);

    @RequestMapping("/updateOne")
    void updateOne(Product product);
}
