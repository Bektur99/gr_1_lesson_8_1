package kg.geektech.game.players;

public class Golem extends Hero {

    private int defender;

    public Golem(int health, int damage,int defender, String name) {
        super(health, damage, name, SuperAbility.DEFENDER);
        this.defender=defender;
}
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth()>0 ){
               heroes[i].setHealth(heroes[i].getHealth()+(boss.getDamage())/defender);
               if (heroes[i].getName()=="Golem"){
                   this.setHealth(this.getHealth()-(boss.getDamage()/defender));
               }
            }
        }

    }
}

