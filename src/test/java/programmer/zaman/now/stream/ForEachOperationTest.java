package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore() {

        List.of("Alvenio", "Farhan", "Prayogo").stream()
                .map(name -> {
                    System.out.println("Before Change Name to Upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change name to upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final name :" + name));

    }


    @Test
    void testPeekAfter() {

        List.of("Alvenio", "Farhan", "Prayogo").stream()
                .peek(name -> System.out.println("Before Change Name to Upper : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change name to upper : " + upper))
                .forEach(name -> System.out.println("Final name :" + name));
    }
}
