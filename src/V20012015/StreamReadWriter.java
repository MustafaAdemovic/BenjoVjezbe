package V20012015;

import java.io.*;

import javax.swing.JFileChooser;

public class StreamReadWriter {
	/**
	 * Metoda ciscenje buffera
	 * 
	 * @param buffer
	 */
	private static void clearBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < numRead; i++)
			buffer[i] = 0;

	}

	public static void main(String[] args) {

		JFileChooser filePicker = new JFileChooser();
		
		filePicker.setCurrentDirectory(new File(System.getProperty("user.home") + "/Documents/workspace"));//otvori nam koji zelimo
		
		/* if(open != filePicker.APPROVE_OPTION){
			 System.exit(-1);
		 }*/
		int open = -1;
		/*
		 * Da ne mozemo izaci sve dok ne izaberemo nesto
		 */
		while(open != filePicker.APPROVE_OPTION){
			 open =	filePicker.showOpenDialog(filePicker);//Da nam pokaze prozor
		}
		 String pickedFile = filePicker.getSelectedFile().getAbsolutePath();//pokupimo selektovani fajl
		
		FileInputStream fs = null;
		Reader is;
		int save = filePicker.showSaveDialog(filePicker);
		String savedFile = filePicker.getSelectedFile().getAbsolutePath();

		byte[] inputBuffer = new byte[10];

		OutputStream os;
		FileOutputStream ofs;
		StringBuilder outputBuilder = new StringBuilder();

		try {
			fs = new FileInputStream(pickedFile);
			is = new InputStreamReader(fs);
			BufferedReader bs = new BufferedReader(is);
			ofs = new FileOutputStream(savedFile, true);
			os = new DataOutputStream(ofs);
			

			int numRead = 0;

			String lineString = "";
			
			while((lineString = bs.readLine()) != null){
				outputBuilder.append(lineString).append("\n,");
				
			}
			os.write(outputBuilder.toString().getBytes());
			
			System.out.println("Citanje zavrseno:");

			/*
			 * Streamovi rade na svemu konzola, failovi, itd. a system.out samo
			 * za konzolu
			 */
			//String outputString = outputBuilder.toString();
			//os.write(outputString.getBytes());

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Gotovo!!");
		}

	}
}
