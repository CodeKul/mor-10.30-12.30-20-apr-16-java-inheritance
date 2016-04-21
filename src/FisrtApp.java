
public class FisrtApp {

    /*
        public - application wide access
        static - object is not necessary
        void - return type 
        main - name of method, jvm will call this method
        args - arguments given while execution (command line arguments)
    
    */
    public static void main(String[] args) {
        
        inheritance();
        
    }
    
    public static void inheritance() {
        
        Tiger tiger = new Tiger();
        tiger.run();
    }
    
    public static void classAndObjects() {
        
        Animal animal = new Animal(); // object creation
        animal.run();
        animal.run(12);
        animal.run(12.32d);
        
        Animal animalPara = new Animal(12, "Tiger");
        
        Animal animalCopy = new Animal(animal);
        
        
        Animal.animalSize = 20;
        
        System.out.println("");
    }
}


