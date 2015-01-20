package ba.bitcamp.MustafaAdemovic.vjezbe.CSVBase;

public class CSVReadWrite {
	private static String basePath = "./DataBase/";

	public static boolean saveFile(String fileName, StringBuilder entry) {
		try {
			TextIO.writeFile(basePath + fileName + ".csv");
			TextIO.putln(entry);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
