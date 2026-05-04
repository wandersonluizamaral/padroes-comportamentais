import factory.PersonagemFactory;
import factory.ZumbiFactory;
import factory.RoboFactory;
import factory.AlienFactory;

// Classe principal que demonstra o padrão Factory Method.
// 
// VANTAGEM DO FACTORY METHOD:
// Para adicionar um novo tipo de inimigo (ex: Vampiro), basta:
//   1. Criar a classe Vampiro implementando Personagem
//   2. Criar a classe VampiroFactory estendendo PersonagemFactory
//   3. Usar no código: new VampiroFactory()
// 
// NÃO é necessário modificar nenhuma classe existente!
// Isso respeita o Princípio Aberto/Fechado (OCP).

public class Jogo {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║   PLATAFORMA DE JOGOS - FACTORY     ║");
        System.out.println("║         METHOD PATTERN               ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println();

        // Criando as fábricas de personagens
        PersonagemFactory fabricaZumbi = new ZumbiFactory();
        PersonagemFactory fabricaRobo  = new RoboFactory();
        PersonagemFactory fabricaAlien = new AlienFactory();

        // Demonstrando cada personagem através de suas fábricas
        System.out.println(">>> Criando personagens via Factory Method:\n");

        fabricaZumbi.demonstrarPersonagem();
        fabricaRobo.demonstrarPersonagem();
        fabricaAlien.demonstrarPersonagem();

        // Demonstrando a flexibilidade do padrão:
        // Podemos usar um array de fábricas polimorficamente
        System.out.println(">>> Criando personagens dinamicamente:\n");

        PersonagemFactory[] fabricas = {
            new ZumbiFactory(),
            new RoboFactory(),
            new AlienFactory()
        };

        for (PersonagemFactory fabrica : fabricas) {
            // O código aqui NÃO sabe qual personagem será criado!
            // Isso é o poder do Factory Method.
            fabrica.demonstrarPersonagem();
        }
    }
}
