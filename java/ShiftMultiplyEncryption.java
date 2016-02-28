package encryptor1;

public class ShiftMultiplyEncryption extends ShiftUpEncryption implements EncryptionAlogorithm {
	
	public ShiftMultiplyEncryption(char method, int key) {
		super(method, key);
	}
	
	public String encryotChar(char ch){
		return "" + (char)(ch * this.key);
	}

}
