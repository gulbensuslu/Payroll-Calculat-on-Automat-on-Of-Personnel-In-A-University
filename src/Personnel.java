
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
public class Personnel{


  
    private String Name;
    private String Surname;
    private String RegisterNumber;
    public String Position;
    protected String YearOfStart;
    Monitor FirstWeek;
    Monitor SecondWeek;
    Monitor ThirdWeek;
    Monitor FourthWeek;
    
  
     
    

    public Personnel(String Name, String Surname, String RegisterNumber, String Position, String YearOfStart) {
        this.Name = Name;
        this.Surname = Surname;
        this.RegisterNumber = RegisterNumber;
        this.Position = Position;
        this.YearOfStart = YearOfStart;
       
    }
    public Personnel(String Name, String Surname, String RegisterNumber, String Position, String YearOfStart, Monitor FirstWeek, Monitor SecondWeek, Monitor ThirdWeek, Monitor FourthWeek) {
        this.Name = Name;
        this.Surname = Surname;
        this.RegisterNumber = RegisterNumber;
        this.Position = Position;
        this.YearOfStart = YearOfStart;
        this.FirstWeek = FirstWeek;
        this.SecondWeek = SecondWeek;
        this.ThirdWeek = ThirdWeek;
        this.FourthWeek = FourthWeek;

    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getRegisterNumber() {
        return RegisterNumber;
    }

    public void setRegisterNumber(String RegisterNumber) {
        this.RegisterNumber = RegisterNumber;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getYearOfStart() {
        return YearOfStart;
    }

    public void setYearOfStart(String YearOfStart) {
        this.YearOfStart = YearOfStart;
    }

    public Monitor getFirstWeek() {
        return FirstWeek;
    }

    public void setFirstWeek(Monitor FirstWeek) {
        this.FirstWeek = FirstWeek;
    }

    public Monitor getSecondWeek() {
        return SecondWeek;
    }

    public void setSecondWeek(Monitor SecondWeek) {
        this.SecondWeek = SecondWeek;
    }

    public Monitor getThirdWeek() {
        return ThirdWeek;
    }

    public void setThirdWeek(Monitor ThirdWeek) {
        this.ThirdWeek = ThirdWeek;
    }
    public Monitor getFourthWeek() {
        return FourthWeek;
    }

    public void setFourthWeek(Monitor FourthWeek) {
        this.FourthWeek = FourthWeek;
    }
    

    @Override
    public String toString() {
        return "Personnel{" + "Name=" + Name 
                + ", Surname=" + Surname
                + ", RegisterNumber=" + RegisterNumber 
                + ", Position=" + Position 
                + ", YearOfStart=" + YearOfStart
                + ", FirstWeek=" + FirstWeek 
                + ", SecondWeek=" + SecondWeek
                + ", ThirdWeek=" + ThirdWeek
                + ",FourthWeek =" + ThirdWeek + '}';
    }
    
    public static ArrayList<Personnel> personnelList = new ArrayList<>();
    
    public String[] getPersonnel(){
      String [] PersonnelArray = new String[4];
      PersonnelArray[0] = this.getName();
      PersonnelArray[1] = this.getSurname();
      PersonnelArray[2] = this.getRegisterNumber();
      PersonnelArray[3]= this.getPosition();
      PersonnelArray[4] = this.getYearOfStart();
      return PersonnelArray;
    }

}
