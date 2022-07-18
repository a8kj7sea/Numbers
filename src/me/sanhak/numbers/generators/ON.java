package me.sanhak.numbers.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import me.sanhak.numbers.methods.Methods;

public class ON { //Start

	public static String Orange() {
		String Zain = "077";
		char[] chars = "01234567890".toCharArray();	      
		for(int i = 0; i < Methods.length; ++i) {Zain = Zain + chars[Methods.random.nextInt(chars.length)];}
		return Zain+"\n";
	}
	
	public static void CreateFile_ON() throws IOException {	
		FileWriter fw = new FileWriter(Methods.File_Name("[ON]")+".txt");		
		Scanner s = new Scanner(System.in);
		int loop;
		System.out.println("You have been chosed Orange , How many numbers do you want?");
		loop = s.nextInt();
		for (int x = 0 ; x < loop ;x++) {
			fw.write(Orange());
		}
		fw.close();
		
	}
	
} //End
