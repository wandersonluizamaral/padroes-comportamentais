package personagem;

// Interface que define o contrato para todos os personagens do jogo.
// Qualquer novo personagem DEVE implementar esses métodos.
public interface Personagem {

    // Retorna o nome do personagem
    String getNome();

    // Define como o personagem ataca
    void atacar();

    // Define como o personagem se movimenta
    void movimentar();
}
