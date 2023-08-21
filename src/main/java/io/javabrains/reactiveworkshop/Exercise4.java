package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(integer -> System.out.println(integer));

        // Get the value from the Mono into an integer variable
        Integer number = ReactiveSources.intNumberMono().block();
        Optional<Integer> optionalNumber = ReactiveSources.intNumberMono().blockOptional();

        System.out.println("Press a key to end");
        System.in.read();
    }

}
