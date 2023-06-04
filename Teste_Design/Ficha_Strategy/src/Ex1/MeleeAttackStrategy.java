package Ex1;

// Implementações concretas de Strategy
// Estratégia de ataque corpo a corpo
public class MeleeAttackStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Realizar ataque corpo a corpo!");
        // Lógica específica para ataque corpo a corpo
    }
}
