package time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public @AllArgsConstructor
@Setter
@Getter
class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        String hour = this.hour < 10 ? "0" + this.hour : String.valueOf(this.hour);
        String minute = this.minute < 10 ? "0" + this.minute : String.valueOf(this.minute);
        String second = this.second < 10 ? "0" + this.second : String.valueOf(this.second);

        return hour + "/" + minute + "/" + second;
    }

    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24)
                    hour = 0;
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1)
                    hour = 23;
            }
        }
        return this;
    }


}
