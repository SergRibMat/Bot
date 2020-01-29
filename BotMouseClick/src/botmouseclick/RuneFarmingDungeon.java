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
public class RuneFarmingDungeon implements MyGlobalInterface{
    
    private final MyActions myActions;
    private int seconds;

    public RuneFarmingDungeon() {
        myActions = new MyActions();
    }

    @Override
    public void startFarming() {
        loose();
        win();
    }
    
    private void loose(){
        myActions.clickNoAction();
        myActions.clickScreenXTimes(1);
        myActions.prepareButtonAction();
        myActions.startBattleAction();
    }
    
    private void win(){
        myActions.clickScreenXTimes(3);
        myActions.keepRune();
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
