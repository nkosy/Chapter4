package com.nkosy.softwaredesignprinciples.plk.violation.service.impl;

import java.util.ArrayList;

/**
 *
 * @author nkosy
 */
public class Report {
    public String PrintReport()
    {
        ArrayList<String> tenantList = new ArrayList<String>();
        
        tenantList.add("VanSchaick");
        tenantList.add("NCC");
        tenantList.add("e-TV");
        TManagement2 obj = new TManagement2();
        
        //violation of PLK
        obj.getOtherObj().setTenantList(tenantList);
        obj.getOtherObj().DisplayTenants(obj.getOtherObj().getTenantList());
        
        return "Printing...";
    }    
}
