package main;

import static main.Player.playerHP;

public class Enemy {
    
    protected static String enemyName;
    protected static int enemyClass; // 1-Knight, 2-Mage, 3-Rogue
    protected static int enemyHP;
    protected static int enemySTR;
    protected static int enemyDEX;
    protected static int enemyAGI;

    public static int getEnemyAGI() {
        return enemyAGI;
    }

    public static void setEnemyAGI(int enemyAGI) {
        Enemy.enemyAGI = enemyAGI;
    }

    public static int getEnemyAttackPOW() {
        return enemyAttackPOW;
    }

    public static void setEnemyAttackPOW(int enemyAttackPOW) {
        Enemy.enemyAttackPOW = enemyAttackPOW;
    }
    protected static int enemyAttackPOW;
    
    public Enemy(int enemyClass, String enemyName, int enemyHP, int enemySTR, int enemyDEX, int enemyAGI) {
        this.enemyClass = enemyClass;
        this.enemyName = enemyName;
        this.enemyHP = enemyHP;
        this.enemySTR = enemySTR;
        this.enemyDEX = enemyDEX;
        this.enemyAGI = enemyAGI;
    }
   
   
    
    public static String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public static int getEnemyClass() {
        return enemyClass;
    }

    public void setEnemyClass(int enemyClass) {
        this.enemyClass = enemyClass;
    }

    public static int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public static int getEnemySTR() {
        return enemySTR;
    }
    
    public static int getEnemyDEX() {
        return enemyDEX;
    }

    public static void setEnemyDEX(int enemyDEX) {
        Enemy.enemyDEX = enemyDEX;
    }
    
    public void setEnemySTR(int enemySTR) {
        this.enemySTR = enemySTR;
    }
    
    public static void enemyBasicAttack(){
        playerHP-=enemyAttackPOW;
        if(enemyAttackPOW>0){
            System.out.println(" You got "+enemyAttackPOW+" damage from enemy! ");
        }
        else {
            System.out.println(" Enemy couldn't hit you! ");
        }
    }
}
