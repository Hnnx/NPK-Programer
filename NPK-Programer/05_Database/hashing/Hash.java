package hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

	public static void main(String[] args) {
		
		
		try {
			BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Vnesi niz: ");
			String vneseniNiz = vhod.readLine();
			
			
			//MessageDigest najprej resetiramo, updejtamo z getBytes na nas string
			MessageDigest msg = MessageDigest.getInstance("SHA-512");
			msg.reset();
			msg.update(vneseniNiz.getBytes());
			
			byte[] digest = msg.digest();
			
			//digest spremeni msg v bitni zapis
			//COnvertamo v BigInt 			
			
			BigInteger bigInt = new BigInteger(1, digest);			
			String hashText = bigInt.toString(16);
			
			System.out.println("Print hashText:");
			System.out.println(hashText);
			System.out.println();
			
			//Dodamo salt			
			System.out.println("Print salt:");
			String salt = generateSalt();
			System.out.println(salt);
			System.out.println();
			
			hashText += salt;
			
			msg.reset();
			msg.update(hashText.getBytes());
			
			digest = msg.digest();
			
			bigInt = new BigInteger(1, digest);
			
			System.out.println("Print hash + salt:");
			hashText = bigInt.toString(16);
			System.out.println(hashText);
			
		} catch (IOException  | NoSuchAlgorithmException e) {
			
			System.out.println("Prislo je do napake! " + e.toString() + e.getMessage());

		}

	
	}


	//za res varnostno aplkacijo se ne uporablja random!
	public static String generateSalt() {
		String salt = "";

		for(int i = 0; i < 64; i++) {
			int rand = (int) (Math.random()* 25 + 97);

			char znak = (char) rand;

			salt += znak;
		} 

		return salt;
	}

}
