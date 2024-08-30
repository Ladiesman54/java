package com.raj.properties.inheritance;

public class BoxWeight extends box {
    double weight;
    public BoxWeight(){
        this.weight = -1;

        }
        public BoxWeight(double l,double h,double w,double weight){
                    super(l,h,w);  //super calls the parent class constructor
            //use to initialize the parent class constructor
                    this.weight = weight;
        }
}
