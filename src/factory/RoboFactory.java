package factory;

import personagem.Personagem;
import personagem.Robo;

// Fábrica concreta que cria personagens do tipo Robô.
public class RoboFactory extends PersonagemFactory {

    @Override
    public Personagem criarPersonagem() {
        return new Robo();
    }
}
