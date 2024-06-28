package com.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelprogramReading {
    public static String dir=System.getProperty("user.dir");
    @Test
    public void read_Excel() throws IOException {
     FileInputStream fis=new FileInputStream(dir+"\\Excelfiles//Persondetails.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet st=wb.getSheetAt(0);
        for(Row r:st){
            for (Cell c: r){
               switch (c.getCellType()){
                   case STRING:
                       System.out.println(c.getStringCellValue() + "\t");
                       break;
                   case NUMERIC:
                       System.out.println(c.getNumericCellValue() + "\t");
                       break;
                   case BOOLEAN:
                       System.out.println(c.getBooleanCellValue() + "\t");
                       break;
                   case BLANK:
                       System.out.println("blank" +"\t");
                       break;
                   default:
                       System.out.println("default"+"\t");
               }
            }
        }

//        Row row= st.getRow(0);
//        Cell cell= row.getCell(0);
//        System.out.println(cell);
//        System.out.println(st.getRow(0).getCell(0));
//        String cellvalue= cell.getStringCellValue();
//        System.out.println(cellvalue);
    }
}
