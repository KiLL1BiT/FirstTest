package com.automationpractice.tests;


import org.junit.Assert;
import org.junit.Test;

public class SomeTest extends BaseTest {

    @Test
    public void SiteVerification() {
        Assert.assertEquals("My Store", driver.getTitle());
    }

}
