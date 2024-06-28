package com.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Excelreading {
    public static String path=System.getProperty("user.dir");
    public static void main(String[] args)throws Exception {
        FileInputStream fis=new FileInputStream(path + "//Excelfiles\\Persondetails.xlsx");
       Workbook wb=new XSSFWorkbook(fis);
        Sheet st= wb.getSheetAt(0);
        for (Row r:st){
            for (Cell c:r){
                switch (c.getCellType()){
                    case STRING:
                        System.out.println(c.getStringCellValue() +"\t");
                        break;
                    case NUMERIC:
                        System.out.println(c.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.println(c.getBooleanCellValue() + "\t");
                        break;
                    case BLANK:
                        System.out.println("Blank\t");
                        break;
                    default:
                        System.out.println("DEFAULT\t");
                }
            }
        }
    }
}
