package lambda.practicing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntegerList {

    /**
     * Dada uma lista de inteiros, use expressões lambda para
     * calcular a soma dos quadrados de todos os números pares na lista.
     */

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);

        //withoutLambda(myList);
        withLambda(myList);
    }

    public static void withoutLambda(List<Integer> myList){
        double resultado = 0.0;

        //sem lambda
        for(int i=0; i<myList.size(); i++){
            if(myList.get(i) % 2 == 0){
                var quadrado = Math.pow(myList.get(i), 2);
                resultado+=quadrado;
            }
        }
        System.out.println(resultado);
    }

    public static void withLambda(List<Integer> myList){

        //filter by even
        Predicate<Integer> filterIsEven =
                n -> n % 2 == 0;

        //filtering myList using the filter
        List myFilterByEven = myList.stream()
                .filter(filterIsEven)
                .collect(Collectors.toList());

        int result = myList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        //adding the
        System.out.println(result);
    }
}
