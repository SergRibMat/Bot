/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick.mymotherclass;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 *
 * @author tyson
 */
public class MyStaticMethods {
    
    public static Robot createRobot(){
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            
        }
        return robot;
    }
    
    public static void generalRobotActions(Robot robot, int x, int y, int seconds){
        Point originalPoint = MouseInfo.getPointerInfo().getLocation();
        robot.mouseMove(x, y);
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
        returnMouseToInitialPosition(robot, originalPoint);
        robot.delay(seconds * 1000);
    }
    
    public static int getRandomNumberInRange(int min, int max){
        Random random = new Random();
        return random.ints(min, max).findFirst().getAsInt();
    }
    
    private static void returnMouseToInitialPosition(Robot robot, Point point){
        
        int x = (int) point.getX();
        int y = (int) point.getY();
        robot.mouseMove(x, y);
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }
    
    public static String botInfo(){
        return "0 = exit \n" +
               "1 = pause \n" +
               "2 = TOA \n" + 
               "3 = Dimensional Hole Second Awakening Farming \n" +
               "4 = Rune Farming Dungeon Giant \n" + 
               "5 = Volcano Farming \n" +
               "6 = Essence Farming \n" + 
               "7 = Rune Farming Dungeon Dragon \n" +
               "8 = Rift Element Farming"; 
    }
    
}
