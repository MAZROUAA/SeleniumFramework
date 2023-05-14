package data;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadee {
    static FileInputStream fis=null;
    public FileInputStream getFileInputStream() throws FileNotFoundException {
        String filePath="C:\\Users\\Mohamed Mazrouaa\\IdeaProjects\\SeleniumTAF\\src\\test\\java\\data\\userData.xlsx";
        File srcFile =new File(filePath);
        fis=new FileInputStream(srcFile);
        return fis;
    }
    public Object[][] getExcelData() throws IOException {
        fis=getFileInputStream();
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheetAt(0);
        int totalNoOfRows =(sheet.getLastRowNum()+1);
        int totalNoOfCols=4;
        String[][] arrayExcelData=new String[totalNoOfRows][totalNoOfCols];
        for(int i=0;i<totalNoOfRows;i++){
            for(int j=0;j<totalNoOfCols;j++){
                XSSFRow row =sheet.getRow(i);
                arrayExcelData[i][j]=row.getCell(j).toString();
            }}
        wb.close();
        return  arrayExcelData;
    }
}
