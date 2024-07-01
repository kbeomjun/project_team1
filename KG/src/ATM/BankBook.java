package ATM;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BankBook implements Serializable {
	
	private static final long serialVersionUID = 123L;
	
	private List<ATM> list = new ArrayList<ATM>();
	@NonNull
	private String id;
	@NonNull
	private String pw;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, pw);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankBook other = (BankBook) obj;
		return Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	
	
}
