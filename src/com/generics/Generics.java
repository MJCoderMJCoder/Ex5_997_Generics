package com.generics;
/*�������еķ��Ͷ���ֻ�ܵ���Objct���еķ���*/
public class Generics {

	public static void main(String[] args) {
		
		//�÷�������������ʱ������ָ������ʹ�õķ��͵ľ�������
		Chorous <Singer, MusicalInstruments> model1 = new Chorous<Singer, MusicalInstruments>();
		//����ʵ������ʱ���þ������������
		model1.makeChorous(new Singer(), new MusicalInstruments());

	}

}
