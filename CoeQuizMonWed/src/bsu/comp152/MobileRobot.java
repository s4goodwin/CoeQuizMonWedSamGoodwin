package bsu.comp152;

import java.util.Scanner;

public class MobileRobot extends Robot{
    private String LocomotionType;
    private String name;

    public MobileRobot(int startingPower) {
        super(startingPower);
    }

    public void move (float distance){
        System.out.println("you are moving "+distance);
        powerLevel= (int) (distance/5);


    }
    public void move(){
        System.out.println("you are moving default distance");
        var defaultDistance=0;
        powerLevel= (int)(defaultDistance/5);
    }


    public void interactWithWorld(){
        var inputReader = new Scanner(System.in);
        inputReader.nextLine();
        System.out.println("how far would you like to move?: ");
        var userSelectionMove= inputReader.nextLine();

    }
    public void performDemo(){

    }
}
