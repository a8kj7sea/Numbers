package me.sanhak.numbers.generators;

import java.util.*;
import java.io.*;

import me.sanhak.numbers.methods.Methods;

public class ZN { //Start
		
	public static String Zain() {
		String Zain = "079";
		char[] chars = "01234567890".toCharArray();	      
		for(int i = 0; i < Methods.length; ++i) {Zain = Zain + chars[Methods.random.nextInt(chars.length)];}
		return Zain+"\n";
	}
	
	public static void CreateFile_ZN() throws IOException {	
		FileWriter fw = new FileWriter(Methods.File_Name("[ZN]")+".txt");		
		Scanner s = new Scanner(System.in);
		int loop;
		System.out.println("You have been chosed Zain , How many numbers do you want?");
		loop = s.nextInt();
		for (int x = 0 ; x < loop ;x++) {
			fw.write(Zain());
		}
		fw.close();
		
	}
	
} //End
