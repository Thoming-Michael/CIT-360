/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPattern;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class FrontController {
    public static void main(String[] args) {
         Scanner systemInScanner = new Scanner(System.in);
         System.out.println("Enter Blue, Red or Green: ");
         String colorChoice = systemInScanner.next();
    
        ApplicationController myAppController = new ApplicationController();
    
        myAppController.mapCommand("Green", new GreenHandler());
        myAppController.mapCommand("Blue",  new BlueHandler());
        myAppController.mapCommand("Red",   new RedHandler());
        
        HashMap colorMap = new HashMap();
        
        myAppController.handleRequest(colorChoice, colorMap);
    }
       
       
}
