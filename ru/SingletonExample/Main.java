package ru.SingletonExample;

import static ru.SingletonExample.SingletonExample.getInstance;
import static ru.SingletonExample.SingletonExample.number;

public class Main {

    public static void main(String[] args) {
        SingletonExample a = getInstance();
        System.out.println(number);

        SingletonExample b = getInstance();
        System.out.println(number);

        SingletonExample c = getInstance();
        System.out.println(number);
    }
}
