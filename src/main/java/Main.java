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
      // added a try catch in the main function to catch any generic errors made by the user.  
    try {
        Scanner scanner = new Scanner(System.in);
        Shell shell = new Shell();
        int input;
        boolean inputFlag = true;
        
        
        while (inputFlag) {
            shell.resetId();
            Build build = prompts();

            shell.ShowBuild(build);
            System.out.println(" Do you want to do compatibility check? if yes please enter 1, to discard this build and for more options please enter any other number.");
            input = scanner.nextInt();

            if (input == 1) {

                build.CompatibilityCheck();

            }

            System.out.println(" Would you like to do another build? if yes please enter 1, if you want to exit enter 0 ");
            input = scanner.nextInt();

            if (input == 0) {
                inputFlag = false;
            } else {
                System.out.println("a new build has started. ");

            }

        }
        } catch(Exception ex){
            System.out.println("Something wrong happenned with error code: "+ ex);
            System.out.println("Make sure you are following the instructions.");
        }
    }

    // made the program into a function so that the user can call it mulitple times.
    public static Build prompts() {
        Shell shell = new Shell();
        Scanner scanner = new Scanner(System.in);
        
        int input;

        Build build = new Build();

        System.out.println("Please Choose a Cpu: ");
        shell.PrintAllCpus();

        System.out.println("ps: Enter the id of wanted Cpu: ");
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

        return build;
    }
}
