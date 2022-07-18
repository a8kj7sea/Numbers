package me.sanhak.numbers.methods;

import java.text.SimpleDateFormat;
import java.util.*;

public class Methods { //Start
	
	public static int length = 7;
	public static Random random = new Random();
	
	public static void Art() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(" _______   __    __  _______    ______      _____  __    __   ______    ______  \r\n"
				+ "|       \\ |  \\  |  \\|       \\  /      \\    |     \\|  \\  /  \\ /      \\  /      \\ \r\n"
				+ "| $$$$$$$\\| $$\\ | $$| $$$$$$$\\|  $$$$$$\\    \\$$$$$| $$ /  $$|  $$$$$$\\|  $$$$$$\\\r\n"
				+ "| $$__| $$| $$$\\| $$| $$__/ $$| $$___\\$$      | $$| $$/  $$  \\$$__| $$ \\$$__| $$\r\n"
				+ "| $$    $$| $$$$\\ $$| $$    $$ \\$$    \\  __   | $$| $$  $$   /      $$ /      $$\r\n"
				+ "| $$$$$$$\\| $$\\$$ $$| $$$$$$$\\ _\\$$$$$$\\|  \\  | $$| $$$$$\\  |  $$$$$$ |  $$$$$$ \r\n"
				+ "| $$  | $$| $$ \\$$$$| $$__/ $$|  \\__| $$| $$__| $$| $$ \\$$\\ | $$_____ | $$_____ \r\n"
				+ "| $$  | $$| $$  \\$$$| $$    $$ \\$$    $$ \\$$    $$| $$  \\$$\\| $$     \\| $$     \\\r\n"
				+ " \\$$   \\$$ \\$$   \\$$ \\$$$$$$$   \\$$$$$$   \\$$$$$$  \\$$   \\$$ \\$$$$$$$$ \\$$$$$$$$\r\n");
		System.out.println("[1] Zain Numbers");
		System.out.println("[2] Orange Numbers");
		System.out.println("[3] Umniah Numbers");
		System.out.println("[4] Mix Numbers");
		System.out.println("[5] Exit");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public static String File_Name(String nn) {
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 		
		String originalInput = f.format(d);
		return nn+Base64.getEncoder().encodeToString(originalInput.getBytes());
	}
	
} //End 
