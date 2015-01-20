package V19012015;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class Stream {
	public static void main(String[] args) {
		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		BufferedInputStream bis = new BufferedInputStream(dis);
		CharBuffer javaCharBuffer = new CharBuffer(read);
		byte[] buffer = new byte[4];
		int numBytesRead = 0;

		try {/*
			while ((numBytesRead = dis.read(buffer)) >= 0) {
				System.out.println("Procitali: " + numBytesRead + " bytea\n" + new String(buffer));

				*/
			while(read.read(target))

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
