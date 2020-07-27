package sg.edu.rp.c346.id18004536.demotodolist;


import java.util.Calendar;

public class ToDo {

    private String name;
    Calendar time;

    public ToDo(String name, Calendar time){
        this.name =name;
        this.time =time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String toString(){

        String str = time.get(Calendar.DAY_OF_MONTH)+"/"+time.get(Calendar.MONTH)+"/"+time.get(Calendar.YEAR);

        return str;
    }

    public String getDay(int day){

        String[] days = new String[] { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday" };
        String str = days[day];
        return str;
    }
}
