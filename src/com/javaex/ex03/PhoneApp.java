package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("E:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		List<Person> pList = new ArrayList<Person>();

		while (true) {
			String data = br.readLine();
			if (data == null) {
				break;
			}
			String[] dArray = data.split(",");

			String name = dArray[0];
			String hp = dArray[1];
			String company = dArray[2];

			Person person = new Person(name, hp, company);

			pList.add(person);
		}

		for (int i = 0; i < pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println();
		}

		System.out.println("---------------------------------------");

		System.out.println(
				"정우성 정보: " + pList.get(1).getName() + ", " + pList.get(1).getHp() + ", " + pList.get(1).getCompany());

		br.close();
	}

}
