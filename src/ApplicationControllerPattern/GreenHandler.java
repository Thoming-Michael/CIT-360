/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPattern;

import java.util.HashMap;
import JSON.quickconnectfamily.*;

/**
 *
 * @author mthoming
 */
public class GreenHandler implements Handler {
    
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        try{
            System.out.println("Green Handler was called.");

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
