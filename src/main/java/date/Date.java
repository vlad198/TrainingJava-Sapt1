package date;

import lombok.*;

public @Getter
@Setter
@AllArgsConstructor
class Date {
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    @Override
    public String toString() {
        String day = this.day < 10 ? "0" + this.day : String.valueOf(this.day);
        String month = this.month < 10 ? "0" + this.month : String.valueOf(this.month);

        return day + "/" + month + "/" + this.year;
    }
}
