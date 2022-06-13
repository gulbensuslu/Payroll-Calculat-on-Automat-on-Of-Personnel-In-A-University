
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
public abstract class FullTimeEmployee extends Employee {
    private int DayOfWork;

    public FullTimeEmployee(int DayOfWork, int severancePay, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart) {
        super(severancePay, Name, Surname, RegisterNumber, Position, YearOfStart);
        this.DayOfWork = DayOfWork;
    }

    public int getDayOfWork() {
        return DayOfWork;
    }

    public void setDayOfWork(int DayOfWork) {
        this.DayOfWork = DayOfWork;
    }
  
}
