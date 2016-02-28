package encryptor1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShiftUpEncryptionTest {

	@Test
	public void test1() {
		ShiftUpEncryption shift = new  ShiftUpEncryption('E', 2);
		String res = shift.encryptText("abc");
		assertEquals("cde", res);
	}
	
	@Test
	public void test2() {
		ShiftUpEncryption shift = new  ShiftUpEncryption('D', 1);
		String res = "";
		try {
			res = shift.decryptText("bcd");
		} catch (InvalidEncryptionKeyException e) {
		}
		assertEquals("abc", res);
	}
	
	@Test
	public void test3() {
		ShiftUpEncryption shift = new  ShiftUpEncryption('E', 2);
		int key = shift.getKey();
		assertEquals(2, key);
	}

}
