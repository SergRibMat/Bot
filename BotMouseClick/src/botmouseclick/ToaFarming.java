/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick;

import botmouseclick.mymotherclass.MyActions;
import botmouseclick.mymotherclass.MyClicable;

/**
 *
 * @author tyson
 */
public class ToaFarming implements MyGlobalInterface{
    
    private MyActions myActions;
    private int seconds;

    public ToaFarming() {
        myActions = new MyActions();
    }
    
    public void startFarming(){
        loose();
        win();
    }
    
    private void loose(){
        
    }
    
    private void win(){
        myActions.clickScreenXTimes(3);
        myActions.sayOkToThings();
        myActions.prepareButtonAction();
        myActions.startBattleAction();
    }
    
    
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    
}
