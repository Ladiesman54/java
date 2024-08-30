package com.raj.Static;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    static long population;
    //long population;
static void message(){
    System.out.println("Hello world!");
    //System.out.println(this.age);//Explanation:- for static you cannot use non static stuff.

}

    //Creating a constructor

    /*using public we can access this constructor in other
    classes in sage packege or we can impoer this praticular package into some
    other packages
     */
    public Human(int age,int salary,String name,boolean married){
        this.age =age;
        this.salary=salary;
        this.name=name;
        this.married = married;
        Human.population += 1;//here it is used as instant variable NOT as a static varaiable...
        this.message();


        }


    }
