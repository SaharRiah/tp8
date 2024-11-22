package tp8;

public class JourException extends Exception {
	private String msg;

	public JourException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
