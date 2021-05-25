package com.lee.dabang;

public class DaBang {

	public static void main(String[] args) {
		TeaType tea = TeaType.보성녹차;
		System.out.println("lee 다방에 오신걸 환영합니다");
		TeaType teaTyppes[] = TeaType.values();
		
		/**
		 * 나중에 Enum to list ㅅ사용하여 정리
		 */
		String menu = String.join("/",
				TeaType.감잎차.toString(),
				TeaType.보성녹차.toString(),
				TeaType.율무차.toString());
				
		
		System.out.println(menu);
		String[] menus =  menu.split("/");
		return;
	}

}
