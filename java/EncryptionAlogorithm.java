package encryptor1;


public interface EncryptionAlogorithm {

	public String encryptText(String text);

	public String decryptText(String text) throws InvalidEncryptionKeyException;

	public int getKey();

	public char getMethod();

	public int getKeyStrength();

}
