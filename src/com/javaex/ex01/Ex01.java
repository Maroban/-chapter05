package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("E:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("E:\\javaStudy\\file\\byteImg.jpg");
		
		int data;  // -1 체크하려고 사용하는 것.
		
		System.out.println("복사 시작");
		
		while(true) {  // data 값이 -1 될 때까지 한 마디씩 읽다가(read) -1이 되면 종료
			data = in.read();
			if(data == -1) {
				System.out.println("복사 끝:" + data);
				break;
			}
			// data에 저장된 코드를 한 마디씩 data에 넣어 중첩으로 쓴다(write).
			out.write(data);  
		}
		
		out.close();
		in.close();
		
		
	}

}
