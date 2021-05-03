/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class ComputerComponents {
    
   private int id;
   private String type;
   private String series;
  // giving ids to computer components to simulate a functioning database. 
   private static int serialNumber =0;

    public ComputerComponents( String type, String series) {
        // incremental ids to simulate database serial ids
        this.id = this.serialNumber++;
        this.type = type;
        this.series = series;
        
    }

    public ComputerComponents() {
        // made this constructor to reset ids to 0
    }

    public static void setSerialNumber(int serialNumber) {
        ComputerComponents.serialNumber = serialNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

   
    
    
}
