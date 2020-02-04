package com.epam.simple;

public class Candy extends Sweets{
    //inheritance
    String name;
    String type;
    int cost;
    int weigth;
    Candy(String name,String type,int cost,int weigth){
        super(name,type,cost,weigth);
    }
}
