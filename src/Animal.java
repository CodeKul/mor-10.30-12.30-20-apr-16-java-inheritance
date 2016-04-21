
public class Animal {

    /*state - fields*/
    
    /*
        primitive types - int, char,double, float etc
    */
    
    int numEyes; 
    String animalName; // string behaves as primitive type
    static int animalSize;

    
    /* static gets initilized at the time of class loading .. `*/
    static {
        
        // static block -> called very first before constructor
        animalSize = 20;
        System.out.println("static block");
    }
    
    {
        numEyes = 10;
        animalName = "Raihno";
        // after static block and data from init block will be copied to constructor\
        
        System.out.println("init block");
    }
    
    // constructor initilizes fields while creating objects
    // types of constuctor 1. default 2. paramatrized 3. copy
    
    /* constructor overloading */
    Animal() {
        // default - one who assigns default values to state
        numEyes = 0;
        animalName = "";
        
        System.out.println("Constructor");
    }
    
    Animal(int ne, String nm){
        // paramatrized - one who assigns values through parameter
        numEyes = ne;
        animalName = nm;
    }

    Animal(Animal animal){
        
        numEyes = animal.numEyes;
        animalName = animal.animalName;
    }
    
    /*behaviour - functions or methods*/
    /* method overloading */
    void run(){
        
        System.out.println("Animal.run()");
    }
    
    /* below method is same as above method,
    java neglects return type while overloading
    int run(){
    
        return 0;
    }*/
    
    void run(int speed){
        
        animalSize = 10; // static is accessible inside non static methods
    }
    
    void run(double speed){
        
    }
    
    static void eat(){
        
        // static methods can only access static fields
        animalSize = 20;
        //nmEyes = 10; error
    }
}
