/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class Ram extends ComputerComponents {
    private int Capacity;

    public Ram(String type, String series, int Capacity) {
        super(type, series);
        this.Capacity = Capacity;
    }
    
    

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }
    
}
