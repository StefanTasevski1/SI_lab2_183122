
import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) { //A
        List<Integer> result = new ArrayList<>(); //A

        for (int i = 0; i < timesList.size(); i++) { //B(i = 0 ) C(i < timesList.size()) D(i++)
            int hr = timesList.get(i).getHours(); //E
            int min = timesList.get(i).getMinutes(); //E
            int sec = timesList.get(i).getSeconds(); //E
            if (hr < 0 || hr > 24){//F
                if (hr < 0){ //G
                    throw new RuntimeException("The hours are smaller than the minimum"); //H
                }
                else {
                    throw new RuntimeException("The hours are grater than the maximum"); //I
                }
            }
            else if (hr < 24) { //J
                if (min < 0 || min > 59) // K
                    throw new RuntimeException("The minutes are not valid!"); //L
                else {
                    if (sec >= 0 && sec <= 59) //M
                        result.add(hr * 3600 + min * 60 + sec); //N
                    else
                        throw new RuntimeException("The seconds are not valid"); //O
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) { //P
                result.add(hr * 3600 + min * 60 + sec);
            }
            else {
                throw new RuntimeException("The time is greater than the maximum"); //Q
            }
        }
        return result; //R
    }
}
