/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
// the shell was made to contain all the functionalities of the program.
public class Shell {

    private Cpu[] supportedCpus;
    private Gpu[] supportedGpus;
    private Motherboard[] supportedMotherboards;
    private Ram[]supportedRam;
    private PowerSupply[]supportedPsu;

    public Shell() {
// this simulates retrevied data.
// this contains all the computer parts data in an array lists.
        this.supportedCpus = new Cpu[3];

        supportedCpus[0] = new Cpu("Intel", "Core i7", "10700", "is");
        supportedCpus[1] = new Cpu("Intel", "Core i5", "10600", "is");
        supportedCpus[2] = new Cpu("Intel", "Core i3", "10320", "is");

        this.supportedGpus = new Gpu[3];

        supportedGpus[0] = new Gpu("Nvidia", "Rtx3000 series", "RTX 3090");
        supportedGpus[1] = new Gpu("Nvidia", "Rtx3000 series", "RTX 3080");
        supportedGpus[2] = new Gpu("Nvidia", "Rtx3000 series", "RTX 3070");

        this.supportedMotherboards = new Motherboard[2];
        supportedMotherboards[0] = new Motherboard("Intel", "Z590","is");
        supportedMotherboards[1] = new Motherboard("AMD", "X570", "am4");
        
        
        this.supportedRam = new Ram[2];
        supportedRam[0] = new Ram("Kingston","DDR4","2GB");
        supportedRam[1] = new Ram("Kingston","DDR4","4GB");
        
        this.supportedPsu = new PowerSupply[2];
        supportedPsu[0] = new PowerSupply("Evga","Bronze","350W");
        supportedPsu[1] = new PowerSupply("Evga","Gold","450W");

    }

    public Gpu[] getSupportedGpus() {
        return supportedGpus;
    }

    public void setSupportedGpus(Gpu[] supportedGpus) {
        this.supportedGpus = supportedGpus;
    }

    public Motherboard[] getSupportedMotherboards() {
        return supportedMotherboards;
    }

    public void setSupportedMotherboards(Motherboard[] supportedMotherboards) {
        this.supportedMotherboards = supportedMotherboards;
    }

    public Cpu[] getSupportedCpus() {
        return supportedCpus;
    }

    public void setSupportedCpus(Cpu[] supportedCpus) {
        this.supportedCpus = supportedCpus;
    }

    public Ram[] getSupportedRam() {
        return supportedRam;
    }

    public void setSupportedRam(Ram[] supportedRam) {
        this.supportedRam = supportedRam;
    }

    public PowerSupply[] getSupportedPsu() {
        return supportedPsu;
    }

    public void setSupportedPsu(PowerSupply[] supportedPsu) {
        this.supportedPsu = supportedPsu;
    }

    
    // printAll"computer part" functions are used to show all supported computer parts in the program.
    public void PrintAllCpus() {

        for (int i = 0; i < this.supportedCpus.length; i++) {
            System.out.print("ID: " + this.supportedCpus[i].getId());
            System.out.print(" Type:" + this.supportedCpus[i].getType());
            System.out.print(" Series: " + this.supportedCpus[i].getSeries());
            System.out.print(" Generation: " + this.supportedCpus[i].getGeneration());
            System.out.println();
        }

    }

    public void PrintAllGpus() {

        for (int i = 0; i < this.supportedGpus.length; i++) {
            System.out.print("ID: " + this.supportedGpus[i].getId());
            System.out.print(" Type:" + this.supportedGpus[i].getType());
            System.out.print(" Series: " + this.supportedGpus[i].getSeries());
            System.out.print(" Model: " + this.supportedGpus[i].getModel());
            System.out.println();
        }

    }

    public void PrintAllMotherboards() {
        for (int i = 0; i < this.supportedMotherboards.length; i++) {
            System.out.print("ID: " + this.supportedMotherboards[i].getId());
            System.out.print(" Type:" + this.supportedMotherboards[i].getType());
            System.out.print(" Series: " + this.supportedMotherboards[i].getSeries());
            System.out.println();
        }
    }

    public void PrintAllsupportedRam() {
        for (int i = 0; i < this.supportedRam.length; i++) {
            System.out.print("ID: " + this.supportedRam[i].getId());
            System.out.print(" Type:" + this.supportedRam[i].getType());
            System.out.print(" Series: " + this.supportedRam[i].getSeries());
            System.out.print(" Capacity: " + this.supportedRam[i].getCapacity());
            System.out.println();
        }
    }    
    
    public void PrintAllsupportedPsu() {
        for (int i = 0; i < this.supportedPsu.length; i++) {
            System.out.print("ID: " + this.supportedPsu[i].getId());
            System.out.print(" Type:" + this.supportedPsu[i].getType());
            System.out.print(" Series : " + this.supportedPsu[i].getSeries());
            System.out.print(" Wattage: " + this.supportedPsu[i].getWattage());
            System.out.println();
        }
    } 
    // printAll"computer part" functions are used to show all supported computer parts in the program END.
    
    
    // Get"computer part"ById functions are used to retreive the selected computer part.
    public Cpu GetCpuById(int id) {

        Cpu tempCpu = null;

        for (int i = 0; i < this.supportedCpus.length; i++) {
            if (id == this.supportedCpus[i].getId()) {
                tempCpu = this.supportedCpus[i];
            }

        }
        return tempCpu;
    }

    public Gpu GetGpuById(int id) {

        Gpu tempGpu = null;

        for (int i = 0; i < this.supportedGpus.length; i++) {
            if (id == this.supportedGpus[i].getId()) {
                tempGpu = this.supportedGpus[i];
            }

        }
        return tempGpu;
    }

    public Motherboard GetMotherboardById(int id) {

        Motherboard tempMb = null;

        for (int i = 0; i < this.supportedMotherboards.length; i++) {
            if (id == this.supportedMotherboards[i].getId()) {
                tempMb = this.supportedMotherboards[i];
            }

        }
        return tempMb;
    }
    public Ram GetRamById(int id) {

        Ram tempRam = null;

        for (int i = 0; i < this.supportedRam.length; i++) {
            if (id == this.supportedRam[i].getId()) {
                tempRam = this.supportedRam[i];
            }

        }
        return tempRam;
    }
    public PowerSupply GetPowerSupplyById(int id) {

        PowerSupply tempPsu = null;

        for (int i = 0; i < this.supportedPsu.length; i++) {
            if (id == this.supportedPsu[i].getId()) {
                tempPsu = this.supportedPsu[i];
            }

        }
        return tempPsu;
    }
    // Get"computer part"ById functions are used to retreive the selected computer part END.
    
    // this function was made to rests the Ids whenever you start a new build.
    public void resetId(){
        ComputerComponents computerComponents = new ComputerComponents();
        computerComponents.setSerialNumber(0);
        
    }
    
    // this function prints the selected computer parts in a build object.
    public void ShowBuild(Build build) {

        Cpu cpu = build.getCpu();
        Gpu gpu = build.getGpu();
        Motherboard mb = build.getMotherboard();
        Ram ram = build.getRam();
        PowerSupply Psu = build.getPsu();
        System.out.println("Cpu id: " + cpu.getId() + " Type: " + cpu.getType() + " Series: " + cpu.getSeries() + " Generation: " + cpu.getGeneration());
        System.out.println("Gpu id: " + gpu.getId() + " Type: " + gpu.getType() + " Series: " + gpu.getSeries() + " Model: " + gpu.getModel());
        System.out.println("MB id: " + mb.getId() + " Type: " + mb.getType() + " Series: " + mb.getSeries());
        System.out.println("Ram id: " + ram.getId() + " Type: " + ram.getType() + " Series: " + ram.getSeries()+ "Capacity: " + ram.getCapacity());
        System.out.println("Psu id: " + Psu.getId() + " Type: " + Psu.getType() + " Series: " + Psu.getSeries()+ " Wattage: "+ Psu.getWattage());
    }
    
}
