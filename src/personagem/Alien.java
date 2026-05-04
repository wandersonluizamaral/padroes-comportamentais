package personagem;

// Personagem do tipo Alien.
// Implementa a interface Personagem com comportamentos específicos.
public class Alien implements Personagem {

    @Override
    public String getNome() {
        return "Alien";
    }

    @Override
    public void atacar() {
        System.out.println("[ALIEN] Lança ácido corrosivo! 👽");
    }

    @Override
    public void movimentar() {
        System.out.println("[ALIEN] Teletransporta-se instantaneamente! ✨");
    }
}
