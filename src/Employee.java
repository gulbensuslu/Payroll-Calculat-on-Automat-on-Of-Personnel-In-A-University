
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
public abstract class Employee extends Personnel{
    int severancePay=(Calendar.getInstance().get(Calendar.YEAR)-(Integer.parseInt(YearOfStart)))*(8/10)*20;;

    public Employee(int severancePay, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart) {
        super(Name, Surname, RegisterNumber, Position, YearOfStart);
        this.severancePay = severancePay;
    }

   
    
    public int getSeverancePay() {
        return severancePay;
    }

    public void setSeverancePay(int severancePay) {
        this.severancePay = severancePay;
    }

}
