

public class Main {
    public static void main(String[] args) {
       
        Complex num1=new Complex(6,7);
        Complex num2=new Complex(3,2);

    System.out.println("Complex Number 1: "+ num1);
    System.out.println("Complex Number 2: "+ num2);

    Complex Addition=num1.add(num2);
    System.out.println("Complex Addition: " +Addition);

     Complex Subtraction=num1.subtract(num2);
    System.out.println("Complex Subtraction: " +Subtraction);

     Complex Multiplication=num1.Multiply(num2);
    System.out.println("Complex Multiplication: " +Multiplication);

    Complex Copy=new Complex(num1);
    System.out.println("Copy: "+ Copy);
    }
    
}