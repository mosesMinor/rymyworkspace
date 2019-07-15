public class Loops {
    /*
    //for loop
    for(initialize; condition; incr/decr){//code to be run as long as condition is true}
    */
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println(i + ". Ryan");
        }

        for (int i=10; i<=20; i++){
            if (i % 2 == 0){
                System.out.println(i + " is even");
            }else {
                System.out.println(i + " is odd");
            }

        }
        double[] scores = {56, 89, 34, 65, 89, 23};
        //go through array and print any number greater than 50
        //for (int i=0; i<= scores.length; i++){
        //    if (scores[i] < 50){
        //        continue;
         //   }
        //    System.out.println(scores[i]);
        //}
        //go through the array and print the average in the array
        int sum = 0;
        int average;
        for (int i=0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("Sum = " + sum);
        average = sum / scores.length;
        System.out.println("Average = " + average);

        //nesting a for loop
        /*
        #
        # #
        # # #
        # # # #
        # # # # #
        # # # # # #
        */

        for (int i=1; i<=7; i++){
            for (int j=1; j<i; j++){
                System.out.print(" # ");
            }
            System.out.println();
        }
        //create a multiplication table 1-12
        for (int i=1; i<=12; i++){
            for (int j=1; j<=12; j++){
            int multiply=i*j;
                System.out.print(" "+multiply+" " );
            }
            System.out.println();
        }

        System.out.println("\n While loops \n ............\n");
        /*
        while(condition){//code to be run as long as condition is true}
        */
        int counter = 1000;
        while(counter <= 2000){
            if (counter % 2 !=0){
                System.out.println(counter +" is odd");
            }
            counter++;
        }
        //do while
        /*
        used to run code at least once before checking condition
            do{
            //code to be executed
            }while(condition);

        */
        int printMeAtLeastOnce = 5;

        do{
            System.out.println("I'm awesome!");
            printMeAtLeastOnce++;
        }while (printMeAtLeastOnce <= 10);

    }
}
