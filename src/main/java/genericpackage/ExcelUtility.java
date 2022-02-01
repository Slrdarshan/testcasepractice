package genericpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/**
	 * this method return cell data
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Excelsh.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	     String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return data;
	}
	
	/**
	 * use to get the last used row number on specified sheet
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 */
	public int getRowCount(String sheetname) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/Excelsh.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		wb.close();
		return sh.getLastRowNum();
	}

	/**
	 * this method help to set the data in excel
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setDataExcel(String sheetName, int row, int cell, String data ) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Excelsh.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/Excelsh.xlsx");
		wb.write(fos);
		wb.close();
	}
}














