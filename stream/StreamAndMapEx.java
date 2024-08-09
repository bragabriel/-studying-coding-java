package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndMapEx {

    /* a API de Stream oferece uma maneira mais expressiva e funcional
    *  de processar coleções de dados. O método stream() converte uma
    *  coleção em um fluxo (Stream), e então você pode aplicar uma série
    *  de operações de alto nível para manipular e transformar os dados de forma concisa. */
    public static void main(String[] args) {

        StreamAndMapEx myInstance = new StreamAndMapEx();

        StreamAndMapExample1();
        myInstance.StreamAndMapExample2();
    }

    public static void StreamAndMapExample1(){
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Usando stream para imprimir os nomes em maiúsculas
        nomes.stream()
                .map(String::toUpperCase) // transforma cada elemento do stream, convertendo-o para maiúsculas.
                .forEach(System.out::println);

        //A lista original não é afetada
        //System.out.println(nomes);
    }

    public void StreamAndMapExample2(){
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Usando map para criar objetos customizados
        List<Pessoa> pessoas = nomes.stream()
                .map(nome -> new Pessoa(nome, nome.length())) //transforma cada elemento do stream (String) no comprimento (número de caracteres) da string correspondente.
                .collect(Collectors.toList());

        System.out.println(pessoas);
    }
    class Pessoa {
        private String nome;
        private int comprimento;

        public Pessoa(String nome, int comprimento) {
            this.nome = nome;
            this.comprimento = comprimento;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", comprimento=" + comprimento +
                    '}';
        }
    }

}
