package com.example.uri2606.service;

import com.example.uri2606.dto.ProductsDto;
import com.example.uri2606.entities.Products;
import com.example.uri2606.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Transactional(readOnly = true)
    public ProductsDto findAllById(Long id){
        Products products = productRepository.getReferenceById(id);
        return new ProductsDto(products);
    }

    @Transactional(readOnly = true)
    public Page<ProductsDto> findAll(Pageable pageable){
        Page<Products> products = productRepository.findAll(pageable);
        return products.map(product -> new ProductsDto(product));
    }


}
