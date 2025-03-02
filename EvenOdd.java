

import java.util.Scanner;
public class EvenOdd{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter any number :");
int a = input.nextInt();

if(a%2==0){
    System.out.println("your entered a Even number");
}
else{
    System.out.println("you entered an Odd number");
    }

}
}