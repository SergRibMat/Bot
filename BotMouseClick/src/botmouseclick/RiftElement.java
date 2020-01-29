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
public class RiftElement implements MyGlobalInterface{
    
    private final MyActions myActions;
    private int seconds;

    public RiftElement() {
        myActions = new MyActions();
    }

    @Override
    public void startFarming() {
        win();
    }

    @Override
    public void setSeconds(int seconds) {
       this.seconds = seconds;
    }

    @Override
    public int getSeconds() {
        return seconds;
    }
    
    private void win(){
        myActions.clickScreenXTimes(3);
        myActions.sayOkToThingsRift();
        myActions.prepareButtonAction();
    }
    
}
