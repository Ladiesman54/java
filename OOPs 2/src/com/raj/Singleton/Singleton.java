package com.raj.Singleton;
//Singleton class is class which we can create one object.
public class Singleton {
   //Private means this constructor only be used in this java class only

    private int num  = 0;
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton GetInstance() {
//Check wheather the object is created or not
        if(instance ==null){

            instance = new Singleton();
        }else{
            return instance;
        }
return null;

    }

}
