/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities2018;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
    
    public class Countries {
    
    private Map<String,String> countries = new HashMap();
    
    public Countries() {
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        countries.put("Russia", "Moscow");
        countries.put("Spain", "Madrid");
        
    }

    @Override
    public String toString() {
        return "Countries{" + "countries=" + countries + '}';
    }
    
    
}

    

