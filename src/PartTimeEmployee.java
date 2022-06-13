
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
public class PartTimeEmployee extends Employee {
    private int HourOfWork;

    public PartTimeEmployee(int HourOfWork, int severancePay, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart) {
        super(severancePay, Name, Surname, RegisterNumber, Position, YearOfStart);
        this.HourOfWork = HourOfWork;
    }
    
    public int getHourOfWork() {
        return HourOfWork;
    }

    public void setHourOfWork(int HourOfWork) {
        this.HourOfWork = HourOfWork;
    }
    
    public double calculatePayroll(){
        
        if(10 <= Integer.parseInt(this.FirstWeek.getFirstWeek())&&Integer.parseInt(this.FirstWeek.getFirstWeek())<=20){
            HourOfWork= (Integer.parseInt(this.FirstWeek.getFirstWeek()))*18;
        }
        
        if(10 <= Integer.parseInt(this.SecondWeek.getFirstWeek())&& Integer.parseInt(this.SecondWeek.getFirstWeek())<=20){
            HourOfWork = (Integer.parseInt(this.SecondWeek.getSecondWeek()))*18;
        }
 
        if(10 <= Integer.parseInt(this.ThirdWeek.getThirdWeek())&& Integer.parseInt(this.ThirdWeek.getThirdWeek())<=20){
            HourOfWork= (Integer.parseInt(this.ThirdWeek.getThirdWeek()))*18;
        }
       
        if(10 <= Integer.parseInt(this.FourthWeek.getFourthWeek())&&Integer.parseInt(this.FourthWeek.getFourthWeek())<=20){
            HourOfWork = (Integer.parseInt(this.FourthWeek.getFourthWeek()))*18;
        }
      
        return (+severancePay+HourOfWork); 
}

}
    
    
    
    

