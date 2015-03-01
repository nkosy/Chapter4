package com.nkosy.config;

import com.nkosy.softwaredesignprinciples.ocp.violation.service.Impl.PaymentViolationImpl;
import com.nkosy.softwaredesignprinciples.ocp.violation.service.PaymentViolation;
import org.springframework.context.annotation.Bean;

/**
 * Created by nkosy on 2015/02/27.
 */
public class AppConfigViolation {
    @Bean(name="payment")
    public PaymentViolation getPayment(){
        return new PaymentViolationImpl();
    }
}
