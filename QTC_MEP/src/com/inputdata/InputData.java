package com.inputdata;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class InputData {
	public static HashMap map1;
	public static String tcName = null;

	// public static String retrieve= null;

	public static String retrievexlval(String value)

	{
		

		value = map1.get(value).toString();
		/*System.out.println(value);*/
		return value;
	}

	/*public static String fileChooser() {
		try {
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		String path = "";
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setCurrentDirectory(new File("."));

		int result = jFileChooser.showOpenDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jFileChooser.getSelectedFile();
			// System.out.println("Selected file: " +
			// selectedFile.getAbsolutePath());
			path = selectedFile.getAbsolutePath();
		}
		return path;

	}
*/
	public static void testRow(int stdRow, int limit) {
		// System.out.println("in testrow");

		// tcName = "TC0"+row;
		map1 = new HashMap();
		
		File inputwork = new File("./Inputdata/Datadriven.xls");
		Workbook w = null;
		try {
			w = Workbook.getWorkbook(inputwork);

		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		}

		Sheet sheet = w.getSheet(0);

		try {
			int k = limit;
			// int stdRow=row-limit-1;
			stdRow = stdRow - 1;
			int row = stdRow + limit + 1;

			int iteration = limit;
			// System.out.println("limit"+(limit)+ "start row"+(row));
			for (int i = 0; i < iteration; i++) {
				// System.out.println("iteration "+i);
				for (int j = 0; j < sheet.getColumns(); j++) {

					Cell cell1 = sheet.getCell(j, stdRow);

					Cell cell2 = sheet.getCell(j, (row - 1));

					map1.put((cell1.getContents() + k), cell2.getContents());
					// System.out.println((cell1.getContents()+k)+cell2.getContents())
					// ;
					// System.out.println(cell1.getContents()+k+"---->"
					// +map1.get(cell1.getContents()+k).toString()) ;
				}
				row = row - 1;
				k = k - 1;
			}
		}

		catch (Exception e) {
			System.out.println("something error with input values" + e);
		}

	}

}
