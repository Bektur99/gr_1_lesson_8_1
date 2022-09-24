package kg.geektech.game.players;

public class Magic extends Hero {

    private int boost;

    public Magic(int health, int damage,int boost, String name) {
            super(health, damage, name, SuperAbility.BOOST);
            this.boost=boost;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
          if (heroes[i].getHealth() > 0) {
             boss.setHealth(boss.getHealth()- (heroes[i].getDamage() + boost));
              }
          }
        }
    }

