package main;

public class Knight extends Player {
   
    public void setPlayerKnight(){     
        Player playerKNIGHT = new Player(); // runtime polymorphism here
        level = getPlayerLEVEL();
        exp = getPlayerEXP();
        playerKNIGHT.setPlayerClass(1);
        playerKNIGHT.setPlayerHP(100);
        playerKNIGHT.setPlayerSTR(15);
        playerKNIGHT.setPlayerDEX(10);
        playerKNIGHT.setPlayerAGI(5);
        playerKNIGHT.setPlayerEXP(0);
        playerKNIGHT.setPlayerLEVEL(1);
        playerKNIGHT.setPlayerSkillName("Battle Stomp");
        playerKNIGHT.setPlayerSkillDesc("You deal directly 10 damage and knock down enemy for 1 turn.");
        playerKNIGHT.setPlayerSkillCD(8);
        playerKNIGHT.setPlayerSkill2Name("Crippling Blow");
        playerKNIGHT.setPlayerSkill2Desc("Cripple the target with a sweeping blow.Deals 5 physical damage.");
        playerKNIGHT.setPlayerSkillCD2(4);
        playerKNIGHT.setPlayerSkill3Name("Enrage");
        playerKNIGHT.setPlayerSkill3Desc("Motivate yourself with the power of rage. You gain 5 STR and do basic attack.");
        playerKNIGHT.setPlayerSkillCD3(5);
        playerKNIGHT.setPlayerSkill4Name("Phoenix Dive");
        playerKNIGHT.setPlayerSkill4Desc("You deal 5 more damage.");
        playerKNIGHT.setPlayerSkillCD4(2);
        CD = getPlayerSkillCD();
        CD2 = getPlayerSkillCD2();
        CD3 = getPlayerSkillCD3();
        CD4 = getPlayerSkillCD4();
    }
    @Override
    void print(){
        System.out.println("Player Knight's stats:");
    }
    
}
