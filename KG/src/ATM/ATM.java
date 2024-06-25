package ATM;

import java.io.Serializable;

public class ATM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String spend;//보낸 사람
	private String receive;//받은 사람
	private int amount;//금액
	private String date;//날짜
	private int money;//현재 금액
	
}
