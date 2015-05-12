
import java.util.Scanner;

public class converter {

public static void main(String[] args) {

    int input;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number to convert to binary: ");
    input = scan.nextInt();
    convert(input);

}

public static void convert(int num) {
	
    if (num>0) {
    	
        convert(num/2);
        
        System.out.print(num%2 + " ");
    }
}

}
