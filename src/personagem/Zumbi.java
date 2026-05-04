package personagem;

// Personagem do tipo Zumbi.
// Implementa a interface Personagem com comportamentos específicos.
public class Zumbi implements Personagem {

    @Override
    public String getNome() {
        return "Zumbi";
    }

    @Override
    public void atacar() {
        System.out.println("[ZUMBI] Ataca com mordida venenosa! 🧟");
    }

    @Override
    public void movimentar() {
        System.out.println("[ZUMBI] Caminha lentamente arrastando os pés... 🦶");
    }
}
