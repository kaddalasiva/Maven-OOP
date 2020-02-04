package com.epam.simple;

import java.util.*; 
class Sweets{
    String name;
    String type;
    int cost;
    int weigth;
    Sweets(String name,String type,int cost,int weigth){
        this.name=name;
        this.type=type;
        this.cost=cost;
        this.weigth=weigth;
    }
}
// sort by using the weight of the sweets
class Sortbyweigth implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.weigth - b.weigth; 
    } 
}
//sort by using the cost of the sweets
class Sortbycost implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.cost - b.cost; 
    } 
}
// sort by using the type of sweets
class Sortbytype implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.type.compareTo(b.type); 
    } 
}
