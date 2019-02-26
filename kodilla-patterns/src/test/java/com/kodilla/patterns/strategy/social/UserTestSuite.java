package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User sebastian = new Millenials("Sebastian");
        User brajan = new YGeneration("Brajan");
        User milan = new ZGeneration("Milan");

        //When
        String millenialsPublisher = sebastian.getSocialPublisher().share();
        String ygenPublisher = brajan.getSocialPublisher().share();
        String zgenPublisher = milan.getSocialPublisher().share();

        //Then
        Assert.assertEquals("Facebook", millenialsPublisher);
        Assert.assertEquals("Twitter", ygenPublisher);
        Assert.assertEquals("Snapchat", zgenPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User sebastian = new Millenials("Sebastian");
        System.out.println("Domyślne social media to: " + sebastian.getSocialPublisher().share());

        //When
        sebastian.setSocialPublisher(new SnapchatPublisher());
        String millenialsPublisher = sebastian.getSocialPublisher().share();

        //Then
        System.out.println("Zmieniłeś ustawienia na: " + sebastian.getSocialPublisher().share());
        Assert.assertEquals("Snapchat", millenialsPublisher);
    }
}
