package com.matury.phonbook;

import com.matury.phonbook.services.PhonBook;

public class ApplicationRunner {

    public static void main(String[] args) {
        PhonBook phonBook = new PhonBook();
        phonBook.run();
    }

}