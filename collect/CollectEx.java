package collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {

    /*
    * O método collect é uma operação terminal em Java Streams que é utilizada
    *  para transformar os elementos de um stream em uma coleção ou outro tipo de resultado.
    *  Ele coleta os elementos processados pelo stream e os armazena no formato desejado.
    * */
    public static void main(String[] args) {
        CollectorExample1();
        CollectorExample2();
        CollectorExample3();
    }

    public static void CollectorExample1(){
        //Neste exemplo, o método collect é usado para coletar os elementos do stream para lista.
        Stream<String> stream = Stream.of("A", "B", "C");

        List<String> lista = stream.collect(Collectors.toList());

        System.out.println(lista); // Saída: [A, B, C]
    }

    public static void CollectorExample2(){
        //Aqui, Collectors.joining(", ") é um coletor que concatena os elementos do stream em uma única String, separando-os por ,
        Stream<String> stream = Stream.of("A", "B", "C");

        String resultado = stream.collect(Collectors.joining(", "));

        System.out.println(resultado); // Saída: A, B, C
    }

    public static void CollectorExample3(){
        //Neste exemplo, Collectors.groupingBy(String::length) é um coletor que agrupa os elementos do stream em um mapa,
        //onde as chaves são os comprimentos das strings e os valores são listas de strings com o mesmo comprimento.
        Stream<String> stream = Stream.of("A", "B", "C", "AB", "ZZ", "ZZZ");

        Map<Integer, List<String>> mapaPorComprimento =
                stream.collect(Collectors.groupingBy(String::length));

        System.out.println(mapaPorComprimento);
        // Saída: {1=[A, B, C]}
    }
}
