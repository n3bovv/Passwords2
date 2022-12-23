package com.example.passwords;

import static com.example.passwords.Main.generateRandomPassword;

public class Encryptor {

    public String getPassword() {
        return password;
    }

    private String password;

    private void generatePassword(int len) {
        password = generateRandomPassword(len);
        System.out.print(password);
    }
    public String encryptPassword() {
        generatePassword(15);

        int key = 5;

        System.out.println(" ");

        char[] chars = password.toCharArray();
        for (char c : chars) {
            c += key;
            System.out.print(c);
        }

        password = new String(chars);

        return password;
    }

}
