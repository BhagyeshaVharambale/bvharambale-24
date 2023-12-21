package GoogleExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Utility {
	
		
		public static WebDriver getDriver() {
			WebDriver driver = new EdgeDriver();			
			return driver ;
		}
		
		public static String readProperty(String key) {	        
	    	FileInputStream fstream = null ; 
		   	File f = new File("src/test/resources/data.properties");
		   	try {
		   	   fstream = new FileInputStream(f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}	
		   	Properties p = new Properties();
		    try {
				p.load(fstream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		        return p.getProperty(key);
	     }
		
		 public static ArrayList<String> readWriteExcelData() {
			    HSSFWorkbook workbook  = null;
		        FileInputStream fstream = null ;
			    
			    ArrayList<String> list = new ArrayList<String>();
	        	File f = new File("src/test/resources/testdata.xls");
	    	    try {
	    			fstream = new FileInputStream(f);
	    		} catch (FileNotFoundException e) {
	    			e.printStackTrace();
	    		}
	            try {
	    			workbook = new HSSFWorkbook(fstream);
	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	            HSSFSheet sheet = workbook.getSheetAt(0);
	            int lastrow =  sheet.getLastRowNum();
	            for(int i=1;i<=lastrow;i++) {
	            	HSSFRow row = sheet.getRow(i);
	            	int lastcell = row.getLastCellNum();
	            	for(int j=0;j<lastcell;j++) {
	            		list.add(row.getCell(j).getStringCellValue());
	            	}            	
	            }
	        	return list ;
		    }    
		        
		
		  public static void getScreenshot(WebDriver driver , String name) {
		    	TakesScreenshot ts = (TakesScreenshot) driver ;
		    	File f = ts.getScreenshotAs(OutputType.FILE);
		    	try {
					FileUtils.copyFile(f, new File("src/test/resource/screenshots/" +  name + ".png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
		    	
		  }
		
	}

	


