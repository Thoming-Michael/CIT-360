/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadingRunnableExecutor;

/**
 *
 * @author mthoming
 */
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadingPool {

    public static void mainOld(String[] args) {
        
        //ask the user how large of a threadpool they want to use
        System.out.println("How big of a threadpool do you want to use? ");
        Scanner systemInScanner = new Scanner(System.in);
        int userDefinedThreadPool = systemInScanner.nextInt();
        
        //instantiate a new executor using the ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(userDefinedThreadPool);
        
        //ask the user how many threads/tasks to execute                
        System.out.println("How many threads do you want to use? ");
        int userDefinedThreadCount = systemInScanner.nextInt();
        
        //loop and activate a new thread according to the number stated by the user
        //Call a new OperatingThread and pass in the string variable

        for (int i = 0; i <= userDefinedThreadCount; i++) {
            Runnable operating = new OperatingThread("Active Thread: " + i);
        //start an executor for each thread using the opertaing value that was just created
            executor.execute(operating);
          }
        
        //gracefully exit the executor
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        //SHow the user how many threads were started and completed
        System.out.println("Threads completed: " +userDefinedThreadCount);
               
    }
    
}
