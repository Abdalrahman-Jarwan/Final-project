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
        System.out.println("Please Choose a Cpu: ");
        shell.PrintAllCpus();
        System.out.println("ps: Enter the id of wanted Cpu: ");
        input = scanner.nextInt();
         build.setCpu(shell.GetCpuById(input));
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
        
        
      
    }
    
}
