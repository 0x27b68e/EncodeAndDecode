package quan.Main;

import java.util.Base64;
import java.util.UUID;

public class Main {
	// refer https://gpcoder.com/4144-base64-encoding-va-decoding-trong-java-8/
	// encode: Mã Hóa, decode: Giải mã
	public static void main(String[] args) {
	// Basic
		
		//encode
		String string = "Nguyen Viet Quan";
		String encode = Base64.getEncoder().encodeToString(string.getBytes());
		System.out.println(encode);
		
		// decode 
		byte[] decode = Base64.getDecoder().decode(encode);
		String string2 = new String(decode);
		System.out.println(string2);
		
		
		//Base 64URL
		String URL = "https://faucet.rinkeby.io/";
		String encodeToString = Base64.getUrlEncoder().encodeToString(URL.getBytes());
		System.out.println(encodeToString);
		
		byte[] decode2 = Base64.getUrlDecoder().decode(encodeToString);
		String decodeURL = new String(decode2);
		System.out.println(decodeURL);
		
		//Base64 MIME
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			stringBuffer.append( UUID.randomUUID().toString());
		}
		String stringMIME = stringBuffer.toString();
		String encodeToString2 = Base64.getMimeEncoder().encodeToString(stringMIME.getBytes());
		System.out.println(encodeToString2);
		
		//decode 
		byte[] decode3 = Base64.getMimeDecoder().decode(encodeToString2.getBytes());
		System.out.println(new String(decode3));
		
		
		
	}

}
