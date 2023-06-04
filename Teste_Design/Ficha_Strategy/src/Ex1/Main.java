package Ex1;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {

        // Criação de unidades com diferentes estratégias de ataque
        Unit meleeUnit = new Unit(new MeleeAttackStrategy());
        meleeUnit.performAttack(); // Saída: Realizar ataque corpo a corpo!

        Unit rangedUnit = new Unit(new RangedAttackStrategy());
        rangedUnit.performAttack(); // Saída: Realizar ataque à distância!

        Unit magicUnit = new Unit(new MagicAttackStrategy());
        magicUnit.performAttack(); // Saída: Realizar ataque mágico!
    }
}