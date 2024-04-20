package org.example;


import java.sql.SQLSyntaxErrorException;

class Pizza{
    private String dough;
    private String sauce;

    private String cheese;
    private String toppings;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }


}
class pizzaBuilder{

    private Pizza pizza;

    public pizzaBuilder(){
        pizza=new Pizza();
    };

    public pizzaBuilder addToppings(String toppings){
        pizza.setToppings(toppings);
        return this;
    };
    public pizzaBuilder addDough(String dough){
        pizza.setDough(dough);
        return this;
    };
    public pizzaBuilder addSauce(String sauce){
        pizza.setSauce(sauce);
        return this;
    }
    public pizzaBuilder addCheese(String cheese){
        pizza.setCheese(cheese);
        return this;
    }

    public Pizza build(){
        return this.pizza;
    }
}

public class BuilderDesignPattern {

    public static void main(String args[]){
        Pizza pizza=new pizzaBuilder().addCheese("100gm Cheese").addDough("1quant Dough").addSauce("sauce added").addToppings("extra toppings added").build();
        System.out.println(pizza.toString());
    }




}
