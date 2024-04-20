package org.example;


interface car{

    void carDetails();
}

class Sedan implements car{

    @Override
    public void carDetails() {
        System.out.println("Hi This Is Sedan , I am the most selling car all over the world.");
    }
}

class carFactory{

    public car buildCar(String name){
        if(name.equalsIgnoreCase("Sedan")){
            Sedan obj=new Sedan();
            return obj;
        } else if (name.equalsIgnoreCase("Alto")) {
            Alto obj=new Alto();
            return obj;

        }
        return null;

    }
}

class Alto implements car{

    @Override
    public void carDetails() {
        System.out.println("Hi This Is Alto , I am the best economic car of india");
    }
}
public class FactoryDesignPattern {

    public static void main(String args[]){

        carFactory obj=new carFactory();
        car sedan=obj.buildCar("Sedan");
        sedan.carDetails();
        car alto=obj.buildCar("Alto");
        alto.carDetails();


    }
}
