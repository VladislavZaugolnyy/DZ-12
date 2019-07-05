package com.trckstr;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        String[] names = new String[10];
        names[0] = "Vladislav";
        names[1] = "Andrew";
        names[2] = "Anton";
        names[3] = "Arsen";
        names[4] = "Artur";
        names[5] = "Dmitry";
        names[6] = "Sergei";
        names[7] = "Oleg";
        names[8] = "Igor";
        names[9] = "Vitaly";

        String[] lastNames = new String[10];
        lastNames[0] = "Astahov";
        lastNames[1] = "Bakin";
        lastNames[2] = "Galushkin";
        lastNames[3] = "Dyatlov";
        lastNames[4] = "Efimov";
        lastNames[5] = "Zhdanov";
        lastNames[6] = "Zaicev";
        lastNames[7] = "Isaev";
        lastNames[8] = "Kozin";
        lastNames[9] = "Lavrov";

        Person[] people = new Person[100];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(names[random.nextInt(names.length)],
                    lastNames[random.nextInt(lastNames.length)],
                    random.nextInt(41) + 20,
                    random.nextInt(51) + 50,
                    random.nextInt(41) + 160);
            System.out.println(people[i]);
        }
    }
}

