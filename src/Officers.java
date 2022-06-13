
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
public class Officers extends Personnel{
    private int baseSalary = 2600;
    private  int ssBenefits =(baseSalary/100) * 65 ;
    private int severancePay=(Calendar.getInstance().get(Calendar.YEAR)-(Integer.parseInt(YearOfStart)))*(8/10)*20;;
    private double OverWorkSalary;

    public Officers(int severancePay, double OverWorkSalary, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart, Monitor FirstWeek, Monitor SecondWeek, Monitor ThirdWeek, Monitor FourthWeek) {
        super(Name, Surname, RegisterNumber, Position, YearOfStart, FirstWeek, SecondWeek, ThirdWeek, FourthWeek);
        this.severancePay = severancePay;
        this.OverWorkSalary = OverWorkSalary;
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

    public double getOverWorkSalary() {
        return OverWorkSalary;
    }

    public void setOverWorkSalary(double OverWorkSalary) {
        this.OverWorkSalary = OverWorkSalary;
    }

    public double calculatePayroll(){
        if(40< Integer.parseInt(this.FirstWeek.getFirstWeek())&&Integer.parseInt(this.FirstWeek.getFirstWeek())<=50){
            OverWorkSalary= (Integer.parseInt(this.FirstWeek.getFirstWeek()) - 40)*20;
        }
        else if(50 < Integer.parseInt(this.FirstWeek.getFirstWeek())){
            OverWorkSalary= 10*20;
        }
        else{
           OverWorkSalary=0; 
        }
        
        
        if(40 < Integer.parseInt(this.SecondWeek.getFirstWeek())&& Integer.parseInt(this.SecondWeek.getFirstWeek())<=50){
            OverWorkSalary = (Integer.parseInt(this.SecondWeek.getSecondWeek()) - 40)*20;
        }
        else if(50 < Integer.parseInt(this.SecondWeek.getSecondWeek())){
            OverWorkSalary= 10*20;
        }
        else{
           OverWorkSalary=0; 
        }
        
        
        if(40 < Integer.parseInt(this.ThirdWeek.getThirdWeek())&& Integer.parseInt(this.ThirdWeek.getThirdWeek())<=50){
            OverWorkSalary= (Integer.parseInt(this.ThirdWeek.getThirdWeek()) - 40)*20;
        }
        else if(50 < Integer.parseInt(this.ThirdWeek.getThirdWeek())){
            OverWorkSalary= 10*20;
        }
        else{
            OverWorkSalary=0;
        }
        
        
        if(40 < Integer.parseInt(this.FourthWeek.getFourthWeek())&&Integer.parseInt(this.FourthWeek.getFourthWeek())<=50){
            OverWorkSalary = (Integer.parseInt(this.FourthWeek.getFourthWeek()) - 40)*20;
        }
        else if(50 < Integer.parseInt(this.FourthWeek.getFourthWeek())){
         OverWorkSalary = 10*20;
        }
        else{
             OverWorkSalary =0;
        }   
        
        
        return (baseSalary+OverWorkSalary+ssBenefits+severancePay); 
}

}