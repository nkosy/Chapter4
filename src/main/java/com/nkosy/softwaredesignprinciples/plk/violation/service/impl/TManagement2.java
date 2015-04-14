
package com.nkosy.softwaredesignprinciples.plk.violation.service.impl;

import java.util.ArrayList;

/** This program managers the Tenants in a building
 *This class contains methods that adds, removes and displays
 * tenants on an arrayList
 * Author: Nkosikhona Sibanda (212018183)
 * Date Created: 28 February 2014
 * 
 */
public class TManagement2 {
    
    private ArrayList<String> tenantList = new ArrayList<String>();  

    public void setTenantList(ArrayList<String> tenantList) {
        this.tenantList = tenantList;
    }
    private TenantManagement3 otherObj;

    public TenantManagement3 getOtherObj() {
        return otherObj;
    }
    
    public String ManageTenants()
    {
        otherObj = new TenantManagement3();
        otherObj.AddTenant("VanSchaick", tenantList);
        otherObj.AddTenant("NCC", tenantList);
        otherObj.AddTenant("e-TV", tenantList);
       
        otherObj.setTenantList(tenantList);
        return "" + tenantList;
    }
}
