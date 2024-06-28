package com.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Excelsize {
    public static String path=System.getProperty("user.dir");
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream(path+"//Excelfiles\\Persondetails.xlsx");
            Workbook wb=new XSSFWorkbook(fis);
            Sheet st=wb.getSheetAt(0);
            int rowcount=st.getPhysicalNumberOfRows();
            int maxColumnCount=0;
            for (Row r:st){
                int currentcolumncount=r.getPhysicalNumberOfCells();
                maxColumnCount=Math.max(maxColumnCount,currentcolumncount);
            }
            System.out.println("Number of rows: " +rowcount);
            System.out.println("Number of columns: " +maxColumnCount);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
