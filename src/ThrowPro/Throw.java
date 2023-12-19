package ThrowPro;

public class Throw {

	public static void main(String[] args) {
		
		int x = 0;
		if(x == 0) {
			System.out.println("Bölen 0' a eşit olamaz.!!");
			throw new ArithmeticException("Exception! ");
		}
		System.out.println("Kodun Devamı");

	}

}
