package V19012015;

import java.io.File;

import ba.bitcamp.MustafaAdemovic.vjezbe.CSVBase.TextIO;

public class Vedad {

	public static void main(String[] args) {
		System.out.println("Enter some path: ");
		
		String path =TextIO.getlnString();
		File f = new File(path);
		
		if(f.exists()){
			System.out.println("Path exist!");
		} else{
			
		}
	}
	
}
