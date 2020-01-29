/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick;

import botmouseclick.mymotherclass.MyActions;
import java.awt.Robot;

/**
 *
 * @author tyson
 */
public class DimensionalHoleFarming implements MyGlobalInterface{
    
    private final MyActions myActions;
    private int seconds;

    public DimensionalHoleFarming() {
        myActions = new MyActions();
    }
    
    
    
    //ok button
    //x 288 y 892
    //x 362 y 918
    
    //replay
    //x 114 y 783
    //x 301 y 815
    
    
    
    private void loose(){
        myActions.clickNoAction();
        myActions.clickScreenXTimes(2);
        myActions.prepareButtonAction();
        myActions.startBattleAction();
    }
    
    public void startFarming(){
        loose();
        win();
    }
    
    private void win(){
        myActions.clickScreenXTimes(3);
        myActions.sayOkToThingsDimensionalHole();
        myActions.prepareButtonAction();
    }
    
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
}
