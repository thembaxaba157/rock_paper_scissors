package org.thembaxaba157.Game;

import java.util.Scanner;

public class GameInput {
    
    private static Scanner gameScanner;

   

    public static void openScanner(){
        gameScanner = new Scanner(System.in);
    } 

    public static void closeScanner(){
        gameScanner.close();
    }

    public int getInt(String promptMessage){
        while(true){
            System.out.println(promptMessage);
            try {
                int gameInput = gameScanner.nextInt();
                return gameInput;
            } catch (Exception e) {
                System.out.println("Please Enter a valid value");
            }
        }
    }

    public static String getInput(){
        String gameInput = "";
        while(gameInput.isEmpty()){
            gameInput = gameScanner.nextLine();
        }
        return gameInput;
    }

    public static boolean isYes(String promptMessage){
        String gameInput = "";
        System.out.println(promptMessage);
        while(!gameInput.equals("n") && !gameInput.equals("y")){
            gameInput = gameScanner.nextLine();
        }
        if(gameInput.equals("n"))return false;
        return true;
    }

    public void Close(){
        gameScanner.close();
    }

}
