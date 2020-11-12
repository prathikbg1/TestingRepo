package Resourcedata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
		fi=new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowCount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowCount;
	}
	
	public static int getCellCount(String xlfile,String xlsheet,int rowNo) throws IOException {
		fi=new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row=ws.getRow(rowNo);
		int cellCount = row.getLastCellNum();
		
		wb.close();
		fi.close();
		return cellCount;
	}
	
	public static String getCellData(String xlfile,String xlsheet,int rowNo,int colNo) throws IOException {
		fi=new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row=ws.getRow(rowNo);
	    cell=row.getCell(colNo);
		String data;
		try {
			DataFormatter formater=new DataFormatter();
			String cellData = formater.formatCellValue(cell);
			return cellData;
		}
		catch(Exception e) {
			data="";
		}
		wb.close();
		fi.close();
		return data;
}
}
