package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int invoiceId;
    private String number;
    private List<Item> items;

    private Invoice(){
    }

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID")
    public int getInvoiceId(){
        return this.invoiceId;
    }

    @Column(name = "NUMBER")
    public String getNumber() {
        return this.number;
    }

    @OneToMany (
        targetEntity = Item.class,
        mappedBy = "invoice",
        cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
        public List<Item> getItems() {
        return this.items;
    }

    private void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}
