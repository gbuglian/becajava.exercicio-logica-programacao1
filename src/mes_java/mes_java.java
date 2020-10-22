package mes_java;
import java.util.Scanner;



public class mes_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner recebe = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de meses");
			int meses = recebe.nextInt();
			int total;
		
			total = meses * 30;
			
		System.out.println(total +  " dias é equivalente a " +  meses + " meses ");
	}

}
