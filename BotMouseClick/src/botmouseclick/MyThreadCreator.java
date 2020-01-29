/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick;

/**
 *
 * @author tyson
 */
public class MyThreadCreator {
    
    private int num;

    public MyThreadCreator(int num) {
        this.num = num;
        createStartThread();
    }
    
    private void createStartThread(){
        MyThread myThread = new MyThread(selectedObject());
        myThread.start();
    }
    
    private MyGlobalInterface selectedObject(){
        MyGlobalInterface object = null;
        switch(num){
            case 0:
                break;
            case 1:
                break;
            case 2:
                object = new ToaFarming();
                object.setSeconds(40);
                break;  
            case 3:
                object = new DimensionalHoleFarming();
                object.setSeconds(120);
                break;
            case 4:
                object = new RuneFarmingDungeon();
                object.setSeconds(120);
                break;
            case 5:
                object = new VolcanoFarming();
                object.setSeconds(50);
                break;
            case 6:
                object = new EssenceFarming();
                object.setSeconds(30);
                break;
            case 7:
                object = new RuneFarmingDungeon();
                object.setSeconds(180);
                break;
            case 8:
                object = new RiftElement();
                object.setSeconds(360);
                break;
        }
        
        return object;
    }
    
    
    
}
