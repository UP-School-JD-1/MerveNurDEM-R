package part1.section11.hm4;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account(9000);
		Account account2 = new Account(8750);

		AccountClient accountClient1 = new AccountClient("Merve", account1);
		accountClient1.withdrawMoney(400);
		accountClient1.depositMoney();
		accountClient1.transferMoney(account2);
	}

}