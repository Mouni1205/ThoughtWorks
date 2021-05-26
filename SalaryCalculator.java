import java.util.*;
public class SalaryCalculator{
    static int totalAmount;
    public static void weekDaysShare(int hoursWorked[]){
        for(int i=1;i<6;i++){
            totalAmount+=hoursWorked[i]*100;
            if(hoursWorked[i]>8)
                totalAmount+=(hoursWorked[i]-8)*15;
        }
    }
    public static void weekEndsShare(int hoursWorked[]){
        if(hoursWorked[0]>0)
            totalAmount+=hoursWorked[0]*125; //bonus for sunday
        if(hoursWorked[6]>0)
            totalAmount+=hoursWorked[6]*150;    //bonus for saturday
    }
    public static void totalSalary(int totalHoursWorked){
        if(totalHoursWorked>40)
            totalAmount+=(totalHoursWorked-40)*25;
        System.out.println(totalAmount);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int hoursWorked[]=new int[7]; // hours worked per each day in a week
        int totalHoursWorked=0;
        for(int i=0;i<7;i++) {
            hoursWorked[i] = scanner.nextInt();
            if(i!=0 && i!=6)            // excluding sunday and saturday
                totalHoursWorked+=hoursWorked[i];
        }
        weekDaysShare(hoursWorked);
        weekEndsShare(hoursWorked);
        totalSalary(totalHoursWorked);
    }
}
