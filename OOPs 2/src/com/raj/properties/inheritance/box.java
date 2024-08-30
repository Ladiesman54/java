package com.raj.properties.inheritance;

public class box {
    double l;
    double h;
    double w;
    box(){
        this.l = -1;
        this.h= -1;
        this.w = -1;

    }
    //cube
    box(double side){
this.l=side;
this.h=side;
this.w=side;

    }

    //cuboid
   public box(double l,double h,double w){
        this.h =h;
        this.l =l;
        this.w=w;

    }
    //copy consturctor box(box__)
    box(box old){
    this.w=old.w;
    this.l= old.l;
    this.w=old.w;
    }
public void informaton(){
    System.out.println("running the box");
}
}
