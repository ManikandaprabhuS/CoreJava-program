package day6.exam;

	public class MarkException extends Exception {
	private int errCode;
	private String errMessage;

	 public MarkException(int errCode, String errMessage) {
	super(errMessage);
	this.errCode = errCode;
	this.errMessage = errMessage;
	}

	 @Override
	public String toString() {
	return "MarkException [errCode=" + errCode + ", errMessage=" + errMessage + "]";
	}

	}
