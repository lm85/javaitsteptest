/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaitsteptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
        
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("ptak", 2);
        System.out.println(map2.get("ptak")); //jedna
        
        Map<String, NewClass> map3 = new HashMap<String, NewClass>();
        map3.put("ptak", new NewClass());
        
         Set set = map3.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }
      int a=3;
      //koment
        
        
      
        
         
        
    }
    
}
