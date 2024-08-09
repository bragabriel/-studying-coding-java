package Patterns.factory;

public class FactoryEx {
    /* Padrão FactoryEx
     * Utilizado quando desejamos criar objetos sem especificar explicitamente a classe
     * exata do objeto que será criado. Fornece um método para criar objetos, mas
     * deixa a escolha da classe de objeto para as subclasses.
     */

    // Ex: Temos um jogo, e temos diferentes tipos de inimigos. Podemos usar uma fábrica para isto
    public interface Inimigo {
        void atacar();
        void mover();
    }

    public class Zumbi implements Inimigo{
        @Override
        public void atacar() {
            System.out.println("Zumbi atacando");
        }
        @Override
        public void mover() {
            System.out.println("Zumbi andando");
        }
    }

    public class Esqueleto implements Inimigo{
        @Override
        public void atacar() {
            System.out.println("Esqueleto atacando");
        }
        @Override
        public void mover() {
            System.out.println("Esqueleto andando");
        }
    }

    public class Fantasma implements Inimigo{
        @Override
        public void atacar() {
            System.out.println("Fantasma atacando");
        }
        @Override
        public void mover() {
            System.out.println("Fantasma andando");
        }
    }

    public class InimigoFactory{
        public Inimigo criarInimigo(String tipo){
            switch (tipo){
                case "Zumbi":
                    return new Zumbi();
                case "Esqueleto":
                    return new Esqueleto();
                case "Fantasma":
                    return new Fantasma();
                default:
                    throw new IllegalArgumentException("Tipo de inimigo desconhecido: " + tipo);
            }
        }
    }
}
