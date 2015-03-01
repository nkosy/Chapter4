package com.nkosy.config;

import com.nkosy.inheritancealternative.service.Food;
import com.nkosy.inheritancealternative.service.Impl.NormalPlate;
import com.nkosy.objectorientatedprinciples.encapsulation.service.Impl.Employee;
import com.nkosy.objectorientatedprinciples.encapsulation.service.Person;
import com.nkosy.objectorientatedprinciples.inheritance.service.Burger;
import com.nkosy.objectorientatedprinciples.inheritance.service.Impl.BigMac;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.SportsCar;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.Suv;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.Truck;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Vehicle;
import com.nkosy.softwaredesignprinciples.ocp.correction.service.Impl.CaptainSal;
import com.nkosy.softwaredesignprinciples.ocp.correction.service.Impl.CrewSal;
import com.nkosy.softwaredesignprinciples.ocp.correction.service.Salary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nkosy on 2015/02/26.
 */
@Configuration
public class AppConfigCorrection {

    @Bean(name="emp")
    public Person getPerson(){
        return new Employee();
    }

    @Bean(name="kos")
    public Burger getBigMac(){
        return new BigMac();
    }

    @Bean(name="sportscar")
    public Vehicle getSpCar(){
        return new SportsCar();
    }

    @Bean(name="suv")
    public Vehicle getSuv(){
        return new Suv();
    }

    @Bean(name="truck")
    public Vehicle getTruck(){
        return new Truck();
    }

    @Bean(name="alternative")
    public NormalPlate getAlternative(){
        return new NormalPlate();
    }

    @Bean(name="capsalary")
    public Salary getCapSalary(){
        return new CaptainSal();
    }

    @Bean(name="crewsalary")
    public Salary getCrewSal(){
        return new CrewSal();
    }
}