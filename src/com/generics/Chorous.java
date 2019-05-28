package com.generics;
/*
 * 泛型类声明：
 * class 泛型类名<泛型列表> {
 * 		类体
 * }
 */

/*泛型类中的泛型对象只能调用Objct类中的方法；故重写了Object类的toString()方法*/
class Chorous <E, F> {
	void makeChorous(E person, F yueqi) {
		yueqi.toString();
		person.toString();
	}

}
