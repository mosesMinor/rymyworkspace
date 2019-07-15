public class DataTypes {
    //Variables
    // dataType varName = value;
    //Two data types
    //primitive data types
    //int, double, boolean, long, short, float, char
    //helper classes int-Integer, double-Double
    //complex data types
    //String, Array
    public static void main(String[] args) {
        System.out.println("Primitive data types \n \t \" int");
        //syntax dataType{required} name[required]=value[optional]
        //int
        //declaring a variable
        int number;
        //assign
        number = 67;
        System.out.println(number);
        number = 458;
        System.out.println(number);
        //add
        int number2 = 567;
        //addition
        int addition = number + number2;
        System.out.println("addition = " + addition);
        //subtaraction
        int subtract = number - number2;
        System.out.println("subtraction = " + subtract);
        //multiplication *
        //modulus.remainder %
        System.out.println("double \n ");
        double marks;
        marks = 67.65;
        System.out.println(marks);
        int age = 45;
        double weight = 68.34;
        weight = age;
        System.out.println(weight);

        //type casting

        age = (int) weight;

        double num = 56.54;
        int ans;
        String name = "567";
        ans = Integer.parseInt(name);
        System.out.println(ans);

        //boolean
        System.out.println("Boolean");
        boolean underage = false;

        if (underage) {
            System.out.println("Not allowed to drive");
        } else {
            System.out.println("Allowed to drive");


        }
    }
}