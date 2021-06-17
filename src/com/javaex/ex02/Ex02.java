package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		// UTF-8이 아니라 글씨가 깨진다
		// Reader fr = new FileReader("E:\\javaStudy\\file\\MS949.txt");  
		
		Reader fr = new FileReader("E:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine(); // 한줄씩 읽어오며 줄바꿈 기호는 제외한다.
			if (str == null) { 
				break;
			}
			System.out.println(str);
		}
		
		
		
		
		br.close();

	}

}
