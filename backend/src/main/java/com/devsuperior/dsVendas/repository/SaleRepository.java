package com.devsuperior.dsVendas.repository;

import com.devsuperior.dsVendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}
