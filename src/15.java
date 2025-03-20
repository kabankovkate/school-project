import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = rand.nextInt(10);
        System.out.println(number1);
    }
}
