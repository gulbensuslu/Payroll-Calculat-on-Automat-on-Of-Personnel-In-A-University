
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
public class Security extends Personnel {
    private int HourOfWork;
    private int severancePay=(Calendar.getInstance().get(Calendar.YEAR)-(Integer.parseInt(YearOfStart)))*(8/10)*20;;
    private int TransportationMoney=120;// GÜNLÜK 5 TL
    private int FoodMoney=240;//GÜNLÜK 10 TL

    public Security(int hourOfWork, int severancePay, int TransportationMoney, int FoodMoney, String Name, String Surname, String RegisterNumber, String Position, String YearOfStart) {
        super(Name, Surname, RegisterNumber, Position, YearOfStart);
        this.HourOfWork = hourOfWork;
        this.severancePay = severancePay;
        this.TransportationMoney = TransportationMoney;
        this.FoodMoney = FoodMoney;
    }

    public int getHourOfWork() {
        return HourOfWork;
    }

    public void setHourOfWork(int hourOfWork) {
        this.HourOfWork = hourOfWork;
    }

    public int getSeverancePay() {
        return severancePay;
    }

    public void setSeverancePay(int severancePay) {
        this.severancePay = severancePay;
    }

    public int getTransportationMoney() {
        return TransportationMoney;
    }

    public void setTransportationMoney(int TransportationMoney) {
        this.TransportationMoney = TransportationMoney;
    }

    public int getFoodMoney() {
        return FoodMoney;
    }

    public void setFoodMoney(int FoodMoney) {
        this.FoodMoney = FoodMoney;
    }
    
    public double calculatePayroll(){
        // GÜNDE EN FAZLA 9 SAAT HAFTADA 54 YAPAR , GÜNDE EN AZ 5 SAAT HAFTADA 30 YAPAR 
        if(30 <= Integer.parseInt(this.FirstWeek.getFirstWeek())&&Integer.parseInt(this.FirstWeek.getFirstWeek())<=54){
            HourOfWork= (Integer.parseInt(this.FirstWeek.getFirstWeek()))*10;
        }
        
        if(30 <= Integer.parseInt(this.SecondWeek.getSecondWeek())&& Integer.parseInt(this.SecondWeek.getFirstWeek())<=54){
            HourOfWork = (Integer.parseInt(this.SecondWeek.getSecondWeek()))*10;
        }
 
        if(30 <= Integer.parseInt(this.ThirdWeek.getThirdWeek())&& Integer.parseInt(this.ThirdWeek.getThirdWeek())<=54){
            HourOfWork= (Integer.parseInt(this.ThirdWeek.getThirdWeek()))*10;
        }
       
        if(30 <= Integer.parseInt(this.FourthWeek.getFourthWeek())&&Integer.parseInt(this.FourthWeek.getFourthWeek())<=54){
            HourOfWork = (Integer.parseInt(this.FourthWeek.getFourthWeek()))*10;
        }
      
        return (FoodMoney+TransportationMoney+severancePay+HourOfWork); 
        
    } 
}
