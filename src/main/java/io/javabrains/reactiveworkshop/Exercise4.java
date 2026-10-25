package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Print the value from intNumberMono when it emits
        // TODO: Write code here

        // Use ReactiveSources.intNumberMono()
//        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e));

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
//        Integer i = ReactiveSources.intNumberMono().block();
//        System.out.println(i);

//        Optional<Integer> i = ReactiveSources.intNumberMono().blockOptional();
//        System.out.println(i.get());


        System.out.println("Press a key to end");
        System.in.read();
    }

}
