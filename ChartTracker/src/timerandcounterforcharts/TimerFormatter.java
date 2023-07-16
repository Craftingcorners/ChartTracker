/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timerandcounterforcharts;

/**
 *
 * @author Elizabeth Mock
 */
public class TimerFormatter {

    private int time;

    public TimerFormatter() {
        time = 0;
    }

    public TimerFormatter(int t) {
        time = t;
    }

    public TimerFormatter(String s) {
        time = this.getTimeFromString(s);
    }

    public String getFormattedTime() {
        return getFormattedTime(time);
    }

    public String getFormattedTime(int t) {
        //assumes t is an int in seconds, returns string of hh:mm:ss
        int hours = t / 3600;

        int minutes = (t / 60) % 60;

        int seconds = t % 60;

        return "" + String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
    }

    public int getTimeFromString(String str) {
        //assumes str is in hh:mm:ss format
        String[] strArr = str.split(":");
        int hours = Integer.parseInt(strArr[0]);
        int minutes = Integer.parseInt(strArr[1]);
        int seconds = Integer.parseInt(strArr[2]);

        return hours * 3600 + minutes * 60 + seconds;
    }
    
    
    public int getTime(){
        return time;
    }
    
    public void setTime(int t){
        time = t;
    }
    
    public void setTime(String s){
        time = this.getTimeFromString(s);
    }
    
    public void incTime(){
        time++;
    }

}
