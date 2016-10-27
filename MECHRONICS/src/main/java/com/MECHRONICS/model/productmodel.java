package com.MECHRONICS.model;

public class productmodel {
	       private String name;
	       private String description;
	       private int quantity;
	       private double price;
	       public String getname()
	       {
	    	   return name;
	       }
           public void setName(String name)
           {
        	   this.name= name;
           }
           public  String getDescription()
           {
        	   return description;
           }
           public void setDescription(String description)
           {
        	   this.description= description;
           }
           public int getquantity()
           {
        	   return quantity;
           }
           public void setquantity(int quantity)
           {
                 this.quantity= quantity;           
           } 
           public void setprice(double price)
           {
        	   this.price= price;
           }
           public double getprice()
           {
        	   return price;
           }
        	   
           }
   
