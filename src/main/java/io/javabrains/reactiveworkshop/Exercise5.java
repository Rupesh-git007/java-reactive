package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed"));


        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber {

    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscription happened..");
//        super.hookOnSubscribe(subscription);
        request(1); //requesting to flux to send value
    }

    @Override
    protected void hookOnNext(Object value) {
//        super.hookOnNext(value);
        System.out.println(value + " printed..");
        request(1); // after getting event, requesting for 1 more event

    }
}