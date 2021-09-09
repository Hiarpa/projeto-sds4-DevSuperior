package com.devsuperior.dsVendas.services;


import com.devsuperior.dsVendas.dto.SaleDTO;
import com.devsuperior.dsVendas.entities.Sale;
import com.devsuperior.dsVendas.repository.SaleRepository;
import com.devsuperior.dsVendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SaleService {

    @Autowired
    public SaleRepository saleRepository;

    @Autowired
    public SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
