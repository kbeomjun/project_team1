package ATM;

public enum BankBookType {
	INSERT(1),
	UPDATE(2),
	DELETE(3),
	EXIT(4);

	private final int value;
	
	private BankBookType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static BankBookType fromValue(int value) {
		for(BankBookType tmp : BankBookType.values()) {
			if(tmp.getValue() == value) {
				return tmp;
			}
		}
		throw new IllegalArgumentException("메뉴 기능을 잘못 선택했습니다.");
	}
}
