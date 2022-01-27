/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;
import java.util.Stack;
import java.util.ArrayList;
/**
 *
 * @author ghosh
 */
public class Subscriber {
    private String name;
    private Channel channel = new Channel();
    private Stack<String> notifStack = new Stack<String>();
    private ArrayList<String>replicaOfNotifications = new ArrayList<String>();
    public Subscriber(String name){
        this.name = name;
    }
    public void setChannel(Channel c){
        this.channel = c;
    }
    public void update(){
        notifStack.push("Hello " + this.name + ", Video : " + channel.getChannelName() + "was uploaded. Go and watch!");
    }
    public void markAsSeen(){
        System.out.println("Marking notifications as seen\n");
        while(!notifStack.empty()){
            System.out.println(notifStack.peek());
            replicaOfNotifications.add(notifStack.firstElement());
            notifStack.pop();
        }
    }
    public void showNotifs(){
        for(String s : replicaOfNotifications){
            System.out.println(s);
        }
    }
}
