package sec01_fileandcharset.EX03;

import java.io.UnsupportedEncodingException;

public class EUCKR_vs_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//#1.EUC-KR VS MS949
		byte[] b1="a".getBytes("EUC-KR"); //문자열-->byte[]
		byte[] b2="a".getBytes("MS949"); //문자열 ->byte[]
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1,"EUC-KR")); //byte[]--> 문자열
		System.out.println(new String(b2,"MS949")); //byte[]--> 문자열
		System.out.println();
		System.out.println("=========================");
		byte[] b3="가".getBytes("EUC-KR"); //문자열-->byte[]
		byte[] b4="가".getBytes("MS949"); //문자열 ->byte[]
		
		System.out.println(b3.length); //2
		System.out.println(b4.length); //2
		
		System.out.println(new String(b3,"EUC-KR")); //byte[]--> 문자열
		System.out.println(new String(b4,"MS949")); //byte[]--> 문자열
		System.out.println();
		System.out.println("=========================");
		
		byte[] b5="뷁".getBytes("EUC-KR"); //문자열-->byte[]
		byte[] b6="뷁".getBytes("MS949"); //문자열 ->byte[]
		
		System.out.println(b5.length); //1 한글인지 인식못해서 1바이트 나옴
		System.out.println(b6.length); //2
		
		System.out.println(new String(b5,"EUC-KR")); //byte[]--> 문자열
		System.out.println(new String(b6,"MS949")); //byte[]--> 문자열
		System.out.println();
	}

}
