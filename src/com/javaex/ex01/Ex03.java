package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("E:\\javaStudy\\file\\img.jpg");
		// 주 스트림이랑 보조 스트림이랑 연결하기 위해 보 조스트림 값에 주 스트림을 넣는다.
		BufferedInputStream bin = new BufferedInputStream(in);

		OutputStream out = new FileOutputStream("E:\\javaStudy\\file\\buffImg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		int data; // -1 체크하려고 사용하는 것.
		System.out.println("복사 시작");
		while (true) {
			data = bin.read();
			if (data == -1) {
				System.out.println("복사 끝: " + data);
				break;
			}
			bout.write(data);
		}

		bout.close();
		bin.close();
		
	}

}
