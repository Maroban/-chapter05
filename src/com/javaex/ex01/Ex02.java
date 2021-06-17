package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("E:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("E:\\javaStudy\\file\\byteBufferImg.jpg");
		
		int data;  // -1 체크하려고 사용하는 것.
		// 한 마디가 아닌 1024마디를 한 묶음으로 묶어서 저장.
		byte[] buff = new byte[1024];  
		
		System.out.println("복사 시작");
		while (true) {
			data = in.read(buff);  // 값이 있으면 그 값에 저장
			// data = in.read(); 값이 없으면 data에 저장
			if (data == -1) {
				System.out.println("복사 끝:" + data);
				break;
			}
			out.write(buff);  // 한 묶음으로 읽고 쓰다보니까 한 마디씩 하는 것보다 훨씬 빠르다.
		}
		// 이 한 묶음 개념을 자바에서 BufferStream으로 제공해준다.. 
		// 이건 과정을 배우기 위해 흉내낸 것.
		
		out.close();
		in.close();
	}

}
