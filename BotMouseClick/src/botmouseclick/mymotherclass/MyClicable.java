/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick.mymotherclass;

import java.util.Random;

/**
 *
 * @author tyson
 */
public class MyClicable {
    
    private int x;
    private int y;
   

    public MyClicable(int minX, int maxX, int minY, int maxY) {
        x = generateX(minX, maxX);
        y = generateY(minY, maxY);
    }
    
    
    
    public int generateX(int min, int max){
       return MyStaticMethods.getRandomNumberInRange(min, max);
    }
    
    public int generateY(int min, int max){
       return MyStaticMethods.getRandomNumberInRange(min, max);
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return " x = " + x + " y = " + y;
    }
    
    
    
}
