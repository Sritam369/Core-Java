package com.sri.inheritance;

class Grandparent 
{
    String name = "grandparent";
    void act() 
    {
        System.out.println(name);
    }
}

class Paren extends Grandparent 
{
    String name = "parent";
    void act() 
    {
        System.out.println(name);
    }
}

class Chil extends Paren 
{
    String name = "child";
    
}

public class Practice 
{
   public static void main(String[] args) 
   {
        Chil yo = new Chil();
        yo.act();
    }
}











