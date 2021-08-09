package com.greencode.GreenMarket.services.microservices;

import com.greencode.GreenMarket.entities.Product;
import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

@Data
public class FindPageable {
    private Specification<Product> spec;
    Pageable pageable;

    public FindPageable(Specification<Product> spec, Pageable pageable) {
        this.spec = spec;
        this.pageable = pageable;
    }
}
