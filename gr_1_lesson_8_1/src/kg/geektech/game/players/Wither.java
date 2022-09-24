package kg.geektech.game.players;

public class Wither extends Hero{
    int takeFromWither=getHealth();
    public Wither(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.LIFE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0){
                heroes[i].setHealth(takeFromWither);
                setHealth(0);
            }

        }
    }
}

