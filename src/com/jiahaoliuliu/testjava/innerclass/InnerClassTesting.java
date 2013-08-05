package com.jiahaoliuliu.testjava.innerclass;

import com.jiahaoliuliu.testjava.innerclass.ExampleClass.InnerClass;

public class InnerClassTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		
		exampleClass.setInnerClass(exampleClass.new InnerClass(0));
		exampleClass.setName("ExampleClass name");
		
		System.out.println(exampleClass);

		InnerClass innerClass = exampleClass.new InnerClass(1);
		exampleClass.setInnerClass(innerClass);
		
		System.out.println(exampleClass);
	}

}
