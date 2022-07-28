
public class AccountingIFUnder10000App {

	public static void main(String[] args) {
		
		
		double valueOfSupply =  Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOfSupply*vatRate;
		double Total = valueOfSupply +VAT;
		double Expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply-Expense;
		
		double Dividend1 = Income * 1;
		double dividend2 = Income * 0;
		double dividend3 = Income * 0;

		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ VAT );
		System.out.println("Total : "+ Total );
		System.out.println("Expense : "+ Expense );
		System.out.println("Income : "+ Income );		
		System.out.println("Dividend 1 : "+ Dividend1 );
		System.out.println("Dividend 2 : "+ dividend2 );
		System.out.println("Dividend 3 : "+ dividend3 );
	}

}
