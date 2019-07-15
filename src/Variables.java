public class Variables {
    /*
    A variable is a name of reserved area allocated in memory
    3 types of variables
    1.Local variable - is any variable declared inside a method
    2.Instance/Member variable - variable declared inside a class but outside any method
    3.Static variable - declared with the static keyword, it cannot be a local variable
    */
    // instance/member variable
    int a= 45; //instance/member variable - global
    // local var
    void method(){
        int k = 78; //local variable
    }

    //static variable
    static String name = "Grace";

    public static void main(String[] args) {
        //primitive data types
        int number = 45;
        //Integer - helper class
        double marks = 34.87;
        //Double
        char a ='s';
        //Char
        boolean toBe;
        boolean notToBe = true;
        toBe = notToBe || !notToBe;
        if (toBe){
            System.out.println("To be");
        }else{
            System.out.println("Not to be");
        }

        //Non primitive data types
        //Strings and arrays
        String who = new String("Who let the dogs out ??");
        String let = "Who? Who? Who????";
        System.out.println(who + "" + let );

        //arrays
        //syntax
        //type[] arrName = new type[size]
        //type[] nameArr = {};
        double[] num = new double [5];
        //populate
        num[0] = 45.98;
        num[1] = 12.45;
        num[2] = 90;
        num[3] = 987;
        num[4] = 67;
        System.out.println(num);
        String[] classList = {"Alphonce" , "Mike" , "James"};
        System.out.println(classList[1]);

    }



}
