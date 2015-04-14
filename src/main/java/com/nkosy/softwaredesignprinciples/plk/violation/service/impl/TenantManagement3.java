
package com.nkosy.softwaredesignprinciples.plk.violation.service.impl;

import java.util.ArrayList;
/** This program managers the Tenants in a building
 *This class contains methods that adds, removes and displays
 * tenants on an arrayList
 * Author: Nkosikhona Sibanda (212018183)
 * Date Created: 28 February 2014
 * 
 */
public class TenantManagement3 {
    private ArrayList<String> tenantList = new ArrayList<String>();  

    public ArrayList<String> getTenantList() {
        return tenantList;
    }

    public void setTenantList(ArrayList<String> tenantList) {
        this.tenantList = tenantList;
    }
    
    public void AddTenant(String tenantName, ArrayList<String> tenantList) {
        try{
           tenantList.add(tenantName);
        }
        catch(Exception ex){
            System.out.println("Cannot add tenant " + ex.toString());
        }
    }
    
    public void RemoveTenant(String name, ArrayList<String> tenantList) {
        try
        {
            for(int i = 0; i < tenantList.size(); i++)
            {
                if(name == tenantList.get(i))
                {
                    tenantList.remove(i);
                    System.out.println("Tenant removed!");                
                }
                else
                {
                    System.out.println("Tenant does not exist");
                }
            } 
        }
        catch(Exception ex)
        {
            System.out.println("Error! remove tenant! " + ex.toString());
        }
    }
    
    public String DisplayTenants(ArrayList<String> tenantList)
    {
        return "" + tenantList;
    }
}
