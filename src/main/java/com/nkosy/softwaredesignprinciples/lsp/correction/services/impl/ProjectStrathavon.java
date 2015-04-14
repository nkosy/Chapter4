
package com.nkosy.softwaredesignprinciples.lsp.correction.services.impl;


/**
 *
 * @author nkosy
 */
public class ProjectStrathavon extends ProjectFigo2{
    public ProjectStrathavon()
    {
        super();
    }
    
    public String PrintDetails()
    {
        boolean status = super.MaintainElevator();
        
        if( status == true)
            return "Elevator Maintanance has been done!";
        
        return "Elevator Maintanance not done!";
      
    }
    
}
