package com.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
       XSSFWorkbook workBook = new XSSFWorkbook();
        XSSFSheet sheet=workBook.createSheet();
      XSSFRow row1= sheet.createRow(0);
      row1.createCell(0).setCellValue("welcome");
        row1.createCell(1).setCellValue("Automation");
        row1.createCell(2).setCellValue("Testing");

        XSSFRow row2= sheet.createRow(1);
        row2.createCell(0).setCellValue("Selenium");
        row2.createCell(1).setCellValue("Framework");
        row2.createCell(2).setCellValue("Test");

        workBook.write(fos);
        workBook.close();
        fos.close();


        System.out.println("writing data in excel is completed");

    }
}
