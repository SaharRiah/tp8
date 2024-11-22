package tp8;

public class NegatifNumberException extends Exception  {
	private String message;
	public NegatifNumberException(String m) {
		this.message=m;
	}
	public String getMessage() {
		return message;
	}
	

}
