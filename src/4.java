
public class RandomCode {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10)+1;
        int num2 = (int)(Math.random()*10)+1;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1+num2));
    }
}