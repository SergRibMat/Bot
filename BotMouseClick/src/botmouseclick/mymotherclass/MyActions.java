/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmouseclick.mymotherclass;

import java.awt.Robot;
import java.util.ArrayList;

/**
 *
 * @author tyson
 */
public class MyActions {
    
    private final Robot robot;
    private final int seconds;
    

    public MyActions() {
        robot = MyStaticMethods.createRobot();
        seconds = 2;
        
    }
    
    public void clickNoAction(){
        MyClicable noReviveButton = new MyClicable(364, 482, 823, 858);//clicar a no repetir batalla si ha perdido del escenario
        executeClickWithPoints(noReviveButton);
    }
    
    public void keepRune(){
        MyClicable keepRune = new MyClicable(345, 422, 882, 914);//clicar a no repetir batalla si ha perdido del escenario
        executeClickWithPoints(keepRune);
    }
    
    public void prepareButtonAction(){
        MyClicable prepareButton = new MyClicable(115, 300, 785, 812);//prepare/replay button scenario/dimensional hole
        executeClickWithPoints(prepareButton);
    }
    
    
    public void selectFriendsChampAction(){
        MyClicable selectFriendsChamp = new MyClicable(15, 53, 901, 920);//select friends champ
        executeClickWithPoints(selectFriendsChamp);
    }
    
    public void startBattleAction(){
        MyClicable startBattle = new MyClicable(503, 610, 838, 880);
        executeClickWithPoints(startBattle);
    }
    
    public void sellRuneAction(){
        MyClicable sellRune = new MyClicable(234, 310, 883, 913);
        executeClickWithPoints(sellRune);
    }
    
    public void sayYesToSellRune(){
        MyClicable sayYesToSellRune = new MyClicable(229, 310, 808, 837);
        executeClickWithPoints(sayYesToSellRune);
    }
    
    public void sayOkToThings(){//scenario
        MyClicable sayOkToThings = new MyClicable(288, 350, 892, 897);
        executeClickWithPoints(sayOkToThings);
    }
    
    public void sayOkToThingsRift(){
         MyClicable sayOkToThingsRift = new MyClicable(285, 366, 894, 914);
        executeClickWithPoints(sayOkToThingsRift);
    }
    
    public void sayOkToThingsDimensionalHole(){
        MyClicable sayOkToThingsDimensionalHole = new MyClicable(288, 364, 891, 918);
        executeClickWithPoints(sayOkToThingsDimensionalHole);
    }
    
    
    
    
    
    private void clickScreen(){
        //seleccionar 1 de estos objetos
        ArrayList<MyClicable> list = new ArrayList<>();
        list.add(new MyClicable(555, 645, 650, 700));
        //list.add(new MyClicable(5, 90, 650, 710));
        list.add(new MyClicable(5, 90, 870, 910));
        list.add(new MyClicable(200, 440, 610, 690));
        
        MyClicable screenClick = list.get(MyStaticMethods.getRandomNumberInRange(0, list.size()));
        executeClickWithPoints(screenClick);
    }
    
    public void clickScreenXTimes(int times){
        for (int i = 0; i < times; i++) {
            clickScreen();
            
        }
    
    }
    
    private void executeClickWithPoints(MyClicable myClicable){
        int x = myClicable.getX();
        int y = myClicable.getY();
        MyStaticMethods.generalRobotActions(robot, x, y, seconds);
    }
}
