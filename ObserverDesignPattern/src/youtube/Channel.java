/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ghosh
 */
public class Channel {
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    public Channel(String title) {
        this.title = title;
    }
    public Channel(){
        this.title = "unknown";
    }
    public void subscribe(Subscriber sub){
        subs.add(sub);
        sub.setChannel(this);
    }
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
        sub.setChannel(null);
    }
    
    public void notifySubscribers(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }
    
    public String getChannelName(){
        return this.title;
    }
    
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
