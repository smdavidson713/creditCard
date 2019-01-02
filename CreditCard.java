public class CreditCard{

	private Money balance;
	private Money creditLimit;
	private Person owner;

	public CreditCard(Person newCreditCardHolder, Money limit){
		balance = new Money(0);

		creditLimit = new Money(limit);

		owner = newCreditCardHolder;

	}

	public Money getBalance(){
		return balance;
	}
	public Money getCreditLimit(){
		return creditLimit;
	}
	public String getPersonals(){
		return owner.toString();
	}
	public void charge(Money amount){
		if(creditLimit.compareTo(balance.add(amount)) == 1)
			balance = balance.add(amount);
		else
			System.out.println("Error: Your credit limit exceeded the amount");
			
	}
	public void payment(Money amount){
		balance = balance.subtract(amount);
	}

}