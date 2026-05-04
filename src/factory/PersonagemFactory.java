package factory;

import personagem.Personagem;

// Classe abstrata que define o Factory Method.
// Cada subclasse concreta decide QUAL personagem criar.
// Este é o CORAÇÃO do padrão Factory Method!
public abstract class PersonagemFactory {

    // ============================================
    // FACTORY METHOD (método fábrica)
    // Método abstrato que será implementado pelas
    // subclasses para criar o personagem específico.
    // ============================================
    public abstract Personagem criarPersonagem();

    // Método que usa o Factory Method para criar
    // o personagem e exibir seus comportamentos.
    public void demonstrarPersonagem() {
        Personagem p = criarPersonagem(); // Chama o Factory Method
        System.out.println("========================================");
        System.out.println("Personagem criado: " + p.getNome());
        System.out.println("----------------------------------------");
        p.atacar();
        p.movimentar();
        System.out.println("========================================");
        System.out.println();
    }
}
