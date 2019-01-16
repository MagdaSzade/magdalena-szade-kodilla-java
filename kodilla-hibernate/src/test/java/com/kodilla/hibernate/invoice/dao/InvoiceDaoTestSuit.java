package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuit {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Item item1 = new Item(product1, new BigDecimal("150"), 1);
        Item item2 = new Item(product2, new BigDecimal("250"), 2);
        Item item3 = new Item(product3, new BigDecimal("350"), 3);
        Item item4 = new Item(product1, new BigDecimal("150"), 4);
        Item item5 = new Item(product2, new BigDecimal("250"), 5);
        Item item6 = new Item(product3, new BigDecimal("350"), 6);

        ArrayList<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(item1);
        itemsList1.add(item2);
        itemsList1.add(item3);
        ArrayList<Item> itemsList2 = new ArrayList<>();
        itemsList2.add(item1);
        itemsList2.add(item2);
        itemsList2.add(item3);

        Invoice invoice1 = new Invoice("F-vat nr 1", itemsList1);
        Invoice invoice2 = new Invoice("F-vat nr 1", itemsList1);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);
        itemDao.save(item6);

        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        int invoiceId1 = invoice1.getInvoiceId();
        int invoiceId2 = invoice2.getInvoiceId();

        System.out.println(invoiceId1);
        System.out.println(invoiceId2);

        //Then
        Assert.assertNotEquals(0, invoiceId1);
        Assert.assertNotEquals(0, invoiceId2);

    }
}
