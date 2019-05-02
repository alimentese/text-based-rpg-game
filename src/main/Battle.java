package main;

import java.security.SecureRandom;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static main.Enemy.enemyHP;


public class Battle extends Player implements Skills{
    
    public static int turn = 1;
    public static int option;

    // public  String stats ="| Your Stats |      | Enemy Stats |\n"+"   HP: "+player.getPlayerHP()+"                     HP: "+enemy.getEnemyHP()+"\n"+"   STR: "+getPlayerSTR()+ "                    STR: "+Enemy.getEnemySTR()+"\n   DEX: "+getPlayerDEX()+"                    DEX: "+Enemy.getEnemyDEX()+"\n        ";
    // public  String statss = "sa";
    public void showStats(Enemy enemy, Player player){
        String stats ="| Your Stats |      | Enemy Stats |\n"+"   HP: "+player.getPlayerHP()+"                     HP: "+enemy.getEnemyHP()+"\n"+"   STR: "+player.getPlayerSTR()+ "                    STR: "+enemy.getEnemySTR()+"\n   DEX: "+player.getPlayerDEX()+"                    DEX: "+Enemy.getEnemyDEX()+"\n        ";
   
        JOptionPane pane = new JOptionPane();  
        JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf,stats, "BATTLE STATUS", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void playerDodgeChance(Enemy enemy, Player player){
        SecureRandom random = new SecureRandom();
        int luck=random.nextInt(4)+1;
        if(player.getPlayerAGI()>enemy.getEnemySTR() / 4 && luck == 1){
            System.out.println("Player dodged enemy's attack!!");
            enemy.setEnemyAttackPOW(0);
        }
        else {
            enemy.setEnemyAttackPOW((random.nextInt(enemy.getEnemySTR()))-(player.getPlayerDEX()/5));
        }          
    }
    
    public void enemyDodgeChance(Enemy enemy, Player player){
        SecureRandom random = new SecureRandom();
        int luck=random.nextInt(4)+1;
        if(enemy.getEnemyAGI()>player.getPlayerSTR() / 4 && luck == 1){
            System.out.println("Enemy dodged player's attack!!");
            playerAttackPOW = 0;
        }
        else {
            playerAttackPOW = (random.nextInt(player.getPlayerSTR()))-(enemy.getEnemyDEX()/5);
        }          
    }
    
    public void createBattle(Enemy enemy, Player player){
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();   
        while(player.getPlayerHP() >0 && enemy.getEnemyHP() >0){
            System.out.println("-----------------"+player.getPlayerName()+" VS "+enemy.getEnemyName()+"---------------");
            System.out.println("(Your HP: "+player.getPlayerHP()+" Enemy HP: "+enemy.getEnemyHP()+" Turn: "+turn+" )");
            System.out.println("1) Basic Attack");
            System.out.println("2) "+player.getPlayerSkillName()+" ("+player.getPlayerSkillDesc()+")(Cooldown:"+player.CD+" turns)");
            System.out.println("3) "+player.getPlayerSkill2Name()+" ("+player.getPlayerSkill2Desc()+")(Cooldown:"+player.CD2+" turns)");
            System.out.println("4) "+player.getPlayerSkill3Name()+" ("+player.getPlayerSkill3Desc()+")(Cooldown:"+player.CD3+" turns)");
            System.out.println("5) "+player.getPlayerSkill4Name()+" ("+player.getPlayerSkill4Desc()+")(Cooldown:"+player.CD4+" turns)");
            System.out.println("0) Show Stats");
            option = input.nextInt();
            //enemyDodgeChance(enemy,player);
            while(CD!=getPlayerSkillCD() && option == 2 || CD2!=getPlayerSkillCD2() && option == 3 || CD3!=getPlayerSkillCD3() && option == 4 || CD4!=getPlayerSkillCD4() && option == 5 ){
                System.out.println("Choose different option!");
                option = input.nextInt();
            }
            switch (option){
                case 1 : player.playerBasicAttack(enemy,player);
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
                    showStats(enemy,player);
                    option = input.nextInt();
                    if(option !=0){
                        break;   
                    }
                }      
                default : System.out.println("Your choose is wrong! Try Again!");
                break;                    
            }   // Player's turn is end!
            // playerDodgeChance(Enemy enemy, Player player);  
            int  enemyChoice = random.nextInt(2)+1; // Enemy's turn is start
            if(Enemy.getEnemyHP()>=50 && enemyChoice == 2){
            enemyChoice-=1;
            }
            if(option == 1 || option == 2 || option == 3 || option == 4 || option == 5)   { // if choice is wrong Enemy dont attack
                switch (enemyChoice){
                    case 1:
                        int enemyAttackPOW = 0;
                        int luck=random.nextInt(4)+1;
                        if(player.getPlayerAGI()>enemy.getEnemySTR() / 4 && luck == 1){
                            System.out.println("Player dodged enemy's attack!!");
                            enemyAttackPOW = 0;
                        }
                        else {
                            enemyAttackPOW = (random.nextInt(enemy.getEnemySTR()))-(player.getPlayerDEX()/5);
                        }
                        
                        if(enemyAttackPOW>0){
                            System.out.println(" You got "+enemyAttackPOW+" damage from enemy! ");
                        }
                        else {
                            System.out.println(" Enemy couldn't hit you! ");
                        }
                        player.setPlayerHP(player.getPlayerHP()-enemyAttackPOW);
                    break;

                    case 2:
                        if(enemyHP>0){
                            enemy.enemyHP=enemyHP+enemyHP%5;
                            System.out.println("Enemy healed itself!"); 
                        }  
                    break;
                        
                    default : 
                    break;
                }
            } // Enemy's turn end
            if(player.getPlayerHP()<=0){
                System.out.println("You died. Game is over!");
                System.out.println("Your LEVEL: "+getPlayerLEVEL());
                System.out.println("Your EXP: "+getPlayerEXP());
                System.exit(0);
            }
            else if(enemy.getEnemyHP()<=0){
                player.setPlayerEXP(playerEXP+250);
                if(player.getPlayerEXP()>150){
                    player.setPlayerEXP(playerLEVEL++);
                }             
                System.out.println("You killed enemy. You WON!");
                System.out.println("Your LEVEL: "+getPlayerLEVEL());
                System.out.println("Your EXP: "+getPlayerEXP());
                System.out.println("");
                
            }   
        }   
    }
}

