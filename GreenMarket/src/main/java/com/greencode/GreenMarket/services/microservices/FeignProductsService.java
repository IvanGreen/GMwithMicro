package com.greencode.GreenMarket.services.microservices;

import com.greencode.GreenMarket.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("green-market-product-service")
public interface FeignProductsService {
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
