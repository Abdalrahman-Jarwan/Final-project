/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class Cpu extends ComputerComponents {
    
   private String generation;

    public Cpu( String type, String series, String generation) {
        super( type, series);
        this.generation = generation;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

   
    
}
