package org.thembaxaba157.Game;

import java.util.Scanner;

public class GameInput {
    
    private static Scanner gameScanner;

   

    public static void openScanner(){
        gameScanner = new Scanner(System.in);
    } 

    public int getInt(String prompt){
        while(true){
            System.out.println(prompt);
            try {
                int n = gameScanner.nextInt();
                return n;
            } catch (Exception e) {
                System.out.println("Please Enter a valid value");
            }
        }
    }

    public static String getInput(){
            String n = "";
            while(n.isEmpty()){
                n = gameScanner.nextLine();
            }
            return n;
    }

    public void Close(){
        gameScanner.close();
    }

}
