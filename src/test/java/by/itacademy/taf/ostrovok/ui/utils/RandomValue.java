package by.itacademy.taf.ostrovok.ui.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValue {
    public static String randomValidEmail = RandomStringUtils.randomAlphabetic(3, 12) + "@gmail.com";
    public static String randomInValidEmail = RandomStringUtils.randomAlphabetic(3, 12);
}
