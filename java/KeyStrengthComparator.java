package encryptor1;

import java.util.Comparator;

public abstract class KeyStrengthComparator implements Comparator<EncryptionAlogorithm>{

	public int compare(EncryptionAlogorithm ea1, EncryptionAlogorithm ea2) {
		if(ea1.getKeyStrength() > ea2.getKeyStrength())
			return 1;
		if(ea2.getKeyStrength() > ea2.getKeyStrength())
			return -1;
		return 0;
	}

}
