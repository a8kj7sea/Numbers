package me.sanhak.numbers.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import me.sanhak.numbers.methods.Methods;

public class MN { //Start

	public static void CreateFile_MIX() throws IOException {	
		FileWriter fw = new FileWriter(Methods.File_Name("[MIX]")+".txt");		
		Scanner s = new Scanner(System.in);
		int loop;
		System.out.println("You have been chosed Mix of numbers , How many numbers do you want?");
		loop = s.nextInt();
		for (int x = 0 ; x < loop ;x++) {
			fw.write(ZN.Zain());
			fw.write(ZN.Zain());
			fw.write(UN.Umniah());
		}
		fw.close();
		
	}
	
} //End
