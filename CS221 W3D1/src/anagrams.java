
import java.util.Arrays;
import java.util.Scanner;


public class anagrams {
    public static void main(String[] args) {
    	
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();
        
        char c1[] = null;
        char c2[] = null;
        if (s1.length() == s2.length()) {

            c1 = s1.toCharArray();
            c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("Both strings are equal and hence they have anagram");
            } else {
                System.out.println("Sorry No anagram in the strings entred");
            }

        } else {
            System.out.println("Sorry the string do not have anagram");
        }
    }
}