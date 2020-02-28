package com.epam.simple;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
     // List of objects of the sweet class 
        List<Sweets> gift = new ArrayList<>();
        //Runtime polymorphism
        gift.add(new Chocolate("dairymilk","100%", 2,10));
        gift.add(new Chocolate("kitkat","100%", 3,20));
        gift.add(new Candy("Skittles","50%", 7,10));
        gift.add(new Candy("Milk way","20%", 6,10));
        gift.add(new Jellybeans("Teadybear","27%",5,2));
        gift.add(new Candy("Laffy Taffy","60%",2,2));
        gift.add(new Candy("Bars","82%",5,7));
        gift.add(new Candy("Nuts","75%",6,4));
        List<Sweets> chocolate=new ArrayList<>();
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Chocolate){
                chocolate.add(gift.get(i));
            }
        }
        //sorted by weigth of choclates
        System.out.println("Chocolates sorted by their weights");
        Collections.sort(chocolate,new Sortbyweigth());
        for(int i=0;i<chocolate.size();i++){
            System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+"gms");
        }
        //sorted by the cost of chocolates
        System.out.println();
        System.out.println("Chocolates sorted by their cost");
        Collections.sort(chocolate,new Sortbycost());
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+"gms");
        }
        //sorted by the type of content
        System.out.println();
        Collections.sort(chocolate,new Sortbytype());
        System.out.println("Chocolates sorted by their content %");
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+"gms");
        }
        // calculates the total weigth of the gifts
        int net_weigth=0;
        for(int i=0;i<gift.size();i++){
            net_weigth+=gift.get(i).weigth;
        }
        System.out.println();
        System.out.println("Total weigth of gift "+net_weigth+"gm");
        //Calculates the total no of candy
        int count_candies=0;
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candy){
                count_candies++;
            }
        }
        System.out.println();
        System.out.println("No of Candies is "+count_candies);
        //candies between range of the cost in between 2 to 5
        System.out.println("");
        System.out.println("candies between range of the cost in between 2 to 5\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candy){
                if(gift.get(i).cost<=5 && gift.get(i).cost>=2) {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of Candy is "+gift.get(i).weigth+"gms");
                }
            }
        }
      //candies between range of the cost in between 2 to 5
        System.out.println("");
        System.out.println("candies between range of the weigth in between 2 to 9\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candy){
                if(gift.get(i).weigth<=5 && gift.get(i).weigth>=2) {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of Candy is "+gift.get(i).weigth+"gms");
                }
            }
        }
        
    }
}
