package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {

   boolean thorhum=RPG_Game.random.nextBoolean();

    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
        this.thorhum=thorhum;
    }
@Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean thorhum = RPG_Game.random.nextBoolean();
        if (thorhum) {
            boss.setDamage(0);
            System.out.println("Boss stun------------------------------------");
        } else {
            boss.setDamage(50);
        }
    }
}