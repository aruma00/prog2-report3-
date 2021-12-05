package jp.ac.uryukyu.ie.e215743;

public class Warrior extends LivingThing{
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(1.5 * attack);
        if(hitPoint >= 0){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
        else{
            System.out.printf("死亡しているので攻撃不可");
     
        }
        
    }
}
