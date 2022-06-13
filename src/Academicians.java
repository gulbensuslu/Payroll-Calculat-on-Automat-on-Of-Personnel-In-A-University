
import java.util.ArrayList;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gulbe
 */
public abstract class Academicians extends Personnel {
    
    protected int baseSalary = 2600;
    private  int ssBenefits ;
    protected int severancePay =(Calendar.getInstance().get(Calendar.YEAR)-(Integer.parseInt(YearOfStart)))*(8/10)*20;

    public Academicians(int ssBenefits, int severancePay, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart, Monitor FirstWeek, Monitor SecondWeek, Monitor ThirdWeek, Monitor FourthWeek) {
        super(Name, Surname, RegisterNumber, Position, YearOfStart, FirstWeek, SecondWeek, ThirdWeek,FourthWeek);
        this.ssBenefits = ssBenefits;
        this.severancePay = severancePay;
    }
    
    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSsBenefits() {
        return ssBenefits;
    }

    public void setSsBenefits(int ssBenefits) {
        this.ssBenefits = ssBenefits;
    }

    public int getSeverancePay() {
        return severancePay;
    }

    public void setSeverancePay(int severancePay) {
        this.severancePay = severancePay;
    }
}

        






















