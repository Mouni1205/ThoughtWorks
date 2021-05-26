import java.util.*;
public class SalaryCalculator{
    static int totalAmount;
    static int payPerHour=100,maxHours=8,extraPayforHour=15,sundayBonus=50,
    saturdayBonus=25,maxWeekHours=40,weeklyBonus=25;
    public static void weekDaysShare(int hoursWorked[]){
        for(int i=1;i<6;i++){
            totalAmount+=hoursWorked[i]*payPerHour;
            if(hoursWorked[i]>maxHours)
                totalAmount+=(hoursWorked[i]-maxHours)*extraPayforHour;
        }
    }
    public static void weekEndsShare(int hoursWorked[]){
        if(hoursWorked[0]>0)
            totalAmount+=(hoursWorked[0]*payPerHour*sundayBonus)/100; //bonus for sunday
        if(hoursWorked[6]>0)
            totalAmount+=(hoursWorked[6]*payPerHour*saturdayBonus)/100;    //bonus for saturday
    }
    public static void totalSalary(int totalHoursWorked){
        if(totalHoursWorked>maxWeekHours)
            totalAmount+=(totalHoursWorked-maxWeekHours)*weeklyBonus;
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
