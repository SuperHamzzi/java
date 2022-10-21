package sec01_fileandcharset.EX05;

import java.nio.charset.Charset;

public class CreateCharsetObject {

	public static void main(String[] args) {
		
		Charset cs1 = Charset.defaultCharset();
		Charset cs2 = Charset.forName("MS949");
		Charset cs3 = Charset.forName("UTF-8");
		
		System.out.println(cs1); //UTF-8
		System.out.println(cs2); //MS949
		System.out.println(cs3); //UTF-8
		
		System.out.println(Charset.isSupported("MS949")); //지원합니까?
		System.out.println(Charset.isSupported("UTF-8")); //지원합니까?
		
		
	}

}
