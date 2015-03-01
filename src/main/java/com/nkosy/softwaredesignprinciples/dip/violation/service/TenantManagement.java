package com.nkosy.softwaredesignprinciples.dip.violation.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nkosy on 2015/03/01.
 */
public class TenantManagement {
    //private ArrayList<String> tenantList = new ArrayList<String>();
    private List tenantList = new ArrayList();


    public List getTenantList() {
        return tenantList;
    }

    public void setTenantList(List tenantList) {
        this.tenantList = tenantList;
    }

    public void AddTenant(String tenantName, List tenantList) {
        try{
            tenantList.add(tenantName);
        }
        catch(Exception ex){
            System.out.println("Cannot add tenant " + ex.toString());
        }
    }

    public void RemoveTenant(String name, List tenantList) {
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

    public String DisplayTenants(List tenantList)
    {
        return "" + tenantList;
    }
}
