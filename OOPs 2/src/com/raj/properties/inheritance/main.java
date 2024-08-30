package com.raj.properties.inheritance;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        box shape= new box();
        System.out.println(shape.l + " "+shape.w +" "+ shape.h );
        box shape2 = new box(4);
        System.out.println(shape2.l + " "+shape2.w +" "+ shape2.h );
        box shape3= new box(4.4,7.8,9.7);
        System.out.println(shape3.l + " "+shape3.w +" "+ shape3.h );

        box shape4= new box(shape3);
        System.out.println(shape3.l + " "+shape3.w +" "+ shape3.h );
        BoxWeight shape5= new BoxWeight(2,4,5,7);
        System.out.println(shape3.l +" "+ shape5.weight );

        box Box = new BoxWeight(5,6,7,8);
        System.out.println(Box.w);

        
    }
}
