/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.softwaredesignprinciples.lsp.violation.service.impl;

import com.mycompany.bulidingManagement.LSP.Violation.Service.Projects;
import java.util.Scanner;

/**
 *
 * @author nkosy
 */
public class ProjectFigo implements Projects {
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
