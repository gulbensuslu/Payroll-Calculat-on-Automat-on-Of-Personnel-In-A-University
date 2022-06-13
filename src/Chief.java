
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
public class Chief extends FullTimeEmployee{
     private int OverWorkSalary;
     private int dayOfWork = 4*(125*5);//günde 125 ,haftada 125*5 ,ayda 125*5*4

    public Chief(int OverWorkSalary, int DayOfWork, int severancePay, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart) {
        super(DayOfWork, severancePay, Name, Surname, RegisterNumber, Position, YearOfStart);
        this.OverWorkSalary = OverWorkSalary;
    }

    public int getOverWorkSalary() {
        return OverWorkSalary;
    }

    public void setOverWorkSalary(int OverWorkSalary) {
        this.OverWorkSalary = OverWorkSalary;
    }

public double calculatePayroll(){
    
        if(40< Integer.parseInt(this.FirstWeek.getFirstWeek())&&Integer.parseInt(this.FirstWeek.getFirstWeek())<=50){
            OverWorkSalary= (Integer.parseInt(this.FirstWeek.getFirstWeek()) - 48)*15;
        }
        else if(48 < Integer.parseInt(this.FirstWeek.getFirstWeek())){
            OverWorkSalary= 8*15;
        }
        else{
           OverWorkSalary=0; 
        }
        
        
        if(40 < Integer.parseInt(this.SecondWeek.getFirstWeek())&& Integer.parseInt(this.SecondWeek.getFirstWeek())<=50){
            OverWorkSalary = (Integer.parseInt(this.SecondWeek.getSecondWeek()) - 48)*15;
        }
        else if(48 < Integer.parseInt(this.SecondWeek.getSecondWeek())){
            OverWorkSalary= 8*15;
        }
        else{
           OverWorkSalary=0; 
        }
        
        
        if(40 < Integer.parseInt(this.ThirdWeek.getThirdWeek())&& Integer.parseInt(this.ThirdWeek.getThirdWeek())<=50){
            OverWorkSalary= (Integer.parseInt(this.ThirdWeek.getThirdWeek()) - 40)*15;
        }
        else if(48 < Integer.parseInt(this.ThirdWeek.getThirdWeek())){
            OverWorkSalary= 8*15;
        }
        else{
            OverWorkSalary=0;
        }
        
        
        if(40 < Integer.parseInt(this.FourthWeek.getFourthWeek())&&Integer.parseInt(this.FourthWeek.getFourthWeek())<=48){
            OverWorkSalary = (Integer.parseInt(this.FourthWeek.getFourthWeek()) - 40)*15;
        }
        else if(48 < Integer.parseInt(this.FourthWeek.getFourthWeek())){
         OverWorkSalary = 8*15;
        }
        else{
             OverWorkSalary =0;
        }   
        
        
        return (OverWorkSalary+severancePay+dayOfWork); 
}

}
   
    
