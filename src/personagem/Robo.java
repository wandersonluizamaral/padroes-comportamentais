package personagem;

// Personagem do tipo Robô.
// Implementa a interface Personagem com comportamentos específicos.
public class Robo implements Personagem {

    @Override
    public String getNome() {
        return "Robô";
    }

    @Override
    public void atacar() {
        System.out.println("[ROBÔ] Dispara raio laser de alta potência! 🤖");
    }

    @Override
    public void movimentar() {
        System.out.println("[ROBÔ] Move-se com propulsores a jato! 🚀");
    }
}
