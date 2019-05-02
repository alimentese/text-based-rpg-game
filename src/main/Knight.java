package main;

public class Knight extends Player {

    public Knight() {
        
    }
    public Knight(String playerName, int playerClass, int playerHP, int playerSTR, int playerDEX, int playerAGI,
	String playerSkillName, String playerSkillDesc, int playerSkillCD, String playerSkill2Name,
	String playerSkill2Desc, int playerSkillCD2, String playerSkill3Name, String playerSkill3Desc,
	int playerSkillCD3, String playerSkill4Name, String playerSkill4Desc, int playerSkillCD4, int playerLEVEL,
	int playerEXP, int[] inventory, int[] equipped) {
	super(playerName, playerClass, playerHP, playerSTR, playerDEX, playerAGI, playerSkillName, playerSkillDesc, playerSkillCD,
            playerSkill2Name, playerSkill2Desc, playerSkillCD2, playerSkill3Name, playerSkill3Desc, playerSkillCD3,
            playerSkill4Name, playerSkill4Desc, playerSkillCD4, playerLEVEL, playerEXP, inventory, equipped);	
        CD = getPlayerSkillCD();
        CD2 = getPlayerSkillCD2();
        CD3 = getPlayerSkillCD3();
        CD4 = getPlayerSkillCD4();         
	}
	@Override
        void print(){
        System.out.println("Player Knight's stats:");
        System.out.println("Your HP: "+getPlayerHP() );
        System.out.println("Your STR: "+getPlayerSTR() );
        System.out.println("Your DEX: "+getPlayerDEX() );
        System.out.println("Your AGI: "+getPlayerAGI() );
        System.out.println("Your LEVEL: "+getPlayerLEVEL());
        System.out.println("Your EXP: "+getPlayerEXP());

    }
    
}
