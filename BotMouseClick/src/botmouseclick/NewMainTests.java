/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick;


import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tyson
 */
public class NewMainTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testInheritance();
        
    }
    
    private static void testNewRandomMethod(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println("" + random.ints(0, 100).findFirst().getAsInt());
        }
    }
    
    
    private static void testInheritance(){
        String[] data = { "\u250C\u2500\u2500\u2500\u2500\u2500\u2510", 
        "\u2502Hello\u2502",
        "\u2514\u2500\u2500\u2500\u2500\u2500\u2518" };
    for (String s : data) {
      System.out.println(s);
    }
    for (String s : data) {
      System.console().writer().println(s);
    }
    }
    
    private static void test(){
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
        }else{
            String text = "0 = exit \n" +
                          "1 = pause \n" +
                          "2 = TOA \n" + 
                          "3 = Dimensional Hole Second Awakening Farming \n" +
                          "4 = Rune Farming Dungeon \n" + 
                          "5 = Volcano Farming \n" +
                          "6 = Essence Farming"; 
            console.readLine(null);
        }
    }
    
    
    
}
