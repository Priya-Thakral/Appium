package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {
	
	public static Hashtable<String, List<String>> getMultipleRowFromXls(String filename,String sheetname)
	{
	     Hashtable<String, List<String>> table=new Hashtable<String, List<String>>();
         try {
					String path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata//"+filename;
					FileInputStream file=new FileInputStream(path);
					XSSFWorkbook wb=new XSSFWorkbook(file);
					XSSFSheet sheet=wb.getSheet(sheetname);
					Row firstrow=sheet.getRow(0);
					
					/*int lastRowNumber=sheet.getLastRowNum();
					int firstRowNumber=sheet.getFirstRowNum();
					
					System.out.println("lastRowNumber");
					
					System.out.println("firstRowNumber");
					*/
					
					
					int totalnumberofrows=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;	
					List<String> li;
					
					
					 for(int i=0;i<firstrow.getLastCellNum();i++)
				    {
						li=new ArrayList<String>();
						for(int j=1;j<totalnumberofrows;j++)
					   {
			
				         
							if(sheet.getRow(j).getCell(i).getCellType().toString().equalsIgnoreCase("Numeric"))
							{
								double tempdoublevalue=sheet.getRow(j).getCell(i).getNumericCellValue();
				              String tempstringvalue=Long.toString(Math.round(tempdoublevalue));
				              li.add(tempstringvalue);
				           }
				           else
				           {
				        	   li.add(sheet.getRow(j).getCell(i).getStringCellValue());
				           }
				       }
				   // if (li.contains("Y"))
				   // {
						table.put(firstrow.getCell(i).getStringCellValue(), li);
					//}
				}
				wb.close();
 } catch (Exception e) {
	                     e.printStackTrace();
	                   }
	return table;

}

	
	

	
	
	

	
	
	public static List<List<Object>> readXlsFile(String filepath,String sheetName,String testcaseId,String RunMode) {
		List<List<Object>> mainlist=new ArrayList<List<Object>>();
		try {
			
		
			
			FileInputStream file=new FileInputStream(filepath);
			
			Workbook book=WorkbookFactory.create(file);
			
			Sheet sheet=book.getSheet(sheetName);
				
			
			Iterator<Row> row=sheet.rowIterator();
			
			while(row.hasNext())
			{
				
				List<Object> listrow=new ArrayList<Object>();
				Row rowvalue=row.next();
				
				Iterator<Cell> cellitr=rowvalue.cellIterator();
				
				
				
				while(cellitr.hasNext())
				{
					
					
					
					Cell cellvalue=cellitr.next();
					
					
					
					switch (cellvalue.getCellType()) {
					case STRING:
						
						listrow.add(cellvalue.getStringCellValue());
						System.out.println(cellvalue.getStringCellValue());
						
						break;
						
						
                    case NUMERIC:
                    	
                    	listrow.add(cellvalue.getNumericCellValue());
                    	System.out.println(cellvalue.getNumericCellValue());
						
						break;
						
                    case FORMULA:
                    	
                    	listrow.add(cellvalue.getCellFormula());
                    	System.out.println(cellvalue.getCellFormula());
						
						break;
						
                    case BOOLEAN:
                    	
                    	listrow.add(cellvalue.getBooleanCellValue());
                    	System.out.println(cellvalue.getBooleanCellValue());
                    	break;
                    	
                    case BLANK:
                    	listrow.add("Blank");

                    	System.out.println("blank value");
                    	break;
                    

					default:
						System.out.println("Please check your sheet");
						break;
					}
					
				}
				
				
				if(listrow.contains(testcaseId) && listrow.contains("Y"))
				{
				mainlist.add(listrow);
				}
			}
			System.out.println("Final Data ==> "+mainlist);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return mainlist;
	}
}
	
	
	
	