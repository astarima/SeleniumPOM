package utils;

import com.github.javafaker.Faker;

public class DataGenerator {
    static Faker faker = new Faker();

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomPassword() {
        return faker.internet().password(4, 20, true, true);
    }

    public static String getRandomName() {
        return faker.name().firstName();
    }
    public static String getRandomLastName() {
        return faker.name().lastName();
    }
    public static String getRandomPhone() { return faker.phoneNumber().phoneNumber();}
    public static String getRandomStreet() { return faker.address().streetAddress();}
    public static String getRandomCity() { return faker.address().city();}
    public static String getRandomPostCode() { return faker.address().countryCode();}
}
