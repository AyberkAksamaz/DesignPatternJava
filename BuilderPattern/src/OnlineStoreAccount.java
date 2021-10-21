public class OnlineStoreAccount {

	private long id;
	private String name;
	private String address;
	private long budget;
	private long discountRate;
	
	public static class Builder {
		private long id;
		private String name;
		private String address;
		private long budget;
		private long discountRate;
		
		public Builder(long id) {
			this.id = id;
		}
		
		public  Builder withId(long id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder withBudget(long budget) {
			this.budget = budget;
			return this;
		}

		public Builder withDiscountRate(long discountRate) {
			this.discountRate = discountRate;
			return this;
		}
		
		public OnlineStoreAccount build() {
            OnlineStoreAccount onlineStoreAccount = new OnlineStoreAccount();
            onlineStoreAccount.id = this.id;
            onlineStoreAccount.name = this.name;
            onlineStoreAccount.address = this.address;
            onlineStoreAccount.budget = this.budget;
            onlineStoreAccount.discountRate = this.discountRate;
            
            return onlineStoreAccount;
		}
	}

	private OnlineStoreAccount() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public long getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(long discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "OnlineStoreAccount [id=" + id + ", name=" + name + ", address=" + address + ", budget=" + budget
				+ ", discountRate=" + discountRate + "]";
	}
	
	
}
