package com.jwt.jwttest.repository;

import com.jwt.jwttest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Tìm sản phẩm theo tên
    Optional<Product> findByName(String name);

    // Tìm sản phẩm có giá lớn hơn một mức giá nào đó
    List<Product> findByPriceGreaterThan(double price);
}
