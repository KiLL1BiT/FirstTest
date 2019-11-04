package com.automationpractice.helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class StringGenerator {
    public String StringGenerator(String random) {
            random = RandomStringUtils.randomAlphabetic(10);
        return random;
    }
}
