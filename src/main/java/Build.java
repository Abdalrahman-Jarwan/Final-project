/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
// this class is made to contain all the selcted computer parts.
public class Build {
    
    private Cpu cpu;
    private Gpu gpu;
    private Motherboard motherboard;
    private Ram ram;
    private PowerSupply Psu;

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public PowerSupply getPsu() {
        return Psu;
    }

    public void setPsu(PowerSupply Psu) {
        this.Psu = Psu;
    }
    
    

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    
    public void CompatibilityCheck(){
        
    // simulate a compatability check.
    // you can add any type of compatability check here.
    
    //motherboard and cpu compatibility
    if ( this.motherboard.getSocket().equals(this.cpu.getSocket()))
    {
    System.out.println("Cpu and mother board are compatable");
    }
    else {
    System.out.println("Cpu and mother board are uncompatable");
    }
    // psu effecient or not
    if (this.Psu.getWattage()< 650){
    System.out.println("Low power effeincey");
    } 
    else {
        System.out.println("power is efficient");
    }
    
    if (this.ram.getCapacity()< 8){
    System.out.println("Low ram capacity ");
    } 
    else {
        System.out.println("Ram capacity is enough");
    }
    
    } 
    
  
}
