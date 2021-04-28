/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class Shell {
    
   private Cpu[] supportedCpus;
private Gpu[] supportedGpus;
   
    public Shell() {
         
        this.supportedCpus = new Cpu[3];

    supportedCpus[0] = new Cpu( "Intel", "Core i7", "10700");
    supportedCpus[1] = new Cpu( "Intel", "Core i5", "10600");
    supportedCpus[2] = new Cpu( "Intel", "Core i3", "10320");
    
    this.supportedGpus = new Gpu[3];

    supportedGpus[0] = new Gpu( "Nvidia", "Rtx3000 series" , "RTX 3090");
    supportedGpus[1] = new Gpu( "Nvidia", "Rtx3000 series" , "RTX 3080" );
    supportedGpus[2] = new Gpu( "Nvidia", "Rtx3000 series" , "RTX 3070");
    
    }
            
     public Cpu[] getSupportedCpus() {
        return supportedCpus;
    }

    public void setSupportedCpus(Cpu[] supportedCpus) {
        this.supportedCpus = supportedCpus;
    }

    public void PrintAllCpus(){
    
        
        for (int i = 0 ; i <this.supportedCpus.length  ; i ++){
            System.out.print("ID: " + this.supportedCpus[i].getId());
            System.out.print( " Type:" + this.supportedCpus[i].getType());
            System.out.print( " Series: " + this.supportedCpus[i].getSeries());
            System.out.print( " Generation: " + this.supportedCpus[i].getGeneration());
            System.out.println();
        }
        
    }
    
    public void PrintAllGpus(){
    
        
        for (int i = 0 ; i <this.supportedGpus.length  ; i ++){
            System.out.print("ID: " + this.supportedGpus[i].getId());
            System.out.print( " Type:" + this.supportedGpus[i].getType());
            System.out.print( " Series: " + this.supportedGpus[i].getSeries());
            System.out.print( " Model: " + this.supportedGpus[i].getModel());
            System.out.println();
        }
        
    }
    
    
    public void ShowBuild(Build build){
    
        Cpu cpu = build.getCpu();
        System.out.println("Cpu id: " +cpu.getId() +  " Type: " + cpu.getType()+ " Series: " + cpu.getSeries()+ " Generation: " + cpu.getGeneration());
    
    }
    
    public Cpu GetCpuById(int id){
    
        Cpu tempCpu = null;
        
        for (int i = 0 ; i <this.supportedCpus.length  ; i ++)
        {
        if (id == this.supportedCpus[i].getId())
            tempCpu = this.supportedCpus[i];
        
        }
        return tempCpu;
    }
    
}
