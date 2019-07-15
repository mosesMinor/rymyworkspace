public class Conditional {
    /*
    Used to test conditions and return either true or false
    if-statement
    if-else
    if-elseif-else
    switch statement
     */

    public static void main(String[] args) {
        //if
        //syntax if(condition){//code to be run if condition is true}

        int age = 19;
        if(age > 18){
            System.out.println("Adulting starts now");
        }

        //else-if
        double number = 25;

        if (number % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        String weather = "sunny";
        //if weather is raining, tell user to carry umbrella , if not , tell user its not raining

        if (weather.toLowerCase() == "rainy"){
            System.out.println("Carry an umbrella");
        }else {
            System.out.println("It's not raining");
        }

        /*
        if-else-if-else ladder
            checks for multiple condition
            //executes one statement from multiple conditions
            //syntax
            if(condition){
                //execute code
            }else if(condition2){
                //execute this code
            }else if(condition3){
                //execute this code
            }else{
                //default if no condition is true
            }

        */
        int score = 50;
        /*
        if score is less than 50, "Fail"
        if score is between 50 and 60, "Grade D"
        if score is between 61 and 70, "Grade C"
        if score is between 71 and 80, "Grade B"
        if score is between 81 and 90, "Grade A"
        if score is between 91 and 100, "Grade A+ Excellent"
        else print "SCORES INVALID"
        */
        int marks = 94 ;
        if (marks < 50){
            System.out.println("Fail");
        }else if(marks >= 50 && marks <= 60){
            System.out.println("Grade D");
        }else if(marks >= 61 && marks <= 70){
            System.out.println("Grade C");
        }else if(marks >= 71 && marks <= 80){
            System.out.println("Grade B");
        }else if(marks >= 81 && marks <= 90){
            System.out.println("Grade A");
        }else if(marks >= 91 && marks <= 100){
            System.out.println("Grade A+ Excellent");
        }else {
            System.out.println("Scores invalid");
        }

        System.out.println("\n.....\n\t Switch");
        /*
        Syntax
        switch(expression){
            case value1:
                //code to be executed if value1 matches expression;
                break;
            case value2 :
                //code to be executed;
                break;
            default:
                //code to be executed if no matches
        }
         */
        int matchMe = 30;

        switch(matchMe){
            case 10:
                System.out.println("10");break;
            case 20:
                System.out.println("20");break;
            case 30:
                System.out.println("30");break;
            case 40:
                System.out.println("40");break;
            default:
                System.out.println("Not in 10,20,30 or 40");
        }
        /*
        Exercise
        Create a variable weatherCondition and assign it either sunny,rainy,stormy or snowy and using a switch statement ,
        if it's sunny, print : "Hella hot, wear something light"
        if rainy: "Carry an umbrella"
        if windy: "Wear a jacket"
        if stormy: "Avoid the highway"
        if snowy: "stay indoors"
        else "no such weather condition"

        */
        String weatherCondition = "windy";
        switch(weatherCondition){
            case "sunny":
                System.out.println("Hella hot, wear something light");break;
            case "rainy":
                System.out.println("Carry an umbrella");break;
            case "windy":
                System.out.println("Wear a jacket");break;
            case "stormy":
                System.out.println("Avoid the highway");break;
            case "snowy":
                System.out.println("Stay indoors");break;
            default:
                System.out.println("No such weather condition");
        }

    }
}
