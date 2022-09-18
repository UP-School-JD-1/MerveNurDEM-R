package part1.section11.hm4;

import java.util.Scanner;

public class AccountClient {

	private String name;
	private Account account;

	public AccountClient(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double withdrawMoney(int money) {
		account.setBalance(account.balance - money);
		System.out.println("Current balance: " + account.balance);
		return account.balance;
	}

	public void depositMoney() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw:");
		double money = scan.nextDouble();
		account.setBalance(account.balance - money);
		System.out.println("Current balance: " + account.balance);
	}

	double transferCost = 8.7;

	public void transferMoney(Account account2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount you want to transfer:");
		double transfer = scan.nextDouble();
		account2.balance += transfer;
		account.balance -= transfer + transferCost;
		System.out.println("The amount you transfer: " + transfer);
		System.out.println("Current balance:" + account.balance);
	}
}