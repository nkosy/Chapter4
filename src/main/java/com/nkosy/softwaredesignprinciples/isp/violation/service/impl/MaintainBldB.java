package com.nkosy.softwaredesignprinciples.isp.violation.service.impl;

import com.nkosy.softwaredesignprinciples.isp.violation.service.MaintainBlds;

import java.util.Scanner;

/**
 *
 * @author nkosy
 */
public class MaintainBldB implements MaintainBlds {
    Scanner input = new Scanner(System.in);
    
     //Every building has a plumping system that has to be maintained
    public boolean InstallPlumping()
    {
        System.out.println("Please check if All the maintanance for Plumbing has been done\n");
        System.out.println("Installed circuit Vent?");
        System.out.println("Installed Stem Fausets");
        System.out.println("Installed Hot water riser");
        System.out.println("Installed Cold water riser");
        
        
        System.out.println("Check Y/N");
        char check = 'N';
        
        while(check != 'N' || check != 'Y')
        {
            System.out.println("Please reply with a 'Y' or 'N' ");
            System.out.println("Check Y/N");
            check = 'N';
        }
        if(check == 'Y')
            return true;
        return false;
    }
    
    //Only for buildings with elevators
    //Dummy method which violates the ISP
    public boolean MaintainElevator()
    {
        return false;
        
    }
}
