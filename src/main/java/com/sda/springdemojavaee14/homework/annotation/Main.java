package com.sda.springdemojavaee14.homework.annotation;

public class Main {

    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("mariusz");
        me.setSurname("p.");
        me.setAge(39);

        System.out.println("me: " + me.toString());

        PersonWithAllSourceCode anotherMe = new PersonWithAllSourceCode("mariusz", "p.", 39);
        System.out.println("another me: " + anotherMe);

        System.out.println("Are those two references refer to the same object?: " + (me == anotherMe));
        System.out.println("is this the same person? - " + me.equals(anotherMe));

        System.out.println("are equals: " + me.equals("haha"));

        Person meAgain = new Person("mariusz", "Pastuszka", 39);
        // builder is better than all args constructor - because You can see more:)
        Person meAgainWithBuilder = Person.builder()
                .age(39)
                .surname("Pastuszka")
                .name("Mariusz")
                .build();
    }
}
