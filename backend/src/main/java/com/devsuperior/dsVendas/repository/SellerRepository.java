package com.devsuperior.dsVendas.repository;

import com.devsuperior.dsVendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
