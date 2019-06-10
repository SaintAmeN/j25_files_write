package com.javagda25.files_example.write;

import java.io.File;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MainFile {
    public static void main(String[] args) {


        // windows: /c/Users/Nazwa_uz/IdeaProjects - absolutna
        // /c/Users/Nazwa_uz/IdeaProjects/j25_files_write - absolutna
        // ../ - relatywna sciezka - wskazuje mi na katalog /c/Users/Nazwa_uz/IdeaProjects/

        // Temporary
//         . -
        File plik = new File("plik.txt");
        System.out.println();
        System.out.println(plik.getAbsolutePath());
        System.out.println("Plik istnieje: " + plik.exists());
        System.out.println("Plik jest katalogiem: " + plik.isDirectory());

        File plikPom = new File("pom.xml");
        System.out.println();
        System.out.println(plikPom.getAbsolutePath());
        System.out.println("Plik pom istnieje: " + plikPom.exists());
        System.out.println("Plik pom jest katalogiem: " + plikPom.isDirectory());

        File katalogWKtorymJestesmy = new File(".");
        System.out.println();
        System.out.println(katalogWKtorymJestesmy.getAbsolutePath());
        System.out.println("Katalog projektu istnieje: " + katalogWKtorymJestesmy.exists());
        System.out.println("Katalog projektu katalogiem: " + katalogWKtorymJestesmy.isDirectory());

        Timestamp timestamp = new Timestamp(katalogWKtorymJestesmy.lastModified());
        LocalDateTime localDateTime = timestamp.toLocalDateTime();
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault());

        System.out.println(localDateTime);

    }
}
