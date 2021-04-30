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
    private String Capacity;

    public Ram(String type, String series, String Capacity) {
        super(type, series);
        this.Capacity = Capacity;
    }
    
    

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }
    
}
