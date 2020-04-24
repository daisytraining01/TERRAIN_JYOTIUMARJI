package com.indivisual.activity;

interface Myinterface{
	
	public int add(int n1,int n2);
}
//Myclass implementing myinterface so implemented add method 
class Myclass implements Myinterface{

	@Override
	public int add(int n1, int n2) {
		
		return n1+n2;
	}
	
	
	//add method is overloaded as my overloaded method expect 3 varialbes
    public int add(int n1, int n2,int n3) {
		
		return n1+n2+n3;
	}
	
}


public class MethodOverloadingAndInterface {

	public static void main(String[] args) {
		
		Myclass m1=new Myclass();
		int i1=m1.add(1, 2);
		int i2=m1.add(20,30,30);
		
		System.out.println(i1);
		System.out.println(i2);
		
		

	}

}
