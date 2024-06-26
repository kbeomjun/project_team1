package ATM;

import java.util.Date;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ATM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String spend;//보낸 사람
	private String receive;//받은 사람
	private int amount;//금액
	private Date date;//날짜
	private int money;//현재 금액
	
	public String getDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return format.format(date);
	}
	public void setDate(String str) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		date = format.parse(str);
	}
	
	@Override
	public String toString() {
		return date + " " + spend + " " + "" + " " + amount + " " + money;
	}
	
	public ATM(String date, String spend, int amount) throws ParseException {
		setDate(date);
		this.spend = spend;
		this.amount = amount;
		this.money +=amount;
	}
	
}
