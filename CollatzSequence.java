import java.util.*;
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        while(number!=1){
            System.out.println(number);
            if(number%2==0)
                number/=2;
            else
                number=(3*number)+1;
        }
        System.out.println(number);
    }
}
