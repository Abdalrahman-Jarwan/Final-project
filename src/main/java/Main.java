/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Shell shell = new Shell();
  
        Scanner scanner = new Scanner(System.in);
  
        
        int input;
        
        boolean inputFlag = true;
        Build build = new Build();
        
        while (inputFlag ){
        System.out.println("Please Choose a Cpu , and a Gpu: ");
        shell.PrintAllCpus();
        
        System.out.println("ps: Enter the id of wanted Cpu , Gpu: ");
        input = scanner.nextInt();
         build.setCpu(shell.GetCpuById(input));
         
         System.out.println("Please Choose a Gpu: ");
         shell.PrintAllGpus();
         System.out.println("ps: Enter the id of wanted Gpu: ");
         input = scanner.nextInt();
         build.setGpu(shell.GetGpuById(input));
         
         System.out.println("Please Choose a Motherboard: ");
         shell.PrintAllMotherboards();
         System.out.println("ps: Enter the id of wanted Motherboard: ");
         input = scanner.nextInt();
         build.setMotherboard(shell.GetMotherboardById(input));
         
         System.out.println("Please Choose a Ram: ");
         shell.PrintAllsupportedRam();
         System.out.println("ps: Enter the id of wanted Ram: ");
         input = scanner.nextInt();
         build.setRam(shell.GetRamById(input));
         
         System.out.println("Please Choose a PowerSupply: ");
         shell.PrintAllsupportedPsu();
         System.out.println("ps: Enter the id of wanted PowerSupply: ");
         input = scanner.nextInt();
         build.setPsu(shell.GetPowerSupplyById(input));
         
         inputFlag = false;
         
         /*switch(input)
        {
        
            case "1":
            shell.PrintAllCpus();
            break;
            case "2":
            shell.PrintAllGpus();
            break;
        }*/
         
        }
    shell.ShowBuild(build);
        System.out.println(" Do you want to do a compatibility check? if yes enter 1, enter 0 to exit. ");
        input = scanner.nextInt();
        
        if (input == 1){
        // do compatibility check.
        
        
        }
        else if (input == 0)  {
        System.out.println(" Program has finished.");
        }
      
    }
    
}
