public class Students {
    //member variables
    String name;
    int id;

    //setter method
    void setRecords(String n, int i){
       name =n;
       id = i;
    }

    //getter method
    void getRecords(){
        System.out.println("Name is : "+name + "with ID : " + id);
    }

    public static void main(String[] args) {
        //syntax or creating an object
        //className objectName = new ClassName();
        Students alp = new Students();
        Students Brce = new Students();
        Students Mike = new Students();

        alp.setRecords("alp", 001);
        Brce.setRecords("Brce", 002);
        Mike.setRecords("Mike", 003);

        Brce.getRecords();
    }
}
