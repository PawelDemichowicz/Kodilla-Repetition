package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product milk = new Product("Milk");
        Product flour = new Product("Flour");
        Product wheat = new Product("Wheat");

        Item item1 = new Item(new BigDecimal(5), 150, new BigDecimal(750));
        Item item2 = new Item(new BigDecimal(4), 100, new BigDecimal(400));
        Item item3 = new Item(new BigDecimal(3), 200, new BigDecimal(600));

        Invoice invoice = new Invoice("01/2019");

        item1.setProduct(milk);
        item2.setProduct(flour);
        item3.setProduct(wheat);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        productDao.save(milk);
        int productOneId = milk.getId();
        productDao.save(flour);
        int productTwoId = flour.getId();
        productDao.save(wheat);
        int productThreeId = wheat.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assertions.assertNotEquals(0, invoiceId);

        //CleanUp
//        try {
//            invoiceDao.deleteById(invoiceId);
//        } catch (Exception e) {
//            //do nothing
//        }
    }
}
