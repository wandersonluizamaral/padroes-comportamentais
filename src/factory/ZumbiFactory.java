package factory;

import personagem.Personagem;
import personagem.Zumbi;

// Fábrica concreta que cria personagens do tipo Zumbi.
public class ZumbiFactory extends PersonagemFactory {

    @Override
    public Personagem criarPersonagem() {
        return new Zumbi();
    }
}
