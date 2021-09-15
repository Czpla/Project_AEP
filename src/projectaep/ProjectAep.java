/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectaep;

/**
 *
 * @author Eduardo Czpla
 */
public class ProjectAep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bird bird = new Bird();
        
        // Aviary
        bird.setName(69);
        bird.setSize(200);
        
        // Batch
        bird.setnChickens(1000);
        bird.setnBatch(2);
        bird.setStartDate("15/09/2021");
        bird.setEndDate("30/09/2021");
        
        // Bird
        bird.setWeight(1.10);
        bird.setBreed("Rox");
        bird.setAge(1);
        
        // show
        bird.showBatch();
    }
    
}
