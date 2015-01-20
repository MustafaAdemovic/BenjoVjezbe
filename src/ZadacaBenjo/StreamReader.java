package ZadacaBenjo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Reader;

public class StreamReader {
	public static void main(String[] args) throws IOException {
	
		Reader read = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(read);
		
		System.out.println("Enter some words, separated by new line.\n" +
		"When you finish, press Ctrl + D to end stream!");
		
		StringBuilder sb = new StringBuilder();
		
		String line = "";
		while((line = bReader.readLine()) != null){
			sb.append(line).append("");
		}
		System.out.println("End of stream\n");
		System.out.println(sb);
		File f = new File("/Users/mustafaademovic/Documents/Stream");
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sb);
		oos.close();
		System.out.println("Search the file in /Users/mustafaademovic/Documents/ name a /Stream/");
		
}
}
