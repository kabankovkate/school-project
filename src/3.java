import java.util.Random; 
public class RandomClass{
	public static void main(String[] args){
	Random rand = new Random();
	int randomNumber = rand.nextInt(10);
	System.out.println("Random number: " + randomNumber);
}
}