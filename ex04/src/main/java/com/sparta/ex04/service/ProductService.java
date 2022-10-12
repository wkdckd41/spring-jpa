package com.sparta.ex04.service;

import com.sparta.ex04.models.Product;
import com.sparta.ex04.models.ProductMypriceRequestDto;
import com.sparta.ex04.models.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service

public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public  Long update(Long id, ProductMypriceRequestDto requestDto) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 없습니다")
        );
        product.update(requestDto);
        return  id;
    }
}
