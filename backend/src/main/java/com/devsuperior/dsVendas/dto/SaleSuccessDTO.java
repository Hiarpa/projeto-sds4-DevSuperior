package com.devsuperior.dsVendas.dto;

import com.devsuperior.dsVendas.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private String sellerName;
    private Long deals;
    private Long visited;

    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(Seller seller, Long deals, Long visited) {
        sellerName = seller.getName();
        this.deals = deals;
        this.visited = visited;
    }

    public SaleSuccessDTO(String sellerName, Long deals, Long visited) {
        this.sellerName = sellerName;
        this.deals = deals;
        this.visited = visited;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }
}
