import java.util.Scanner;

public class UserInput {
    //accepting user input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("How old are you?");
        double age = input.nextDouble();
        System.out.println("Are you married?");
        boolean married = input.nextBoolean();

        System.out.print("Hi there " + name + ". You're "+ age + " years old ");
        if (married){
            System.out.print("and you're married. ");
        }else {
            System.out.print("and you're not married. ");
        }

        //enter a name and how many times you want that name repeated
        System.out.println("Enter in a word to be repeated ....");
        String toBeRepeated = input.next();
        System.out.println("How many times do you want name to be repeated?");
        int timesToRepeat = input. nextInt();

        for(int i=1; i <= timesToRepeat; i++){
            System.out.println(i + ". " + toBeRepeated);
        }
        /*
        Create a class BMI , that will calculate based on the user input the bmi of the user ask
        the user to enter their weight as a type double, age as type int , their name as type string ,
        and height as type double ,then calculate and return their body mass index

        //Hi there + name , you're years old and your BMI is (BMI) and
         (if > 20 , tell them that it's too high ,
         otherwise tell them it's fine)
        */
    }
}
