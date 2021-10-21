
public class Main {

	public static void main(String[] args) {
		OnlineStoreAccount JohnWick = new OnlineStoreAccount.Builder(1L)
				.withName("JohnWick")
				.withAddress("Anywhere")
				.withBudget(100L)
				.withDiscountRate(2L)
				.build();
		
		System.out.println(JohnWick);
	}
}
