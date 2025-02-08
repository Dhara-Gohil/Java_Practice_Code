class time{
    int hours,minutes;
    public void timeis (int h , int m){
        hours=h;
        minutes=m;
    }
    public void display(){
        System.out.println(hours);
        System.out.println(minutes);
    }
    time sum (time t1,time t2){
        time t4 = new time();
        t4.hours= t1.hours+ t2.hours;
        t4.minutes= t1.hours+ t2.minutes;
        if(t4.minutes>=60){
           do {
               t4.hours++;
               t4.minutes= t4.minutes-60;
           }while (t4.minutes>=60);

        }
        return t4;
    }
}
public class exp5_displaytime {
    public static void main(String[] args) {
        time t1 = new time();
        time t2 = new time();
        time t3 = new time();
        t1.timeis(4,50);
        t2.timeis(6,90);
        t3= t3.sum(t1,t2);
        System.out.println("1st time object : ");
        t1.display();
        System.out.println("2nd time object : ");
        t2.display();
        System.out.println("1st + 2nd : ");
        t3.display();

    }
}

