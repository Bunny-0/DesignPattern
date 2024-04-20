package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

interface subject{

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber();
    void noification(String data);

}

class Creator implements subject {

    List<Subscriber> subscriberList=new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);

    }

    @Override
    public void removeSubscriber() {

    }

    @Override
    public void noification(String topic) {

        for(Subscriber user :subscriberList){
            user.receivedNotification("finally uploaded my "+topic);
        }


    }
}



interface observer{

    void receivedNotification(String data);

}

class Subscriber implements observer{

    private String name;

    Subscriber(String name){
        this.name=name;
    }

    @Override
    public void receivedNotification(String data) {
        System.out.println("New Video :"+data+" has been added");
    }
}

public class observerDesignPattern {


    public static void main(String args[]){

        Creator creator=new Creator();
        Subscriber subscriber1=new Subscriber("Shubham");
        Subscriber subscriber2=new Subscriber("Gaurav");
        creator.addSubscriber(subscriber1);
        creator.addSubscriber(subscriber2);
        creator.noification("complete collections in one video");




    }


}
