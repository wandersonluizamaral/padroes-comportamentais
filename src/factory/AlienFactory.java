package factory;

import personagem.Personagem;
import personagem.Alien;

// Fábrica concreta que cria personagens do tipo Alien.
public class AlienFactory extends PersonagemFactory {

    @Override
    public Personagem criarPersonagem() {
        return new Alien();
    }
}
