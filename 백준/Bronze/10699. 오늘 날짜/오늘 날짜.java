import java.time.LocalDate;
 
public class Main{
    public static void main(String[] args){
        LocalDate n = LocalDate.now();
       int year = n.getYear();
        String month = n.getMonth().toString();
        int monthValue = n.getMonthValue();
        int dayOfMonth = n.getDayOfMonth();
        int dayOfYear = n.getDayOfYear();
        String dayOfWeek = n.getDayOfWeek().toString();
        int dayOfWeekValue = n.getDayOfWeek().getValue();
        System.out.println(n);
    }
}
