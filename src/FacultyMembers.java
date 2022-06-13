
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
public class FacultyMembers extends Academicians{
    
    private int addCourseFee;
    private  int ssBenefits=(baseSalary/100)*135;

    public FacultyMembers(int addCourseFee, int ssBenefits, int severancePay, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart, Monitor FirstWeek, Monitor SecondWeek, Monitor ThirdWeek, Monitor FourthWeek) {
        super(ssBenefits, severancePay, Name, Surname, RegisterNumber, Position, YearOfStart, FirstWeek, SecondWeek, ThirdWeek, FourthWeek);
        this.addCourseFee = addCourseFee;
    }

    public int getAddCourseFee() {
        return addCourseFee;
    }

    public void setAddCourseFee(int addCourseFee) {
        this.addCourseFee = addCourseFee;
    }
      
     public double calculatePayroll(){
        if(40< Integer.parseInt(this.FirstWeek.getFirstWeek())&&Integer.parseInt(this.FirstWeek.getFirstWeek())<=48){
            addCourseFee= (Integer.parseInt(this.FirstWeek.getFirstWeek()) - 40)*20;
        }
        else if(48 < Integer.parseInt(this.FirstWeek.getFirstWeek())){
         addCourseFee= 8*20;
        }
        else{
           addCourseFee=0; 
        }
        
        
        if(40 < Integer.parseInt(this.SecondWeek.getFirstWeek())&& Integer.parseInt(this.SecondWeek.getFirstWeek())<=48){
            addCourseFee = (Integer.parseInt(this.SecondWeek.getSecondWeek()) - 40)*20;
        }
        else if(48 < Integer.parseInt(this.SecondWeek.getSecondWeek())){
         addCourseFee= 8*20;
        }
        else{
           addCourseFee=0; 
        }
        
        
        if(40 < Integer.parseInt(this.ThirdWeek.getThirdWeek())&& Integer.parseInt(this.ThirdWeek.getThirdWeek())<=48){
            addCourseFee = (Integer.parseInt(this.ThirdWeek.getThirdWeek()) - 40)*20;
        }
        else if(48 < Integer.parseInt(this.ThirdWeek.getThirdWeek())){
         addCourseFee= 8*20;
        }
        else{
            addCourseFee=0;
        }
        
        
        if(40 < Integer.parseInt(this.FourthWeek.getFourthWeek())&&Integer.parseInt(this.FourthWeek.getFourthWeek())<=48){
            addCourseFee = (Integer.parseInt(this.FourthWeek.getFourthWeek()) - 40)*20;
        }
        else if(48 < Integer.parseInt(this.FourthWeek.getFourthWeek())){
         addCourseFee= 8*20;
        }
        else{
             addCourseFee=0;
        }   
        
        
        return (baseSalary+addCourseFee+ssBenefits+severancePay); 
     }

    
}
    
