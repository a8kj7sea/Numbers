package me.sanhak.numbers.main;

import java.io.*;
import java.util.*;

import me.sanhak.numbers.generators.*;
import me.sanhak.numbers.methods.Methods;

public class Main { //Start

	public static void main(String[] args) throws IOException {
		int type;
		Methods.Art();
		Scanner s = new Scanner(System.in);
		type = s.nextInt();

		if (type == 1) { //
			ZN.CreateFile_ZN();
		} else if (type == 2) { //
			ON.CreateFile_ON();
		} else if (type == 3) { //
			UN.CreateFile_UN();
		} else if (type == 4) { //
			MN.CreateFile_MIX();
		} else if (type == 5) { //
			System.exit(0);
		}
		
	}
	
} //End
