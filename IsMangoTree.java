import java.util.*;
public class CheckMangoTree
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int total_rows=scanner.nextInt();
	    int total_columns=scanner.nextInt();
	    int tree_number=scanner.nextInt();
	if(tree_number<total_columns || tree_number%total_columns==0 || tree_number%total_columns==1)
		System.out.println(“This is MangoTree”);
	else
		System.out.println(“This is not a MangoTree”);
}
}
