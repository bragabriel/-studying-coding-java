package filter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEx {

    /*
    *  O método filter é uma operação intermediária em Java Streams que é utilizada para
    *  filtrar elementos com base em uma condição específica. Ele retorna um novo stream
    *  contendo apenas os elementos que atendem à condição de filtragem.
    */
    public static void main(String[] args) {

        FilterEx myInstanceFilter = new FilterEx();

        example1();
        example2_numerosPares();
        myInstanceFilter.example3_idadePessoas();
    }

    public static void example1(){
        Map<Integer, String> hosts = new HashMap<>();
        hosts.put(1, "garbosoftware.com.br");
        hosts.put(2, "receitasdecodigo.com.br");
        hosts.put(3, "anuncieon.com");
        hosts.put(4, "patobranco.anuncieon.com");

        hosts.entrySet() //entrySet() é um método da interface Map em Java que retorna um conjunto (set) de entradas do mapa.
                .stream()
                .filter(map -> "anuncieon.com".equals(map.getValue()))
                .forEach( map -> System.out.println( "Resultado filter: " + map.getValue() ) );
    }

    public static void example2_numerosPares(){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrar números pares
        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares); // Saída: [2, 4, 6, 8, 10]
    }

    public void example3_idadePessoas(){
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 25),
                new Pessoa("Bob", 30),
                new Pessoa("Charlie", 22),
                new Pessoa("David", 35)
        );

        // Filtrar pessoas com idade menor que 30
        List<Pessoa> pessoasJovens = pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() < 30)
                .collect(Collectors.toList());

        System.out.println(pessoasJovens);
    }

    class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }



}
