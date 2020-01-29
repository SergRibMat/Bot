/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick;

import botmouseclick.mymotherclass.MyActions;

/**
 *
 * @author tyson
 */
public class EssenceFarming implements MyGlobalInterface{
    
    private final MyActions myActions;
    private int seconds;
    
    
    
    //pantalla *3
    
    //ok button
    //x 300 y 908
    //x 367 y 939
    
    //replay

    public EssenceFarming() {
        myActions = new MyActions();
    }
    
    public void startFarming(){
        win();
    }
    
    private void win(){
        myActions.clickScreenXTimes(3);
        myActions.sayOkToThings();
        myActions.prepareButtonAction();
    }
    
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
}
