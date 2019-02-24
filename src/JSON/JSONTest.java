/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author mthoming
 */
public class JSONTest {
    public static void mainOld(String args[]) throws JSONException {
    
        java.util.List listA = new ArrayList();
        
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("Please enter your name: ");
    	String name = systemInScanner.next();
    	System.out.printf("Please enter your age: ");
    	String age = systemInScanner.next();
    	System.out.printf("Please enter your favorite color: ");
    	String favoriteColor = systemInScanner.next();
       
        listA.add(name);
        listA.add(age);
        listA.add(favoriteColor);        
        
        //Create JSON object
        JSONObject obj = new JSONObject();
        
        //Encode JSON Object
        obj.put("name", name);
        obj.put("age", age);
        obj.put("favoriteColor", favoriteColor);
        //Decode JSON Object
        System.out.println("Name: " + obj.get("name"));
        System.out.println("Age: " + obj.get("age"));
        System.out.println("Favorite Color: " + obj.get("favoriteColor"));
        
    }
    
}
