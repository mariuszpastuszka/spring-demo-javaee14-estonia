package com.sda.springdemojavaee14.homework.optional;

import java.util.Optional;

public class OptionalExerciseMain {

    public static void main(String[] args) {
        int nickLength = personNick() != null ? personNick().length() : 0;

        System.out.println("nick length is: " + nickLength);

        Optional<String> maybeNick = personNickIfPresent();
        if (maybeNick.isPresent()) {
            System.out.println(maybeNick.get());
        } else {
            System.out.println("Sorry, no nick");
        }

    }
    // In Kotlin Language: String (never null) and String?
    public static String personNick() {
        return null;
    }

    // Optional is bag for just one item
    // we're using "factory methods" for creating instances of this class
    // factory method - is static method which is able to produce instances of classes and have good name
    public static Optional<String> personNickIfPresent() {
        return Optional.empty();
    }
}
