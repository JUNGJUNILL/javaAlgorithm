package poi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P001_Poi {
	
	static  Object getValueFromCell(Cell cell) {
	       switch (cell.getCellType()) {
	        case STRING:
	            return cell.getStringCellValue();
	        case BOOLEAN:
	            return cell.getBooleanCellValue();
	        case NUMERIC:
	            if (DateUtil.isCellDateFormatted(cell)) {
	                return cell.getDateCellValue();
	            }
	            return (int)cell.getNumericCellValue();
	        case FORMULA:
	            return cell.getCellFormula();
	        case BLANK:
	            return "";
	        default:
	            return "";
	        }


	}


	public static void main(String[] args) throws Exception{

		
		Workbook workBook=null; 
		FileInputStream excelFilexlsx = new FileInputStream("C:\\단가표.xlsx");
		FileInputStream excelFilexls = new FileInputStream("C:\\단가표.xls");
		String fileExt="xlsx"; 
		if(fileExt.equals("xls")){
			 workBook=new HSSFWorkbook(excelFilexls); 
		}else{
			 workBook=new XSSFWorkbook(excelFilexlsx); 
		}
	
		
		Sheet sheet =  workBook.getSheetAt(0); 
		int totalRow = sheet.getPhysicalNumberOfRows();
		System.out.println("totalRow="+totalRow);
		for(int i=0; i<totalRow; i++){
			Row row = sheet.getRow(i); 
			 if(row != null){
				 for(int j=0; j<row.getPhysicalNumberOfCells(); j++){
					 
					 Cell cell=row.getCell(j);
					 System.out.print(getValueFromCell(cell).toString()+ " ");
				 }
				 System.out.println();
				 
			 }
		}
		
		workBook.close();
		excelFilexlsx.close();
		excelFilexls.close();
		
	}

}
