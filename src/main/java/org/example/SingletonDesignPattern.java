package org.example;



class Singleton{

    private static Singleton getInstance;


    private Singleton(){

    }


    public static Singleton getGetInstance() {

        if(getInstance==null){
            getInstance=new Singleton();
        }
        return getInstance;
    }

}

public class SingletonDesignPattern {

   public static void main(String args[]){

       Singleton obj=Singleton.getGetInstance();
       Singleton obj2=Singleton.getGetInstance();

       System.out.println(obj.hashCode());
       System.out.println(obj2.hashCode());



   }
}
