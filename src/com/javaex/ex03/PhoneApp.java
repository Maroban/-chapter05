package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("E:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		Writer fw = new FileWriter("E:\\javaStudy\\file\\PhoneDB-1.txt");
		BufferedWriter bfw = new BufferedWriter(fw);

		List<Person> pList = new ArrayList<Person>();

		String data = "";
		String[] dArray;
		String name, hp, company;

		while (true) {
			data = br.readLine();
			if (data == null) {
				break;
			}
			dArray = data.split(",");

			name = dArray[0];
			hp = dArray[1];
			company = dArray[2];

			Person person = new Person(name, hp, company);

			pList.add(person);
		}

		for (Person p01 : pList) {
			p01.showInfo();
		}

		
		br.close();
		bfw.close();
	}

}
