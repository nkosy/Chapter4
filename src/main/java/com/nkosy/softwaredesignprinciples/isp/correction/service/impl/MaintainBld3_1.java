package com.nkosy.softwaredesignprinciples.isp.correction.service.impl;

import com.nkosy.softwaredesignprinciples.isp.correction.service.MaintainBlds3;

import java.util.Scanner;

/**
 *
 * @author nkosy
 */
public class MaintainBld3_1 implements MaintainBlds3 {
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
}
