package sec_functionalinterfaceinjavaAPI.EX05;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperation_FunctionallInterface {

	public static void main(String[] args) {
		
		
		///#1 익명이너클래스를 이요한 객체 생성
//		Function<T,T> = UnaryOperator<T>  
		UnaryOperator<Integer> uo = new UnaryOperator<Integer>() {

			public Integer apply(Integer t) {
					return t*2;
			}
	};
	
	BinaryOperator<String> bo = new BinaryOperator<String>() {
			public String apply(String t, String u) {
				return t+u;
			}
		};
		
		//#2.람다식
		//@1. 기본형
		UnaryOperator<Integer> uo1 = value ->value *2;
		System.out.println(uo1.apply(5));
		
		BinaryOperator<String> bo1 = (value1,value2) ->value1+value2;
		System.out.println(bo1.apply("안녕","하세요"));
		System.out.println();
		//@2. 확장형
		IntUnaryOperator uo2 = (num)->num*10;
		LongUnaryOperator uo3 = (num)->num+10L; //long->long
		DoubleUnaryOperator uo4 = (num)->num*10.0; //double->double
		System.out.println(uo2.applyAsInt(10));
		System.out.println(uo3.applyAsLong(10L));
		System.out.println(uo4.applyAsDouble(30.5));
		
		
		IntBinaryOperator bo2 = (num1,num2)->num1+num2;
		LongBinaryOperator bo3 = (num1,num2)->num1*num2; //long->long
		DoubleBinaryOperator bo4 = (num1,num2)->num1/num2; //double->double
		System.out.println(bo2.applyAsInt(10,20));
		System.out.println(bo3.applyAsLong(10L,20L));
		System.out.println(bo4.applyAsDouble(30.5,40.2));
		
	}

}
