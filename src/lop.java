import java.util.Scanner;
public class lop {
    public static void main(String[] args) {
        System.out.print("Enter #: ");
        Scanner keyboard =new Scanner(System.in);//user enters number
        int counter = 0;//
        int Sum = 0;
        int i = keyboard.nextInt();
        while (counter <= i ) {
            Sum = Sum+counter;
            counter++;
            System.out.println("Sum " + Sum);


        };


}
}
