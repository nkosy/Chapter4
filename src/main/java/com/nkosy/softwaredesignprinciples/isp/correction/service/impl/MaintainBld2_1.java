package com.nkosy.softwaredesignprinciples.isp.correction.service.impl;


import com.nkosy.softwaredesignprinciples.isp.correction.service.MaintainBlds2;

/**
 *
 * @author nkosy
 */
public class MaintainBld2_1 implements MaintainBlds2 {
    
    //Only for buildings with elevators
    //Might not work on other buildings and they way the program works is affected
    public boolean MaintainElevator()
    {
        System.out.println("Please check if All the maintanance for the elevator has been done\n");
        System.out.println("Safety circuit");
        System.out.println("Hoistway");
        System.out.println("Door motor brushes");
        System.out.println("Limit Switches");
        
        System.out.println("Check Y/N");
        char check = 'Y';
        
        if(check == 'Y')
            return true;
        return false; 
    }
}
