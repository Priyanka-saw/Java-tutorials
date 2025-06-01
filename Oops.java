//Encapsulations
// class Employees{
//     private String name = "neha";
//     private int salary = 12222;
//     public String getName(){
//         System.out.println("name : " + this.name);
//         System.out.println("salary : " + this.salary);
//         return name;
//     }
//     public void setName(String name){
//         this.name = name;
//         System.out.println(name);
//     }
// }


//creating class
// class Student {
//     String name;
//     int age;
//     public void getInfo(){
//         System.out.println("student name : " + this.name);
//         System.out.println("age : " + this.age);
//     }
// }


//Inheritance
// class Shape{
//     public void area(){
//         System.out.println("Display area of rectangle");
//     }
// }
// class Tringle extends Shape {
//     public void area(int h, int b){
//         System.out.println("area of triangle : " + (1/2) * h * b);
//     }
// }
// class Circle extends Tringle {
//     public void area(int r){
//         System.out.println("area of circle : " + (22/7) * r * r);
//     }
// }

//polymorphism
// class Students{
//     // String name;
//     // int age;
//     public void displayInfo(String name){
//         System.out.println(name);
//     }
//     public void displayInfo(int age){
//         System.out.println(age);
//     } 
//     public void displayInfo(String name, int age){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }



public class Oops {
    public static void main(String[] args) {
         
        //class object
        // Student s1 = new Student();
        // s1.name = "priyanka";
        // s1.age = 20;
        // s1.getInfo();

        //encapsulations objects
        // Employees e1 = new Employees();
        // // e1.name = "neha";
        // e1.getName();
        // e1.name = "sony";  // this is because privalte
        // e1.setName("priyanka");

        //inheritance
        // Circle c1 = new Circle();
        // c1.area();
        // c1.area(4, 5);
        // c1.area(3);

        //polymorphism
        // Students d1 = new Students();
        // d1.displayInfo("priyanka");
        // d1.displayInfo(21);
        // d1.displayInfo("Sneha", 22);


    }

}
