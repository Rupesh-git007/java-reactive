package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        // TODO: Write code here
//        ReactiveSources.intNumbersFluxWithException()
//                .subscribe(res -> System.out.println(res),
//                        err -> System.out.println(err));

//        ReactiveSources.intNumbersFluxWithException()
//                .doOnError(e -> System.out.println("Error !! " + e.getMessage()))
//                .subscribe(res -> System.out.println(res));

        // Print values from intNumbersFluxWithException and continue on errors
        // TODO: Write code here

//        ReactiveSources.intNumbersFluxWithException()
//                .onErrorContinue((err, item) -> System.out.println("Error!! " + item + " " + err.getMessage()))
//                .subscribe(e -> System.out.println(e));


        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        // TODO: Write code here

//        ReactiveSources.intNumbersFluxWithException()
//                .onErrorResume(err -> Flux.just(-1, -2))
//                .subscribe(System.out::println);

        ReactiveSources.intNumbersFluxWithException()
                .onErrorResume(err -> Flux.just(-1, -2))
                .doFinally(complete -> System.out.println("completed!!")
                )
                .doFinally(error -> System.out.println("error....."))
                .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
