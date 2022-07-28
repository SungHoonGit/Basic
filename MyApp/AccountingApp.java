
public class AccountingApp {
	
	public static double valueOfSupply =  1000.0;
	public static double vatRate = 0.1;
	public static double getVAT( ) {
		return valueOfSupply*vatRate;
	}
	public static double getTotal() {
		return valueOfSupply +getVAT();
	}
	public static void main(String[] args) {
		
		
		
		double expenseRate = 0.3;
		double VAT = valueOfSupply*vatRate;
		//  double vat = getVAT();		
		//	double Total = valueOfSupply +VAT;		double total = getTotal();
		double Expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply-Expense;
		double Dividend1 = Income * 0.5;
		double dividend2 = Income * 0.3;
		double dividend3 = Income * 0.2;

		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ VAT );
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ Expense );
		System.out.println("Income : "+ Income );		
		System.out.println("Dividend 1 : "+ Dividend1 );
		System.out.println("Dividend 2 : "+ dividend2 );
		System.out.println("Dividend 3 : "+ dividend3 );
	}

}
