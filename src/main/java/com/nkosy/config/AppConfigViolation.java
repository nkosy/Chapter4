package com.nkosy.config;

import com.nkosy.softwaredesignprinciples.dip.violation.service.TManagement;
import com.nkosy.softwaredesignprinciples.dip.violation.service.TenantManagement;
import com.nkosy.softwaredesignprinciples.isp.violation.service.impl.MaintainBldB;
import com.nkosy.softwaredesignprinciples.isp.violation.service.MaintainBlds;
import com.nkosy.softwaredesignprinciples.lsp.correction.services.impl.ProjectStrathavon;
import com.nkosy.softwaredesignprinciples.lsp.violation.service.impl.ProjectFigo;
import com.nkosy.softwaredesignprinciples.ocp.violation.service.impl.PaymentViolationImpl;
import com.nkosy.softwaredesignprinciples.ocp.violation.service.PaymentViolation;
import com.nkosy.softwaredesignprinciples.plk.violation.service.impl.Report;
import com.nkosy.softwaredesignprinciples.srp.violation.service.impl.LogisticsImpl;
import com.nkosy.softwaredesignprinciples.srp.violation.service.Logistics;
import org.springframework.context.annotation.Bean;

/**
 * Created by nkosy on 2015/02/27.
 */
public class AppConfigViolation {
    @Bean(name="payment")
    public PaymentViolation getPayment(){
        return new PaymentViolationImpl();
    }

    @Bean(name="logistics")
    public Logistics getLogistics(){
        return new LogisticsImpl();
    }

    @Bean(name = "testTM")
    public TenantManagement getTMService(){
        return new TenantManagement();
    }

    @Bean(name = "testVTM")
    public TManagement getTService(){
        return new TManagement();
    }

    @Bean(name = "MBA")
    public MaintainBlds getMBAService(){
        return new MaintainBldB();
    }
    
    @Bean(name = "testPF")
    public ProjectFigo getPFService(){
        return new ProjectFigo();
    }
    
    @Bean(name = "DIY")
    public Report getDIYervice(){
        return new Report();
    }
}
