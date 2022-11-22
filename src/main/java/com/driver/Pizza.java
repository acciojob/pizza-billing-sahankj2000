package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean moreCheese;
    private boolean moreToppings;
    private boolean takeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        moreCheese = false;
        moreToppings = false;
        takeaway = false;
        if(this.isVeg){
            price = 300;
            bill = "Base Price Of The Pizza: 300";
        }else {
            price = 400;
            bill = "Base Price Of The Pizza: 400";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!moreCheese) price += 80;
        moreCheese = true;
    }

    public void addExtraToppings(){
        if(isVeg && !moreToppings) price += 70;
        if(!isVeg && !moreToppings) price += 120;
        moreToppings = true;
    }

    public void addTakeaway(){
        if(!takeaway) price += 20;
        takeaway = true;
    }

    public String getBill(){
        if(moreCheese) bill  = bill + "\nExtra Cheese Added: 80";
        if(moreToppings){
            if(isVeg) bill = bill + "\nExtra Toppings Added: 70";
            else bill = bill + "\nExtra Toppings Added: 120";
        }
        if(takeaway) bill = bill + "\nPaperbag Added: 20";
        bill = bill + "\nTotal Price: "+price;
        return this.bill;
    }
}
