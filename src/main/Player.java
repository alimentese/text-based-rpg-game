package main;

import java.security.SecureRandom;
import java.util.Scanner;
import static main.Battle.turn;
import static main.Enemy.enemyHP;


public class Player implements Skills{
    
    private  String playerName;
    private  int playerClass; // 1-Knight, 2-Mage, 3-Rogue
    private  int playerHP;
    private  int playerSTR;
    private  int playerDEX;
    private  int playerAGI;
    public  int playerAttackPOW;
    private  String playerSkillName;
    private  String playerSkillDesc;
    private  int playerSkillCD;
    private  String playerSkill2Name;
    private  String playerSkill2Desc;
    private  int playerSkillCD2;
    private  String playerSkill3Name;
    private  String playerSkill3Desc;
    private  int playerSkillCD3;
    private  String playerSkill4Name;
    private  String playerSkill4Desc;
    private  int playerSkillCD4;
    int playerLEVEL;
    int playerEXP;


    public  int[] inventory;
    public  int[] equipped;
    
    public  int CD;
    public  int CD2;
    public  int CD3;
    public  int CD4;
    

    

    public Player() {
    	/* this.setPlayerName(playerName);
    	this.setPlayerClass(playerClass);
    	this.setPlayerHP(playerHP);
    	this.setPlayerSTR(playerSTR);
    	this.setPlayerDEX(playerDEX);
    	this.setPlayerAGI(playerAGI);
    	this.setPlayerSkillName(playerSkillName);
    	this.setPlayerSkillDesc(playerSkillDesc);
    	this.setPlayerSkillCD(playerSkillCD);
    	this.setPlayerSkill2Name(playerSkill2Name);
    	this.setPlayerSkill2Desc(playerSkill2Desc); 
    	this.setPlayerSkillCD2(playerSkillCD2);
    	this.setPlayerSkill3Name(playerSkill3Name);
    	this.setPlayerSkill3Desc(playerSkill3Desc);
    	this.setPlayerSkillCD3(playerSkillCD3);
    	this.setPlayerSkill4Name(playerSkill4Name);
    	this.setPlayerSkill4Desc(playerSkill4Desc);
    	this.setPlayerSkillCD4(playerSkillCD4);
    	this.setPlayerLEVEL(playerLEVEL);
    	this.setPlayerEXP(playerEXP);
        this.setInventory(inventory);
        this.setEquipped(equipped);
                */
    }
    
    public Player(String playerName, int playerClass, int playerHP, int playerSTR, int playerDEX, int playerAGI, String playerSkillName, String playerSkillDesc, int playerSkillCD, String playerSkill2Name, String playerSkill2Desc, int playerSkillCD2, String playerSkill3Name, String playerSkill3Desc, int playerSkillCD3, String playerSkill4Name, String playerSkill4Desc, int playerSkillCD4, int playerLEVEL, int playerEXP, int[] inventory, int[] equipped ) {
    	this.playerName = playerName;
    	this.playerClass = playerClass;
    	this.playerHP = playerHP;
    	this.playerSTR = playerSTR;
    	this.playerDEX = playerDEX;
    	this.playerAGI = playerAGI;
    	this.playerSkillName = playerSkillName;
    	this.playerSkillDesc = playerSkillDesc;
    	this.playerSkillCD = playerSkillCD;
    	this.playerSkill2Name = playerSkill2Name;
    	this.playerSkill2Desc = playerSkill2Desc;
    	this.playerSkillCD2 = playerSkillCD2;
    	this.playerSkill3Name = playerSkill3Name;
    	this.playerSkill3Desc = playerSkill3Desc;
    	this.playerSkillCD3 = playerSkillCD3;
    	this.playerSkill4Name = playerSkill4Name;
    	this.playerSkill4Desc = playerSkill4Desc;
    	this.playerSkillCD4 = playerSkillCD4;
    	this.playerLEVEL = playerLEVEL;
    	this.playerEXP = playerEXP;
        this.inventory = inventory;
        this.equipped = equipped;
    }
    

	public int getPlayerLEVEL() {
        return playerLEVEL;
        }

    public void setPlayerLEVEL(int playerLEVEL) {
        this.playerLEVEL = playerLEVEL;
    }
    

    public int getPlayerEXP() {
        return playerEXP;
    }

    public void setPlayerEXP(int playerEXP) {
        this.playerEXP = playerEXP;
    }
    
    public int getPlayerAGI() {
        return playerAGI;
    }

    public void setPlayerAGI(int playerAGI) {
        this.playerAGI = playerAGI;
    }
 
    public int getPlayerSkillCD() {
        return playerSkillCD;
    }

    public void setPlayerSkillCD(int playerSkillCD) {
        this.playerSkillCD = playerSkillCD;
    }

    public int getPlayerSkillCD2() {
        return playerSkillCD2;
    }

    public void setPlayerSkillCD2(int playerSkillCD2) {
        this.playerSkillCD2 = playerSkillCD2;
    }

    public int getPlayerSkillCD3() {
        return playerSkillCD3;
    }

    public void setPlayerSkillCD3(int playerSkillCD3) {
        this.playerSkillCD3 = playerSkillCD3;
    }

    public int getPlayerSkillCD4() {
        return playerSkillCD4;
    }

    public void setPlayerSkillCD4(int playerSkillCD4) {
        this.playerSkillCD4 = playerSkillCD4;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(int playerClass) {
        this.playerClass = playerClass;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public int getPlayerSTR() {
        return playerSTR;
    }

    public void setPlayerSTR(int playerSTR) {
        this.playerSTR = playerSTR;
    }

    public int getPlayerDEX() {
        return playerDEX;
    }

    public void setPlayerDEX(int playerDEX) {
        this.playerDEX = playerDEX;
    }

    public String getPlayerSkillName() {
        return playerSkillName;
    }

    public void setPlayerSkillName(String playerSkillName) {
        this.playerSkillName = playerSkillName;
    }

    public String getPlayerSkillDesc() {
        return playerSkillDesc;
    }

    public void setPlayerSkillDesc(String playerSkillDesc) {
        this.playerSkillDesc = playerSkillDesc;
    }

    public String getPlayerSkill2Name() {
        return playerSkill2Name;
    }

    public void setPlayerSkill2Name(String playerSkill2Name) {
        this.playerSkill2Name = playerSkill2Name;
    }

    public String getPlayerSkill2Desc() {
        return playerSkill2Desc;
    }

    public void setPlayerSkill2Desc(String playerSkill2Desc) {
        this.playerSkill2Desc = playerSkill2Desc;
    }

    public String getPlayerSkill3Name() {
        return playerSkill3Name;
    }

    public void setPlayerSkill3Name(String playerSkill3Name) {
        this.playerSkill3Name = playerSkill3Name;
    }

    public String getPlayerSkill3Desc() {
        return playerSkill3Desc;
    }

    public void setPlayerSkill3Desc(String playerSkill3Desc) {
        this.playerSkill3Desc = playerSkill3Desc;
    }

    public String getPlayerSkill4Name() {
        return playerSkill4Name;
    }

    public void setPlayerSkill4Name(String playerSkill4Name) {
        this.playerSkill4Name = playerSkill4Name;
    }

    public String getPlayerSkill4Desc() {
        return playerSkill4Desc;
    }

    public void setPlayerSkill4Desc(String playerSkill4Desc) {
        this.playerSkill4Desc = playerSkill4Desc;
    }
    
    public  int[] getInventory() {
        return inventory;
    }

    public  void setInventory(int[] inventory) {
        this.inventory = inventory;
    }

    public  int[] getEquipped() {
        return equipped;
    }

    public  void setEquipped(int[] equipped) {
        this.equipped = equipped;
    }
    
    public void playerBasicAttack(Enemy enemy, Player player){
        SecureRandom random = new SecureRandom();
            turn++;
            if(CD!=getPlayerSkillCD() && CD!=0){
                CD--;
                while(CD==0){
                    CD=getPlayerSkillCD();
                }
            }
            if(CD2!=getPlayerSkillCD2() && CD2!=0){
                CD2--;
                while(CD2==0){
                    CD2=getPlayerSkillCD2();
                }
            }
            if(CD3!=getPlayerSkillCD3() && CD3!=0){
                CD3--;
                while(CD3==0){
                    CD3=getPlayerSkillCD3();
                }
            }
            if(CD4!=getPlayerSkillCD4() && CD4!=0){
                CD4--;
                while(CD4==0){
                    CD4=getPlayerSkillCD3();
                }
            } 
        int luck=random.nextInt(4)+1;
        if(enemy.getEnemyAGI()>player.getPlayerSTR() / 4 && luck == 1){
            System.out.println("Enemy dodged player's attack!!");
            playerAttackPOW = 0;
        }
        else {
            playerAttackPOW = (random.nextInt(player.getPlayerSTR()))-(enemy.getEnemyDEX()/5);
        }
        
        enemy.setEnemyHP(enemyHP-=playerAttackPOW);
        if(playerAttackPOW>0){
            System.out.println("Enemy got "+playerAttackPOW+" damage from you!");
        }
        else {
            System.out.println("You missed the target!");
        }
    }
        
    @Override
    public void playerSkill(){
        Scanner input = new Scanner(System.in);
        switch (getPlayerClass()){
            case 1:             // KNIGHT SKILL 1
                if(CD==getPlayerSkillCD()){
                    CD--;
                    turn++;
                    System.out.println("You used "+getPlayerSkillName()+" skill!");
                    playerHP-=10;
                    System.out.println("Enemy has stunned for 1 turn!");
                    int option = input.nextInt();// WHAT SKILL DOES.
                    if(CD2!=getPlayerSkillCD2()){
                        CD2--;
                    }
                    if(CD3!=getPlayerSkillCD3()){
                        CD3--;
                    }
                    if(CD4!=getPlayerSkillCD4()){
                        CD4--;
                    }
                }
                else if(CD<getPlayerSkillCD()){
                    System.out.println("Skill is still in cooldown. You have to wait "+CD+" turn!");
                    while(CD==0){
                        CD=getPlayerSkillCD();
                    } 
                }
            break;
        }
    }
    
    @Override
    public void playerSkill2(){
        switch (getPlayerClass()) {
            case 1:
                if(CD2==getPlayerSkillCD2()){
                    CD2--;
                    turn++;
                    System.out.println("You used "+getPlayerSkill2Name()+" skill!");
                    playerHP-=5;
                    if(CD!=getPlayerSkillCD()){
                        CD--;
                    }
                    if(CD3!=getPlayerSkillCD3()){
                        CD3--;
                    }
                    if(CD4!=getPlayerSkillCD4()){
                        CD4--;
                    }
                }
                else if(CD2<getPlayerSkillCD()){
                    System.out.println("Skill is still in cooldown. You have to wait "+CD2+" turn!");
                    while(CD2==0){
                        CD2=getPlayerSkillCD();
                    } 
                }
            break;
        }
    }
    
    @Override
    public void playerSkill3(){
        switch (getPlayerClass()) {
            case 1:
                if(CD3==getPlayerSkillCD3()){
                    CD3--;
                    turn++;
                    System.out.println("You used "+getPlayerSkill3Name()+" skill!");
                    playerSTR+=5;
                    playerHP-=playerAttackPOW;
                    if(CD!=getPlayerSkillCD()){
                        CD--;
                    }
                    if(CD2!=getPlayerSkillCD2()){
                        CD2--;
                    }
                    if(CD4!=getPlayerSkillCD4()){
                        CD4--;
                    }
                }
                else if(CD3<getPlayerSkillCD3()){
                    System.out.println("Skill is still in cooldown. You have to wait "+CD3+" turn!");
                    while(CD3==0){
                        CD3=getPlayerSkillCD3();
                    } 
                }
            break;
        }
    }
    
    @Override
    public void playerSkill4(){
        switch (getPlayerClass()) {
            case 1:
                if(CD4==getPlayerSkillCD4()){
                    CD4--;
                    turn++;
                    System.out.println("You used "+getPlayerSkill4Name()+" skill!");
                    playerAttackPOW+=5;
                    playerHP-=playerAttackPOW;
                    if(CD!=getPlayerSkillCD()){
                        CD--;
                    }
                    if(CD2!=getPlayerSkillCD2()){
                        CD2--;
                    }
                    if(CD3!=getPlayerSkillCD3()){
                        CD3--;
                    }
                }
                else if(CD4<getPlayerSkillCD4()){
                    System.out.println("Skill is still in cooldown. You have to wait "+CD4+" turn!");
                    while(CD4==0){
                        CD4=getPlayerSkillCD4();
                    } 
                }
            break;
        }
    }
    void print(){
        System.out.println("Player's stats: ");
        System.out.println("Your HP: "+playerHP );
        System.out.println("Your STR: "+playerSTR );
        System.out.println("Your DEX: "+playerDEX );
        System.out.println("Your AGI: "+playerAGI );
        System.out.println("Your LEVEL: "+playerLEVEL);
        System.out.println("Your EXP: "+playerEXP);
    }
    
    
    
}
