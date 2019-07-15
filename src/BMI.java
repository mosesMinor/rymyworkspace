import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your weight?");
        double weight = input.nextDouble();
        System.out.println("How old are you?");
        double age = input.nextDouble();
        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("What is your height?");
        double height = input.nextDouble();
        double BMI = weight/(height*height);

        System.out.print("Hi there "+ name +". You're "+ age +" years old and your BMI is "+ BMI );
        if (BMI > 20){
            System.out.print(" which is too high. ");
        }else {
            System.out.print(" which is fine. ");
        }

    }
}
