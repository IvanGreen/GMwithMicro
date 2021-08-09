package com.greencode.greenmarketproductservice.service;

import com.greencode.GreenMarket.entities.Product;
import com.greencode.GreenMarket.services.microservices.FindPageable;
import com.greencode.greenmarketproductservice.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MicroProductsService implements IMicroProductService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public Page<Product> findAll(FindPageable findPageable){
        Specification<Product> spec = findPageable.getSpec();
        Pageable pageable = findPageable.getPageable();
        return productsRepository.findAll(spec,pageable);
    }

    @Override
    public Product getOneById(Long id) { return productsRepository.getById(id); }

    @Override
    public List<Product> getAllProducts() { return productsRepository.findAll(); }

    @Override
    public Product saveProduct(Product product) { return productsRepository.save(product); }

    @Override
    public void deleteAll() { productsRepository.deleteAll(); }

    @Override
    public void deleteOne(Long id) { productsRepository.deleteById(id); }

    @Override
    public void updateOne(Product product){
        Product oldProduct = productsRepository.getById(product.getId());

        if (product.getTitle() != null) oldProduct.setTitle(product.getTitle());
        if (product.getPrice() != 0) oldProduct.setPrice(product.getPrice());

        saveProduct(oldProduct);
    }
}
