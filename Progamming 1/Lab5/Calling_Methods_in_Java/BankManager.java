import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;
import java.util.List;

public class BankManager {
	
	private static BankAccount[] openAccountFile(String filename) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			
			List<String> rawData = reader.lines().collect(Collectors.toList());
			BankAccount[] accounts = new BankAccount[rawData.size()];
			
			for (int i = 0; i < accounts.length; ++i) {
				String[] splitData = rawData.get(i).split(" ");
				accounts[i] = new BankAccount(splitData[0].trim(), Float.parseFloat(splitData[1]));
			}
			
			return accounts;
		}
		catch (FileNotFoundException e) {
			System.err.println("The input file does not exist.");
			System.err.println(e.getMessage());
		}
		catch (IOException e) {
			System.err.println("Something went wrong trying to read the file.");
			System.err.println(e.getMessage());
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		BankAccount[] accounts = openAccountFile(args[0]);
		
		//Your code goes in here.

		float balance = AccountManagement.overallBalance(accounts);
		String richName = AccountManagement.richest(accounts);
		String poorName = AccountManagement.poorest(accounts);

		System.out.println("The bank has $" + balance +".");
		System.out.println("The richest account is " + richName +".");
		System.out.println("The poorest account is " + poorName +".");
		
		// probably should account for negative balances
		int richLocation = 0;
		int poorLocation = 0;

		for(int i = 0; i < accounts.length; i++){
			if(accounts[i].accountName() == richName){
				richLocation = i;
			}
			else if(accounts[i].accountName() == poorName){
				poorLocation = i;
			}
		}
		
		double poorestBalance = accounts[poorLocation].currentBalance();
		double richestBalance = accounts[richLocation].currentBalance();
		float difference = Math.round(((richestBalance - poorestBalance) / 2f) * 100.0f) / 100.0f;

		accounts[richLocation].withdraw(difference);
		accounts[poorLocation].deposit(difference);
	
		for(int i = 0; i < accounts.length; i++){
			System.out.println(accounts[i].accountName() + " has $" + accounts[i].currentBalance() +".");
		}
	

	}
	
}
