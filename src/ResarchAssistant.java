
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gulbe
 */
public class ResarchAssistant extends Academicians {
    private  int ssBenefits=(baseSalary/100)*105;

    public ResarchAssistant(int ssBenefits, int severancePay, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart, Monitor FirstWeek, Monitor SecondWeek, Monitor ThirdWeek, Monitor FourthWeek) {
        super(ssBenefits, severancePay, Name, Surname, RegisterNumber, Position, YearOfStart, FirstWeek, SecondWeek, ThirdWeek, FourthWeek);
    }
 
    public double calculatePayroll(){
     int payroll=ssBenefits+baseSalary+severancePay;
        return 0;
     
 }
}

