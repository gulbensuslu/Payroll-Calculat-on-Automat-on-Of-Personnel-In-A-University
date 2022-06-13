
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gulbe
 */
public class Monitor {
    private String RegisterNumber;
    private String FirstWeek;
    private String SecondWeek;
    private String ThirdWeek;
    private String FourthWeek;
    
    

    public Monitor(String RegisterNumber, String FirstWeek, String SecondWeek, String ThirdWeek, String FourthWeek) {
        this.RegisterNumber = RegisterNumber;
        this.FirstWeek = FirstWeek;
        this.SecondWeek = SecondWeek;
        this.ThirdWeek = ThirdWeek;
        this.FourthWeek = FourthWeek;
    }
    

    public String getRegisterNumber() {
        return RegisterNumber;
    }

    public void setRegisterNumber(String RegisterNumber) {
        this.RegisterNumber = RegisterNumber;
    }

    public String getFirstWeek() {
        return FirstWeek;
    }

    public void setFirstWeek(String FirstWeek) {
        this.FirstWeek = FirstWeek;
    }

    public String getSecondWeek() {
        return SecondWeek;
    }

    public void setSecondWeek(String SecondWeek) {
        this.SecondWeek = SecondWeek;
    }

    public String getThirdWeek() {
        return ThirdWeek;
    }

    public void setThirdWeek(String ThirdWeek) {
        this.ThirdWeek = ThirdWeek;
    }

    public String getFourthWeek() {
        return FourthWeek;
    }

    public void setFourthWeek(String FourthWeek) {
        this.FourthWeek = FourthWeek;
    }

    @Override
    public String toString() {
        return "Monitor{" + "RegisterNumber=" + RegisterNumber
                + ", FirstWeek=" + FirstWeek 
                + ", SecondWeek=" + SecondWeek 
                + ", ThirdWeek=" + ThirdWeek 
                + ", FourthWeek=" + FourthWeek + '}';
    }
    public static ArrayList<Monitor> MonitoringList = new ArrayList<>();
    
    public String[] getMonitor(){
      String [] MonitorArray = new String[4];
      MonitorArray[0] = this.getRegisterNumber();
      MonitorArray[1] = this.getFirstWeek();
      MonitorArray[2] = this.getSecondWeek();
      MonitorArray[3]= this.getThirdWeek();
      MonitorArray[4] = this.getFourthWeek();
      return MonitorArray;
    }
}
