/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melayer
 */
/* Tiger is an Animal ... */
public class Tiger extends Animal {

    // super referes to parent class ..
    public Tiger() {

        animalName = "tiger";
        animalSize = 20;
    }

    @Override// annotation, compiler uses annotation and neglects comments
    void run() {
        //super.run();  // this invokes run method of parent
        
        System.out.println("Tiger.run()");
    }

    void countStrips() {

        System.out.println("Strips - 10");
    }
}
