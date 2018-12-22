package quan.Main;

import java.util.Base64;

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
		
		//
		
	}

}
