public class Arrays101 {
    /*
    //2 ways to define array
    //syntax
    type[] arrName = new type[size]
    type[] nameArr = {};
    */

    public static void main(String[] args) {
        //declare array
        //1st way
        int[] numbers = new int[4];

        //populate array
        numbers[0] = 34;
        numbers[1] = 7868;
        numbers[2] = 28;
        numbers[3] = 54;

        //length of array
        System.out.println(numbers.length);

        //access array items
        System.out.println(numbers[1]);

        double[] scores = {45,78,34,90,321,678};
        System.out.println("Score at position 3 is " + scores[2]);

        //iterate/go through
        //for loop
    for (int i=0; i < numbers.length; i++){
        System.out.println("Value at index "+ i +" = " + numbers[i]);
    }
    //forEach /advanced for loop
        /*
        Syntax
        for(type newVar:array){newVar}
         */
        for (int value : numbers){
            System.out.println(value);
        }
        for (double mark : scores){
            System.out.println(mark);
        }
        String[] names = {"Fola","Bruce","Grace","Alphonce","Leah","Kiptoo"};

        //forLoop
        for (int name = 0; name < names.length; name++){
            System.out.println(names[name]);
        }

        //forEach
        for (String name : names){
            System.out.println(name + " Foreach");
        }
        //Assignment
        //print this from the nested array
        String[][] nested =new String[][] {{"Mr.","Mrs.","Ms."},{"Hamisi","Lorna","Sey"}};
        //Mr.Hamisi || Mrs. Sey || Ms. Lorna



    }
}
