package com.nkosy.softwaredesignprinciples.dip.violation.service;

import java.util.ArrayList;

/**
 * Created by nkosy on 2015/03/01.
 */
public class TManagement {
    private ArrayList<String> tenantList = new ArrayList<String>();
    private TenantManagement obj;

    public String ManageTenants()
    {
        obj = new TenantManagement();
        obj.AddTenant("VanSchaick", tenantList);
        obj.AddTenant("NCC", tenantList);
        obj.AddTenant("e-TV", tenantList);

        obj.setTenantList(tenantList);
        return "" + tenantList;
    }
}
