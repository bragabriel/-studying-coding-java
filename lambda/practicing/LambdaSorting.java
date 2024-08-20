package lambda.practicing;

import java.util.Arrays;
import java.util.List;

public class LambdaSorting {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("banana", "apple", "kiwi", "mango");

        // Ordena a lista em ordem alfabética usando expressões lambda
        myList.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted List: " + myList);
    }
}
