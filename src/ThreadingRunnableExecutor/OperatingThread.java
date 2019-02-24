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

//Create a model called "OperatingThread" and use the Runnable pattern to make it
public class OperatingThread implements Runnable {
    
    //create a local variable to hold the threadNumber
    private final String threadNumber;

    //Take the string received and assign it to the active threadNumber value
    public OperatingThread(String string){
        this.threadNumber = string;
    }

    //Show the user what thread is being started, and when it's finished
    @Override
    public void run() {
        System.out.println("Starting: " + Thread.currentThread().getName()
                +"\n Active Thread = " + threadNumber);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Finished.");
    }

    //pause for 2 seconds and catch any exceptions that might arise
    private void processCommand() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.threadNumber;
    }

    
}
