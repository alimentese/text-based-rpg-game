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
        
    }

    
	public Knight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Knight(String playerName, int playerClass, int playerHP, int playerSTR, int playerDEX, int playerAGI,
			String playerSkillName, String playerSkillDesc, int playerSkillCD, String playerSkill2Name,
			String playerSkill2Desc, int playerSkillCD2, String playerSkill3Name, String playerSkill3Desc,
			int playerSkillCD3, String playerSkill4Name, String playerSkill4Desc, int playerSkillCD4, int playerLEVEL,
			int playerEXP, int[] inventory, int[] equipped) {
		super(playerName, playerClass, playerHP, playerSTR, playerDEX, playerAGI, playerSkillName, playerSkillDesc, playerSkillCD,
				playerSkill2Name, playerSkill2Desc, playerSkillCD2, playerSkill3Name, playerSkill3Desc, playerSkillCD3,
				playerSkill4Name, playerSkill4Desc, playerSkillCD4, playerLEVEL, playerEXP, inventory, equipped);
		// TODO Auto-generated constructor stub
                    CD = getPlayerSkillCD();
                    CD2 = getPlayerSkillCD2();
                    CD3 = getPlayerSkillCD3();
                    CD4 = getPlayerSkillCD4();
                    
	}











	@Override
    void print(){
        System.out.println("Player Knight's stats:");
        System.out.println("Your HP: "+playerHP );
        System.out.println("Your STR: "+playerSTR );
        System.out.println("Your DEX: "+playerDEX );
        System.out.println("Your AGI: "+playerAGI );
        System.out.println("Your LEVEL: "+playerLEVEL);
        System.out.println("Your EXP: "+playerEXP);

    }
    
}
