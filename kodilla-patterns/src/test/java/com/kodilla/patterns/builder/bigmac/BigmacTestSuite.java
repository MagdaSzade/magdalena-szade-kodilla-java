package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBogmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("pszenna")
                .burgers(3)
                .ingredient("ogórek")
                .ingredient("pieczarki")
                .build();
        System.out.println(bigmac);

        //When
        int amountOfIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, amountOfIngredients);
    }
}
