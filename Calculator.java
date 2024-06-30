import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        while(true){
            System.out.println("enter operator : ");
            char op = sc.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("enter first number : ");
                int n1 = sc.nextInt();
                System.out.println("enter second number : ");
                int n2 = sc.nextInt();

                if(op=='+'){
                    answer=n1+n2;
                }
                if(op=='-'){
                    answer=n1-n2;
                }
                if(op=='*'){
                    answer=n1*n2;
                }
                if(op=='/'){
                    answer=n1/n2;
                }
                if(op=='%'){
                    answer=n1%n2;
                }

                else if(op=='x' || op=='X'){
                    break;
                }
            }

            else{
                System.out.println("invalid operator");
            }

            System.out.println("Answer : "+answer);
            System.out.println();
        }
    }
}
