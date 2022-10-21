package sec01_fileandcharset.EX02;

import java.io.File;

public class FileMethods {

	public static void main(String[] args) {
		
		
		//#1. 폴더객체 생성
		File file = new File("C:/Windows");
		
		//#2. 파일메서드
		System.out.println("절대경로:"+file.getAbsolutePath());
		System.out.println("폴더?:"+file.isDirectory());
		System.out.println("파일?:"+file.isFile());
		System.out.println("파일?:"+file.getName());//마지막 이름을 가져온다
		System.out.println("부모폴더?:"+file.getParent());//마지막 이름을 제외한 부모폴더
		
		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir());
		File newfile2 = new File("C:/temp/bcd/cde");
		System.out.println(newfile2.mkdirs());
		
		
		File[] fnames = file.listFiles();
		for(File fname : fnames) {
			System.out.println((fname.isDirectory()? "폴더: ":"파일: ") +fname.getName());
		}
		
	}

}
