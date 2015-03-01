package com.nkosy.config;

import com.nkosy.softwaredesignprinciples.dip.violation.service.TManagement;
import com.nkosy.softwaredesignprinciples.dip.violation.service.TenantManagement;
import com.nkosy.softwaredesignprinciples.ocp.violation.service.Impl.PaymentViolationImpl;
import com.nkosy.softwaredesignprinciples.ocp.violation.service.PaymentViolation;
import com.nkosy.softwaredesignprinciples.srp.violation.service.Impl.LogisticsImpl;
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
}
