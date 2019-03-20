package main;

import java.security.SecureRandom;
import java.util.Scanner;
import static main.Battle.option;
import static main.Battle.turn;
import static main.Enemy.enemyDEX;
import static main.Enemy.enemyHP;

public class Player implements Skills{
    protected static String playerName;
    protected static int playerClass; // 1-Knight, 2-Mage, 3-Rogue
    protected static int playerHP;
    protected static int playerSTR;
    protected static int playerDEX;
    protected static int playerAGI;

    
    
    public int getPlayerLEVEL() {
        return playerLEVEL;
    }

    public void setPlayerLEVEL(int playerLEVEL) {
        Player.playerLEVEL = playerLEVEL;
    }

    public int getPlayerEXP() {
        return playerEXP;
    }

    public void setPlayerEXP(int playerEXP) {
        Player.playerEXP = playerEXP;
    }
    protected static int playerLEVEL;
    protected static int playerEXP;
    
    
    protected static int playerAttackPOW;
    
    public static int CD;
    public static int CD2;
    public static int CD3;
    public static int CD4;
    
    public static int level;
    public static int exp;
    
    protected static String playerSkillName;
    protected static String playerSkillDesc;
    protected static int playerSkillCD;

    protected static String playerSkill2Name;
    protected static String playerSkill2Desc;
    protected static int playerSkillCD2;
    
    protected static String playerSkill3Name;
    protected static String playerSkill3Desc;
    protected static int playerSkillCD3;
    
    protected static String playerSkill4Name;
    protected static String playerSkill4Desc;
    protected static int playerSkillCD4;
    

    public int getPlayerAGI() {
        return playerAGI;
    }

    public void setPlayerAGI(int playerAGI) {
        Player.playerAGI = playerAGI;
    }
 
    public int getPlayerSkillCD() {
        return playerSkillCD;
    }

    public void setPlayerSkillCD(int playerSkillCD) {
        Player.playerSkillCD = playerSkillCD;
    }

    public int getPlayerSkillCD2() {
        return playerSkillCD2;
    }

    public void setPlayerSkillCD2(int playerSkillCD2) {
        Player.playerSkillCD2 = playerSkillCD2;
    }

    public int getPlayerSkillCD3() {
        return playerSkillCD3;
    }

    public void setPlayerSkillCD3(int playerSkillCD3) {
        Player.playerSkillCD3 = playerSkillCD3;
    }

    public int getPlayerSkillCD4() {
        return playerSkillCD4;
    }

    public void setPlayerSkillCD4(int playerSkillCD4) {
        Player.playerSkillCD4 = playerSkillCD4;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        Player.playerName = playerName;
    }

    public int getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(int playerClass) {
        Player.playerClass = playerClass;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        Player.playerHP = playerHP;
    }

    public int getPlayerSTR() {
        return playerSTR;
    }

    public void setPlayerSTR(int playerSTR) {
        Player.playerSTR = playerSTR;
    }

    public int getPlayerDEX() {
        return playerDEX;
    }

    public void setPlayerDEX(int playerDEX) {
        Player.playerDEX = playerDEX;
    }

    public String getPlayerSkillName() {
        return playerSkillName;
    }

    public void setPlayerSkillName(String playerSkillName) {
        Player.playerSkillName = playerSkillName;
    }

    public String getPlayerSkillDesc() {
        return playerSkillDesc;
    }

    public void setPlayerSkillDesc(String playerSkillDesc) {
        Player.playerSkillDesc = playerSkillDesc;
    }

    public String getPlayerSkill2Name() {
        return playerSkill2Name;
    }

    public void setPlayerSkill2Name(String playerSkill2Name) {
        Player.playerSkill2Name = playerSkill2Name;
    }

    public String getPlayerSkill2Desc() {
        return playerSkill2Desc;
    }

    public void setPlayerSkill2Desc(String playerSkill2Desc) {
        Player.playerSkill2Desc = playerSkill2Desc;
    }

    public String getPlayerSkill3Name() {
        return playerSkill3Name;
    }

    public void setPlayerSkill3Name(String playerSkill3Name) {
        Player.playerSkill3Name = playerSkill3Name;
    }

    public String getPlayerSkill3Desc() {
        return playerSkill3Desc;
    }

    public void setPlayerSkill3Desc(String playerSkill3Desc) {
        Player.playerSkill3Desc = playerSkill3Desc;
    }

    public String getPlayerSkill4Name() {
        return playerSkill4Name;
    }

    public void setPlayerSkill4Name(String playerSkill4Name) {
        Player.playerSkill4Name = playerSkill4Name;
    }

    public String getPlayerSkill4Desc() {
        return playerSkill4Desc;
    }

    public void setPlayerSkill4Desc(String playerSkill4Desc) {
        Player.playerSkill4Desc = playerSkill4Desc;
    }
    
    public void playerBasicAttack(){
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
                
        playerAttackPOW = (random.nextInt(getPlayerSTR()))-(enemyDEX/5);
        enemyHP-=playerAttackPOW;
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
                    enemyHP-=10;
                    System.out.println("Enemy has stunned for 1 turn!");
                    option = input.nextInt();// WHAT SKILL DOES.
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
                    enemyHP-=5;
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
                    enemyHP-=playerAttackPOW;
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
                    enemyHP-=playerAttackPOW;
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
                        CD4=getPlayerSkillCD3();
                    } 
                }
            break;
        }
    }
    void print(){
        System.out.println("Player is ready!...");
    }
}
