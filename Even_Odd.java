import java.util.Scanner;
public class Even_Odd{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
System.out.print("Enter the number:");
                int n = sc.nextInt();
                if(n%2==0){
                        System.out.println("number is Even");
                }
                else{
                        System.out.println("number is odd");
                }
        }
} 