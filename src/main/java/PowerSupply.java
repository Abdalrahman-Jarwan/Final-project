/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class PowerSupply extends ComputerComponents {
    
    private String Wattage;

    public PowerSupply(String type, String series, String Wattage) {
        super(type, series);
        this.Wattage = Wattage;
    }

    

    public String getWattage() {
        return Wattage;
    }

    public void setWattage(String Wattage) {
        this.Wattage = Wattage;
    }
    
}
