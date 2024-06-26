package ATM;

public enum ATMType {
	DEPOSIT(1), 
	WITHDRAW(2), 
	TRANSFER(3),
	EXIT(4);
	
	private final int value;
	
	private ATMType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static ATMType fromValue(int value) {
		for(ATMType tmp : ATMType.values()) {
			if(tmp.getValue() == value) {
				return tmp;
			}
		}
		throw new IllegalArgumentException("메뉴 기능을 잘못 선택했습니다.");
	}
}
