package com.generics;
/*泛型类中的泛型对象只能调用Objct类中的方法*/
public class Generics {

	public static void main(String[] args) {
		
		//用泛型类声明对象时，必须指定类中使用的泛型的具体类名
		Chorous <Singer, MusicalInstruments> model1 = new Chorous<Singer, MusicalInstruments>();
		//创建实例对象时，用具体的类名代替
		model1.makeChorous(new Singer(), new MusicalInstruments());

	}

}
