package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Alvenio");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStream = Stream.of("Alvenio", "Farhan", "Prayogo");
        arrayStream.forEach(data -> {
            System.out.println(data);
        });


        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Alvenio", "Farhan", "Prayogo"
        };

        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {

        Collection<String> collection = List.of("Alvenio", "Farhan", "Prayogo");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {

        Stream<String> stream = Stream.generate(() -> "Alvenio Farhan Prayogo");
//        stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
//        iterate.forEach(System.out::println);
    }
}
