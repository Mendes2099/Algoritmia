package Ex1;

// Classe que utiliza o padrão Strategy
public class Unit {
    private AttackStrategy attackStrategy; // Estratégia de ataque da unidade

    public Unit(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack(); // Executa a estratégia de ataque escolhida
    }
}
