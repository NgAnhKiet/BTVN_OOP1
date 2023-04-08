public class lopDate {
    public static void main(String[] args) {
        Date d = new Date();
        d.display();
        d.setDay(3/3/2023);
        d.display();
        d.setMonth(3);
        d.display();
    }
}
class Date{
    private int day;

    private int month;

    private int year;

    public Date(){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void display(){
        String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";
        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1){
            month = "0" + month;
        }
        if (year.length() == 1){
            year = "0" + year;
        }
        System.out.println(day + "/" + month + "/" + year);
    }
}
