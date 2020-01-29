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
public class VolcanoFarming implements MyGlobalInterface{
    
    
    private final MyActions myActions;
    private int seconds;

    public VolcanoFarming() {
        
        myActions = new MyActions();
        
    }
    

    public void startFarming(){
        loose();
        win();
    }
    
    private void loose(){
        myActions.clickNoAction(); 
        myActions.clickScreenXTimes(1);
        myActions.prepareButtonAction();
        myActions.selectFriendsChampAction();
        myActions.startBattleAction();
        
    }
    
    private void win(){
       
        myActions.clickScreenXTimes(3);
        myActions.sellRuneAction();
        myActions.sayYesToSellRune();
        myActions.sayOkToThings();
        myActions.prepareButtonAction();
        myActions.selectFriendsChampAction();
        myActions.startBattleAction();
    }

    @Override
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
    
    

    
    
    
    
    
    
    
    
}
