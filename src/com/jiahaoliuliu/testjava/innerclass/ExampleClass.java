package com.jiahaoliuliu.testjava.innerclass;

public class ExampleClass {

	protected class InnerClass {
		private int id;

		public InnerClass(int id) {
			super();
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "InnerClass [id=" + id + "]";
		}

	}
	private InnerClass innerClass;
	
	private String name;

	public ExampleClass() {}

	public ExampleClass(InnerClass innerClass, String name) {
		super();
		this.innerClass = innerClass;
		this.name = name;
	}

	public InnerClass getInnerClass() {
		return innerClass;
	}

	public void setInnerClass(InnerClass innerClass) {
		this.innerClass = innerClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ExampleClass [innerClass=" + innerClass + ", name=" + name
				+ "]";
	}
}
