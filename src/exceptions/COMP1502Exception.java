package exceptions;

public class COMP1502Exception extends Exception {

	private String data;
	
	public COMP1502Exception(String data) {
		super("COMP1502 Exception - caused becaue " + data);
		this.data = data;
	}

	public String getData() {
		return data;
	}
	
	
	

}
