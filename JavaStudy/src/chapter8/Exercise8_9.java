package chapter8;

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;
	
	UnsupportedFuctionException(String msg, int errCode) { // 생성자
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg) {
		this.ERR_CODE = 0; // 생성자
	}
	
	public int getErrCode() { 
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrCode() + "]" + super.getMessage();
	}
}


public class Exercise8_9 {

		public static void main(String[] args) throws Exception {
			throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
		}
}


