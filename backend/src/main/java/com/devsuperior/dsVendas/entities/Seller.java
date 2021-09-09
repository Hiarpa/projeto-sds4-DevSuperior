package com.devsuperior.dsVendas.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;

    @OneToMany(mappedBy = "seller")
    private List<Sale> sales;

    public Seller(){
    }

    public Seller(Long id, String name, List<Sale> sales) {
        Id = id;
        this.name = name;
        this.sales = sales;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sale> getListSale() {
        return sales;
    }

}
