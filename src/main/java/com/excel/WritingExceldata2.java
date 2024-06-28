package com.excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingExceldata2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\school.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet st=wb.createSheet();
        Scanner sc=new Scanner(System.in);
        for(int r=0;r<=5;r++){
            XSSFRow currentrow=st.createRow(r);
            for (int c=0;c<3;c++){
//                currentrow.createCell(c).setCellValue("welcome");
                System.out.println("Enter the value");
                String value=sc.next();
                currentrow.createCell(c).setCellValue(value);
            }
        }
        wb.write(fis);
        wb.close();
        fis.close();

        System.out.println("writing code is done");
    }
}
