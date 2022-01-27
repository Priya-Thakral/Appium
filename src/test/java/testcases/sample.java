package testcases;

import java.util.Hashtable;
import java.util.List;

import utilities.DataReader;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, List<String>> data=DataReader.getMultipleRowFromXls("FlipBoardSuite.xlsx","TestCases");
		System.out.println("data");
		
		Object[][] result;

		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\FlipBoardSuite.xlsx";
		List<List<Object>> fullxlsData=DataReader.readXlsFile(path,"TestCases","testcase1","Y");
		        result=new Object[fullxlsData.size()][];
		        System.out.println("result.length-->"+result.length);
		       
		        for(int i=0;i<result.length;i++)
		        {
		       
		        result[i]=new Object[] {fullxlsData.get(i)};
		        System.out.println("result[i]-->"+result[i]);
		        
		        }

		//return result;

		}


	}
	