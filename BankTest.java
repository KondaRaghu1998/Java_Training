package com.drucare.app.task;


public class BankTest {

	public static void main(String[] args) {

		Customer customer1 = new Customer("Raghu", "HYD");
		Customer customer2 = new Customer("Arun", "Rasoolpura");
		Customer customer3 = new Customer("Prashanth", "Medhak");

		Account account1 = new Account(76543456654L);
		Account account2 = new Account(466434569054L);
		Account account3 = new Account(76543455454L);

		
		System.err.println("Transcation process for SBI Bank..!!");
		account1.deposit(20000);
		account1.withDraw(2000);
		System.out.println();
		System.err.println("SBI Details...!!!!");
		RBI sbi = new SBI(3.5, 1000, 10000, customer1, account1);
		SBI sbi2 = (SBI) sbi;
		sbi2.bankName = "SBI";
		sbi2.displayBankName();
		System.out.println("SBI Customer Name :: " + sbi.customer.getName());
		System.out.println("SBI Customer Address :: " + sbi.customer.getAddress());
		System.out.println("SBI Customer Account number :: " + sbi.account.getAccountNumber());
		System.out.println("SBI Customer Account balance :: " + sbi.account.getAmount());
		System.out.println("SBI Have Mininterestrate :: " + sbi.getMinInterestRate());
		System.out.println("SBI Have MinBalanceAllow :: " + sbi.getMinBalanceAllow());
		System.out.println("SBI Have MinBalanceWithdrawalLimit :: " + sbi.getMinBalanceWithdrawalLimit());
        
		
		System.out.println();
		
		
		System.err.println("Transcation process for ICICI Bank..!!");
		account2.deposit(30000);
		account2.withDraw(2000);
		System.out.println();
		System.err.println("ICICI Details...!!!!");
		RBI icici = new ICICI(4.5, 3000, 15000, customer2, account2);
		ICICI icici2 = (ICICI) icici;
		icici2.bankName = "ICICI";
		icici2.displayBankName();
		System.out.println("ICICI Customer Name :: " + icici.customer.getName());
		System.out.println("ICICI Customer Address :: " + icici.customer.getAddress());
		System.out.println("ICICI Customer Account number :: " + icici.account.getAccountNumber());
		System.out.println("ICICI Customer Account balance :: " + icici.account.getAmount());
		System.out.println("ICICI Have Mininterestrate :: " + icici.getMinInterestRate());
		System.out.println("ICICI Have MinBalanceAllow :: " + icici.getMinBalanceAllow());
		System.out.println("ICICI Have MinBalanceWithdrawalLimit :: " + icici.getMinBalanceWithdrawalLimit());

		
		System.out.println();
		
		
		System.err.println("Transcation process for PNB Bank..!!");
		account3.deposit(40000);
		account3.withDraw(2000);
		System.out.println();
		System.err.println("PNB Details...!!!!");
		RBI pnb = new PNB(6.5, 6000, 20000, customer3, account3);
		PNB pnb2 = (PNB) pnb;
		pnb2.bankName = "PNB";
		pnb2.displayBankName();
		System.out.println("PNB Customer Name :: " + pnb.customer.getName());
		System.out.println("PNB Customer Address :: " + pnb.customer.getAddress());
		System.out.println("PNB Customer Account number :: " + pnb.account.getAccountNumber());
		System.out.println("PNB Customer Account balance :: " + pnb.account.getAmount());
		System.out.println("PNB Have Mininterestrate :: " + pnb.getMinInterestRate());
		System.out.println("PNB Have MinBalanceAllow :: " + pnb.getMinBalanceAllow());
		System.out.println("PNB Have MinBalanceWithdrawalLimit :: " + pnb.getMinBalanceWithdrawalLimit());

	}

}
