
package com.nkosy.softwaredesignprinciples.isp.violation.service;

/**
 *
 * @author nkosy
 */
public interface MaintainBlds {
    //Every building has a plumping system that has to be maintained
    public boolean InstallPlumping();
    
    //Not every building has an elevator
    public boolean MaintainElevator();   
}
