package sec_functionalinterfaceinjavaAPI.EX02;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Suppler_FuntionallInterface {

	public static void main(String[] args) {
		
		
		//#1. 익명이너클래스 방법 객체 생성
		Supplier<String> s= new Supplier<String>() {

			public String get() {
				
				return "Supplier<T> 함수형 인터페이스";
			}
			
		};
		System.out.println(s.get());
		
		//#2. 기본형 Supplier<T> 인터페이스
		
		Supplier<String> s1 = ()-> "Supplier<T> 함수형 인터페이스";
		System.out.println(s1.get());
		
		//#3. 확장형 Supplier<T> 함수형 인터페이스
		BooleanSupplier s2 = () -> false;
		IntSupplier s3 = () -> 2+3;
		LongSupplier s4 = () -> 10L;
		DoubleSupplier s5 = () -> 5.8;
		System.out.println(s2.getAsBoolean());
		System.out.println(s3.getAsInt());
		System.out.println(s4.getAsLong());
		System.out.println(s5.getAsDouble());
	
	
	}

}
