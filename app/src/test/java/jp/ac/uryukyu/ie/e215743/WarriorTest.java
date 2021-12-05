package jp.ac.uryukyu.ie.e215743;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test

    void attackTest(){
        int defaultattack = 100;
        Warrior demoWarrior = new Warrior("戦士", 100, defaultattack);  
        Enemy slime = new Enemy("スライムもどき", 10, 100); 
        for(int i = 0; i < 3; i++){
          
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(defaultattack*1.5, 150 );
        }
    }
}