import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
        int i;
        for(i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                System.out.println("Is it a Palindrome : false");
                return;
            }
        }
        System.out.println("Is it a Palindrome? : true");
    }
}
