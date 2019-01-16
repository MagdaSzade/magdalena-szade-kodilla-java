package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {
    private int itemId;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = this.price.multiply(new BigDecimal(this.quantity));
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID")
    public int getItemId() {
        return this.itemId;
    }

   @ManyToOne
   @JoinColumn(name = "PRODUCT")
   public Product getProduct() {
        return this.product;
    }

   @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return this.price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return this.quantity;
    }

    @Transient
    public BigDecimal getValue() {
        return this.value;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE")
    public Invoice getInvoice() {
        return this.invoice;
    }

    private void setItemId(int itemId){
       this.itemId = itemId;
    }

    private void setProduct(Product product){
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
        this.setValue();
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
        this.setValue();
    }

    private void setValue() {
        this.value = this.price.multiply(new BigDecimal(this.quantity));
    }

    private void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

}