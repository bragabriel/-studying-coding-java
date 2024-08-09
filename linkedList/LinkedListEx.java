package linkedList;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        // Criação de uma LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Adicionando elementos
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("LinkedList após adicionar elementos: " + fruits);

        // Adicionando elemento no início
        fruits.addFirst("Mango");
        System.out.println("LinkedList após adicionar no início: " + fruits);

        // Adicionando elemento no final
        fruits.addLast("Grapes");
        System.out.println("LinkedList após adicionar no final: " + fruits);

        // Acessando elementos
        String firstElement = fruits.getFirst();
        String lastElement = fruits.getLast();
        System.out.println("Primeiro elemento: " + firstElement);
        System.out.println("Último elemento: " + lastElement);

        // Removendo elementos
        fruits.removeFirst();
        System.out.println("LinkedList após remover o primeiro elemento: " + fruits);
        fruits.removeLast();
        System.out.println("LinkedList após remover o último elemento: " + fruits);
        fruits.remove("Banana");
        System.out.println("LinkedList após remover 'Banana': " + fruits);

        // Verificando se a LinkedList contém um elemento
        boolean containsCherry = fruits.contains("Cherry");
        System.out.println("LinkedList contém 'Cherry': " + containsCherry);

        // Tamanho da LinkedList
        int size = fruits.size();
        System.out.println("Tamanho da LinkedList: " + size);

        // Iterando sobre a LinkedList
        System.out.println("Elementos da LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}