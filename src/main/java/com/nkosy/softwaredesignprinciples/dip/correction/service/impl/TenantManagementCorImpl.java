package com.nkosy.softwaredesignprinciples.dip.correction.service.impl;

import com.nkosy.softwaredesignprinciples.dip.correction.service.TenantManagementCor;

import java.util.List;

/**
 * Created by nkosy on 2015/03/01.
 */
public class TenantManagementCorImpl implements TenantManagementCor {
    @Override
    public void AddTenant(String tenantName, List tenantList) {
        try{
            tenantList.add(tenantName);
        }
        catch(Exception ex){
            System.out.println("Cannot add tenant " + ex.toString());
        }
    }

    @Override
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

    @Override
    public String DisplayTenants(List tenantLIst) {
        return "" + tenantLIst.toString();
    }
}
