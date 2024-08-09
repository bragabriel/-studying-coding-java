package Patterns.strategy;

public class StrategyEx {

    /* Padrão StrategyEx
     * Usado quando temos várias maneiras de realizar uma tarefa, e queremos
     * ser capaz de escolher entre elas durante a execução do programa, encapsulando
     * estratégias em um objeto separado
     */

    // Ex: Temos um jogo, e o personagem tem diferentes estratégias de ataque:
    public interface EstrategiaAtaque {
        void atacar();
    }

    public static class AtaqueCorpoACorpo implements EstrategiaAtaque {
        @Override
        public void atacar() {
            System.out.println("Ataque Corpo a Corpo!");
        }
    }

    public static class AtaqueADistancia implements EstrategiaAtaque {
        @Override
        public void atacar() {
            System.out.println("Ataque à Distância!");
        }
    }

    public static class Personagem {
        private EstrategiaAtaque estrategia;

        public Personagem(EstrategiaAtaque estrategia) {
            this.estrategia = estrategia;
        }

        public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
            this.estrategia = estrategiaAtaque;
        }

        public void executarAtaque() {
            estrategia.atacar();
        }
    }

    // Main
    public static void main(String[] args) {
        EstrategiaAtaque atkDistancia = new AtaqueADistancia();
        EstrategiaAtaque atkCorpoACorpo = new AtaqueCorpoACorpo();
        Personagem batman = new Personagem(atkCorpoACorpo);
        batman.executarAtaque();

        // Alterar estratégia de ataque e executar novamente
        batman.setEstrategiaAtaque(atkDistancia);
        batman.executarAtaque();
    }
}
