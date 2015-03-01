package com.nkosy.softwaredesignprinciples.dip.correction.service;

import java.util.List;

/**
 * Created by nkosy on 2015/03/01.
 */
public interface TenantManagementCor {
    public void AddTenant(String tenantName, List tenantList);
    public void RemoveTenant (String name, List tenantList);
    public String DisplayTenants(List tenantList);
}
