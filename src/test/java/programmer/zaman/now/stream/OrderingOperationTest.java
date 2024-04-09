package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testShorted() {
        List.of("Alvenio", "Farhan", "Prayogo", "Programmer", "Zaman", "Now").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testShortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Alvenio", "Farhan", "Prayogo", "Programmer", "Zaman", "Now").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }

}
