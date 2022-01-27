package utilities;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
   @DataProvider(name="testcase1")
	public Object[][] testcase1()
	{

	Object[][] result;

	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\FlipBoardSuite.xlsx";
	List<List<Object>> fullxlsData=DataReader.readXlsFile(path,"TestCases","testcase1","Y");
	        result=new Object[fullxlsData.size()][];
	       
	        for(int i=0;i<result.length;i++)
	        {
	       
	        result[i]=new Object[] {fullxlsData.get(i)};
	        }

	return result;

	}
	
	
	
	
	@DataProvider(name="testcase2")
	public Object[][] testcase2()
	{

	Object[][] result;

	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\FlipBoardSuite.xlsx";
	List<List<Object>> fullxlsData=DataReader.readXlsFile(path,"TestCases","testcase2","Y");
	        result=new Object[fullxlsData.size()][];
	       
	        for(int i=0;i<result.length;i++)
	        {
	       
	        result[i]=new Object[] {fullxlsData.get(i)};
	        }

	return result;

	}
	
	
	@DataProvider(name="testcase3")
	public Object[][] testcase3()
	{

	Object[][] result;

	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\FlipBoardSuite.xlsx";
	List<List<Object>> fullxlsData=DataReader.readXlsFile(path,"TestCases","testcase3","Y");
	        result=new Object[fullxlsData.size()][];
	       
	        for(int i=0;i<result.length;i++)
	        {
	       
	        result[i]=new Object[] {fullxlsData.get(i)};
	        }

	return result;

	}
	
	/*@DataProvider(name="flipBoard")
	public static Object[][] getDataSuite1(Method m) {

		System.out.println(m.getName());
		
	   ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		String testcase = m.getName();
		return DataUtil.getData(testcase, excel);
	
	}*/

}
