package com.raj.Static;
//************
// ***********
// Uncorrected program of the main 1
//***********
//*************
public class main2 {
        public static void main(String[] args) {

            Human Raj = new Human(22,500,"Raj sekhar pal",false);
            Human Sovan = new Human(36,80000,"Sovan",true);
            Human Arpit = new Human(36,80000,"Arpit ",true);
            System.out.println(Human.population);
            System.out.println(Human.population);
            System.out.println(Human.population);
            greeting();

        }
        //we know that something which is non-static, belongs to object.
        void greeting(){
            System.out.println("Hi I am Raj");
            fun();
        }
        //This is non dependent on the object.
        static void fun(){
            greeting();//You cannot use this because it requires an instance
            //but the function you are using it does nt depend on instance
        }

//  Without the object being created we can access the static variables.

    }
/* Properties which are not directly related  to the
 object but common to all the class are called the static variables.
 */
/*
A static method can only access a static data.It cannot access non static data
 */
}
