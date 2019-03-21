package main;

import java.util.Scanner;
import static main.Battle.option;
import static main.Enemy.getEnemyHP;
import static main.Player.playerLEVEL;

public abstract class Game extends Player implements Engine{
    
    Scanner input = new Scanner(System.in);
    
    @Override
    public void playerHelp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rpg Battle Simulator V1!");
        System.out.println("This is a very usefull combat system prototype.You can easily implement it in your game.");
        System.out.println("While you are testing this combat system, you are going to play as a knight.");
        System.out.println("Are you ready to start ?");
        System.out.println("1) Start Game");
        System.out.println("2) Exit Game");
        int option=input.nextInt();
        if(option ==1){
            gameStart();    
        }
        else {
            System.exit(1);
        }
    }
    @Override
    public void gameStart(){
        
        Scanner input = new Scanner(System.in);
        String name = null;
        int hp,str,dex,agi;
        System.out.println("Greetings adventurer!..");
        System.out.println("You will test our combat system as a knight.");
        Knight newKnight = new Knight(); 
        newKnight.setPlayerKnight();
        Player knight = new Knight();   // Runtime Polymorphism is here
        knight.print();
        
        System.out.println("Your HP: "+getPlayerHP() );
        System.out.println("Your STR: "+getPlayerSTR() );
        System.out.println("Your DEX: "+getPlayerDEX() );
        System.out.println("Your AGI: "+getPlayerAGI() );
        System.out.println("Your LEVEL: "+getPlayerLEVEL());
        System.out.println("Your EXP: "+getPlayerEXP());
        System.out.println("Now, you have to create an enemy.");
        
        System.out.println("1) Enter enemy's name:");
        name = input.nextLine();
                        
        System.out.println("2) Enter enemy's HP:");
        hp = input.nextInt();
                    
        System.out.println("3) Enter enemy's STR:");
        str = input.nextInt();
        
        System.out.println("4) Enter enemy's DEX:");
        dex = input.nextInt();
        
        System.out.println("5) Enter enemy's AGI:");
        agi = input.nextInt();
                
        Enemy trainingENEMY1 = new Enemy(1,name,hp,str,dex,agi);
        System.out.println("MOB ADI: "+trainingENEMY1.getEnemyName());
        System.out.println("MOB HP : "+trainingENEMY1.getEnemyHP());
        System.out.println("MOB STR: "+trainingENEMY1.getEnemySTR());
        System.out.println("MOB DEX: "+trainingENEMY1.getEnemyDEX());
        System.out.println("MOB DEX: "+trainingENEMY1.getEnemyAGI());
        System.out.println("BATTLE IS STARTED!");
        Battle newBattle = new Battle();
        newBattle.createBattle();
        if(getEnemyHP()<=0){
            System.out.println("Congratulations. You won!");
            System.out.println("Do you want to continue?");
                System.out.println("1) Yes!");
                System.out.println("2) NO:(");
                option=input.nextInt();
                if(option==1){
                    Enemy trainingENEMY2 = new Enemy(1,name,hp,str,dex,agi);
                    Battle newBattle2 = new Battle();
                    newBattle2.createBattle();
                } else {
                    System.exit(0);
                }
        }
        else {
            System.out.println("You lost the battle.");
            System.out.println("Do you want to try again?");
                System.out.println("1) YES");
                System.out.println("2) NO");
                option=input.nextInt();
                if(option==1){
                    Enemy trainingENEMY2 = new Enemy(1,name,hp,str,dex,agi);
                    Battle newBattle3 = new Battle();
                    newBattle3.createBattle();
                } else {
                    System.exit(0);
                }
        }
    }   
}