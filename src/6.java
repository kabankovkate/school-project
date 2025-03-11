public class RandomCode {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            x += Math.random() * 100;
        }
        System.out.println("The random number is: " + x);
    }
}
