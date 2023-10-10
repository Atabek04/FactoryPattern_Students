package com.atabek.factories;

import com.atabek.entities.AITU;
import com.atabek.entities.Stanford;
import com.atabek.entities.interfaces.IUniversity;

public class UniversityFactory {
    // This is a factory class for creating IUniversity objects according to name of University
    public IUniversity createUniversity(String name){
        if("AITU".equalsIgnoreCase(name)){
            return new AITU();
        }else if("Stanford".equalsIgnoreCase(name)){
            return new Stanford();
        }
        return null;
    }
}
