package com.example.passwords;

import java.security.SecureRandom;
import java.util.Arrays;


public class Main {


    public static String generateRandomPassword(int len) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Encryptor encryptor = new Encryptor();


        Decryptor decryptor = new Decryptor();
        decryptor.decryptPassword(5, encryptor.encryptPassword());

    }
}