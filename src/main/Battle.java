package main;

import java.security.SecureRandom;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static main.Enemy.enemyAGI;
import static main.Enemy.enemyAttackPOW;
import static main.Enemy.enemyDEX;
import static main.Enemy.enemyHP;
import static main.Enemy.enemySTR;
import static main.Enemy.getEnemyDEX;
import static main.Enemy.getEnemyHP;
import static main.Enemy.getEnemySTR;

public class Battle extends Player implements Skills{
    
    public static int turn = 1;
    public static int option;
    public  String stats ="| Your Stats |      | Enemy Stats |\n"+"   HP: "+getPlayerHP()+"                     HP: "+getEnemyHP()+"\n"+"   STR: "+getPlayerSTR()+ "                    STR: "+getEnemySTR()+"\n   DEX: "+getPlayerDEX()+"                    DEX: "+getEnemyDEX()+"\n        ";

    public void showStats(){
        JOptionPane pane = new JOptionPane();  
        JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf,stats, "BATTLE STATUS", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void playerDodgeChance(){
        SecureRandom random = new SecureRandom();
        int luck=random.nextInt(4)+1;
        if(playerAGI>enemySTR / 4 && luck == 1){
            System.out.println("Player dodged enemy's attack!!");
            enemyAttackPOW = 0;
        }
        else {
            enemyAttackPOW = (random.nextInt(enemySTR))-(playerDEX/5);
        }          
    }
    
    public void enemyDodgeChance(){
        SecureRandom random = new SecureRandom();
        int luck=random.nextInt(4)+1;
        if(enemyAGI>playerSTR / 4 && luck == 1){
            System.out.println("Enemy dodged player's attack!!");
            playerAttackPOW = 0;
        }
        else {
            playerAttackPOW = (random.nextInt(playerSTR))-(enemyDEX/5);
        }          
    }
    
    public void createBattle(){
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();   
        while(getPlayerHP() >0 && getEnemyHP() >0){
            System.out.println("(Your HP: "+getPlayerHP()+" Enemy HP: "+getEnemyHP()+" Turn: "+turn+" )");
            System.out.println("1) Basic Attack");
            System.out.println("2) "+getPlayerSkillName()+" ("+getPlayerSkillDesc()+")(Cooldown:"+CD+" turns)");
            System.out.println("3) "+getPlayerSkill2Name()+" ("+getPlayerSkill2Desc()+")(Cooldown:"+CD2+" turns)");
            System.out.println("4) "+getPlayerSkill3Name()+" ("+getPlayerSkill3Desc()+")(Cooldown:"+CD3+" turns)");
            System.out.println("5) "+getPlayerSkill4Name()+" ("+getPlayerSkill4Desc()+")(Cooldown:"+CD4+" turns)");
            System.out.println("0) Show Stats");
            option = input.nextInt();
            enemyDodgeChance();
            while(CD!=getPlayerSkillCD() && option == 2 || CD2!=getPlayerSkillCD2() && option == 3 || CD3!=getPlayerSkillCD3() && option == 4 || CD4!=getPlayerSkillCD4() && option == 5 ){
                System.out.println("Choose different option!");
                option = input.nextInt();
            }
            switch (option){
                case 1 : playerBasicAttack();
                break;
                            
                case 2 : playerSkill();
                break;         
                            
                case 3 : playerSkill2();
                break;
                
                case 4 : playerSkill3();
                break;
                
                case 5 : playerSkill4();
                break;
                            
                case 0 : while(true){                 
                    showStats();
                    option = input.nextInt();
                    if(option !=0){
                        break;   
                    }
                }      
                default : System.out.println("Your choose is wrong! Try Again!");
                break;                    
            }   // Player's turn is end!
            playerDodgeChance();  
            int  enemyChoice = random.nextInt(2)+1; // Enemy's turn is start
            if(getEnemyHP()>=50 && enemyChoice == 2){
            enemyChoice-=1;
            }
            if(option == 1 || option == 2 || option == 3 || option == 4 || option == 5)   { // if choice is wrong Enemy dont attack
                switch (enemyChoice){
                    case 1: Enemy.enemyBasicAttack();
                    break;

                    case 2: 
                        enemyHP=enemyHP+enemyHP%5;
                        System.out.println("Enemy healed himself! Your HP: "+getEnemyHP()+" Enemy HP: "+enemyHP+" Turn: "+turn);
                    break;
                        
                    default : 
                    break;
                }
            } // Enemy's turn end
            if(getPlayerHP()<=0){
                System.out.println("You died. Game is over!");
                System.out.println("Your LEVEL: "+getPlayerLEVEL());
                System.out.println("Your EXP: "+getPlayerEXP());
            }
            else if(getEnemyHP()<=0){
                playerEXP+=250;
                if(playerEXP>150){
                    playerLEVEL++;
                }             
                System.out.println("You killed enemy. You WON!");
                System.out.println("Your LEVEL: "+getPlayerLEVEL());
                System.out.println("Your EXP: "+getPlayerEXP());
                
            }   
        }   
    }
}

