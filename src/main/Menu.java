package main;

import java.util.Scanner;

public class Menu extends Game{
    
    public void displayMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("                           	 /\\                                                        /\\                               ");
        System.out.println("                                |  |                                                      |  |                               ");
        System.out.println("                               /----\\          Welcome to Rpg Battle Simulator V1        /----\\                               ");
        System.out.println("                              [______]             Where Brave Knights Tremble          [______]                               ");
        System.out.println("                               |    |         _____                        _____         |    |                               ");
        System.out.println("                               |[]  |        [     ]                      [     ]        |  []|                               ");
        System.out.println("                               |    |       [_______][ ][ ][ ][][ ][ ][ ][_______]       |    |                               ");
        System.out.println("                               |    [ ][ ][ ]|     |  ,----------------,  |     |[ ][ ][ ]    |                               ");
        System.out.println("                               |             |     |/'    ____..____    '\\|     |             |                               ");
        System.out.println("                                \\  []        |     |    /'    ||    '\\    |     |        []  /                               ");
        System.out.println("                                 |      []   |     |   |o     ||     o|   |     |  []       |                               ");
        System.out.println("                                 |           |  _  |   |     _||_     |   |  _  |           |                               ");
        System.out.println("                                 |   []      | (_) |   |    (_||_)    |   | (_) |       []  |                               ");
        System.out.println("                                 |           |     |   |     (||)     |   |     |           |                               ");
        System.out.println("                                 |           |     |   |      ||      |   |     |           |                               ");
        System.out.println("                               /''           |     |   |o     ||     o|   |     |           ''\\                               ");
        System.out.println("                              [_____________[_______]--'------''------'--[_______]_____________]                               ");
        System.out.println("");
        System.out.println("                        *****************************************************************************");
        System.out.println("                        *                               1)Start Game                                *");
        System.out.println("                        *                               2)Help&Tips                                 *");
        System.out.println("                        *                               3)Exit                                      *");
        System.out.println("                        *****************************************************************************");
        
        int option=input.nextInt();
        switch(option){
            case 1: gameStart();
            break;
            
            case 2: playerHelp();
            break;
            
            case 3: System.exit(0);
            break;
            
            default: System.exit(0);
        }
    }

    
    
}
