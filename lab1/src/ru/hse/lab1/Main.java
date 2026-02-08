package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/*
@author - Райцын Роман Вадимович
@version - 1.0
@since - 2026
*/

public class Main {
    public static void main(String[] args) {
        Person Ivan = new Person("Ivan", 55.6f, 170);
        System.out.println("\n" + Ivan.height);
    }
}
