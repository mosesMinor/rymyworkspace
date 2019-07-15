public class Methods {
    /*
    Methods are a group of java statements
    that perform some operations on data
    and may or may not return some value
    Syntax
    accessIdentifier(optional) returnType[required] methodName[required](parameter list[optional]){
        //code to be executed when method is called/invoked
    }
        public static void nameOfMethod(int a,int b){
            sout(a+b):
            }

    */

    //method with no return type
    public static void helloWorld(){
        System.out.println("Hello world from java!");
    }

    //non-static method with no return type
    public void betterHello(String name){
        System.out.println("Hi there " + name);
    }

    //non-static method with parameters list and no return type
    void sayBetterHello(String name,int timeOfDay){
        System.out.print("Hi there " + name);
        if(timeOfDay > 12){
            System.out.print(". Do have a lovely afternoon");
        }else {
            System.out.print(". Do have a lovely morning");
        }
        System.out.println();
    }
    //method with a return type
    public int square(int a){
        int squared = a*a;
        return squared;
    }

    public String fullNames(String fName, String lName){
        return fName +" "+ lName;
    }

    //Methods object = new Methods();
    public static void main(String[] args) {
        //invoking a method of type static
        helloWorld();
        //invoking a non-static method
        Methods obj = new Methods();
        obj.betterHello("Grace");
        Methods classMembers = new Methods();
        classMembers.betterHello("Alphonce");

        classMembers.sayBetterHello("Leah", 3);
        classMembers.sayBetterHello("Fola" , 13);

        classMembers.square(10);
        System.out.println("The square of your number is " + obj.square(10));
        String myFullName = obj.fullNames("Mike", "Wambua");
        System.out.println(myFullName);
    }

    //Create a method areaOfCircle that takes in the radius, and returns the area of that circle
    //as type double
    /*
    1. Write a java method to compute the average of three numbers
    2. Write a method to check whether a year(integer) ENTERED BY THE USER is a leap year or not.
    NB propmt the user to enter the year
    3. Write a method to check whether a string is a valid password.
    NB: A password must have at least 10 characters
    */



}
