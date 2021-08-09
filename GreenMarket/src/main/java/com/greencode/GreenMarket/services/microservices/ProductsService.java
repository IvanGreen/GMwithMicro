package com.greencode.GreenMarket.services.microservices;

import com.greencode.GreenMarket.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private FeignProductsService feignProductsService;


    public Page<Product> findAll(Specification<Product> spec, Pageable pageable){
        FindPageable findPageable = new FindPageable(spec,pageable);
        return feignProductsService.findAll(findPageable);
    }

    public Product getOneById(Long id) { return feignProductsService.getOneById(id); }

    public List<Product> getAllProducts() { return feignProductsService.getAllProducts(); }

    public Product saveProduct(Product product) { return feignProductsService.saveProduct(product); }

    public void deleteAll() { feignProductsService.deleteAll(); }

    public void deleteOne(Long id) { feignProductsService.deleteOne(id); }

    public void updateOne(Product product){
        feignProductsService.updateOne(product);
    }

}
