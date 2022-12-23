package com.example.passwords;

public class Decryptor {

    public void decryptPassword(int key, String encryptedPassword) {
        char[] chars = encryptedPassword.toCharArray();
        for (char c : chars) {
            c -= key;
            System.out.print(c);
        }

        encryptedPassword = new String(chars);

        System.out.println(" ");
        System.out.println(encryptedPassword);
    }
}
