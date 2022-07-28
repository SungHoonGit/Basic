
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		
		double valueOfSupply =  Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOfSupply*vatRate;
		double Total = valueOfSupply +VAT;
		double Expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply-Expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ VAT );
		System.out.println("Total : "+ Total );
		System.out.println("Expense : "+ Expense );
		System.out.println("Income : "+ Income );		


		int i = 0;
		while(i < dividendRates.length ) {
			System.out.println("Dividend : "+(Income * dividendRates[i]) );
			i = i + 1;
		}
		
		
	}

}
