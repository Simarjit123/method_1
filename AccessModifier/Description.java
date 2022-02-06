
public class Description {

	private long phoneNo;

	public Description() {

	}

	public Description(long phoneNo) {

		this.phoneNo = phoneNo;
	}

	public long getPhone() {
		return phoneNo;
	}

	public void setPhone(long phone) {
		if (phone != 0) {
			this.phoneNo = phone;
		}
	}

}
