import java.util.Scanner;
import java.text.NumberFormat;
public class MortgageCalc {
	public static void main(String[] args) {
		MortgageCalc mortagage_score = new MortgageCalc();
		mortagage_score.mortgageCalculation();
	}
	
	public double mortgageCalculation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Principal: ");
		int p = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double r = (double) input.nextInt();
		
		System.out.print("Period (Years): ");
		double  n = input.nextInt();
		
		double top_eq  = (double) 1 + r;
		double power = (double) Math.pow(top_eq, n);
		double top_eq_final = (double) power * r;
		double mortagage = Math.round(p*(((r*top_eq_final)/(top_eq_final-1))));
		String mortagageFormat = NumberFormat.getCurrencyInstance().format(mortagage);
		System.out.println("The Mortgage is: " + mortagageFormat);
		return mortagage;
	}
}
