package com.raj.Static;

// class Test{
//    String name;
//
//    public Test(String name){
//        this.name = name;
//
//    }
public class InnerClasses {//Outer class cannot be static
    static class Test{
     String name;

        public Test(String name){
            this.name = name;

        }
    }

    public static void main(String[] args) {
Test a = new Test("raj");
Test b  = new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }

}
