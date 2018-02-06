/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaitsteptest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author masic
 */
public class Javaitsteptest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass c = new NewClass();
        c.chlup();
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("ptak", "kolibřík");
        map.put("muj ptak", "nejmejší");

        System.out.println(map.get("ptak")); //jedna
        System.out.println(map.get("muj ptak")); //dva
    }
    
}
