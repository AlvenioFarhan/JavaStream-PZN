package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Alvenio", "Farhan", "Prayogo", "Budi", "Joko").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Alvenio", "Farhan", "Prayogo", "Budi", "Joko").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Alvenio", "Farhan", "Prayogo", "Budi", "Joko").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Eko", "Alvenio", "Farhan", "Prayogo", "Budi", "Joko").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Alvenio", "Farhan", "Prayogo", "Budi", "Joko").stream()
                .findAny();

        optional.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Eko", "Alvenio", "Farhan", "Prayogo", "Budi", "Joko").stream()
                .findFirst();

        optional.ifPresent(System.out::println);
    }
}
