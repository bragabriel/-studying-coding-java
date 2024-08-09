package function;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<Integer, Double> calculo = a -> a * 2d;

        //Quando chamado o apply, vai primeiro executar o APPLY, e depois o AndTHEN
        calculo = calculo.andThen(a -> a + 10);

        //Quando chamado o compose, vai executar primeiro o COMPOSE, e depois o APPLY
        calculo = calculo.compose(a -> a + 10);

        Double resultado = calculo.apply(10);
        System.out.println(resultado);
    }
}
