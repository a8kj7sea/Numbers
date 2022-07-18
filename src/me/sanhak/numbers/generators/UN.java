package me.sanhak.numbers.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import me.sanhak.numbers.methods.Methods;

public class UN { //Start

	public static String Umniah() {
		String U = "078";
		char[] chars = "01234567890".toCharArray();	      
		for(int i = 0; i < Methods.length; ++i) {U = U + chars[Methods.random.nextInt(chars.length)];}
		return U+"\n";
	}
	
	public static void CreateFile_UN() throws IOException {	
		FileWriter fw = new FileWriter(Methods.File_Name("[UN]")+".txt");		
		Scanner s = new Scanner(System.in);
		int loop;
		System.out.println("You have been chosed Umniah , How many numbers do you want?");
		loop = s.nextInt();
		for (int x = 0 ; x < loop ;x++) {
			fw.write(Umniah());
		}
		fw.close();
		
	}
	
} //End
