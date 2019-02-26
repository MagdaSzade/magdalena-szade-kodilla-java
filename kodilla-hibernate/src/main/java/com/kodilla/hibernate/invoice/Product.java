package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int productId;
    private String name;
    private List<Item> itemsList;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getProductId() {
        return this.productId;
    }

    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItemsList() {
        return itemsList;
    }

    private void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    private void setProductId(int id) {
        this.productId = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
