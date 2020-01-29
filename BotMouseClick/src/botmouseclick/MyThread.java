/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tyson
 */
public class MyThread extends Thread{
    
    MyGlobalInterface object;

    public MyThread(MyGlobalInterface object) {
        this.object = object;
    }
    
    

    
    @Override
    public void run() {
        myInfiniteLoop(object, object.getSeconds());
    }
    
    private void myInfiniteLoop(MyGlobalInterface object, int seconds){
        int miliseconds = seconds * 1000;
        for (int i = 0; i < 1000000; i++) {
            object.startFarming();
            timeWait(miliseconds);
        }
    }
    
    private static void timeWait(long time){//tiempo en milisegundos
        try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(BotMouseClick.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    
}
