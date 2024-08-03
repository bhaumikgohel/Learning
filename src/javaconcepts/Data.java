package javaconcepts;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data {

	public static void main(String[] args) {
		
		 // Specify the file path
        String filePath = "D:\\Automation\\javaconcepts\\Writedata.xls";

        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet in the workbook
        Sheet sheet = workbook.createSheet("Sheet1");

        // Write data to the sheet
        
        writeToSheet(sheet, 0, 0, "Name");
        writeToSheet(sheet, 0, 1, "Age");
        writeToSheet(sheet, 1, 0, "John Doe");
        writeToSheet(sheet, 1, 1, "25");

        try {
            // Save the workbook to the specified file path
            FileOutputStream fileOut = new FileOutputStream(filePath);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Data written to Excel successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the workbook to release resources
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Helper method to write data to a specific cell in the sheet
    private static void writeToSheet(Sheet sheet, int rowIdx, int colIdx, String data) {
        Row row = sheet.getRow(rowIdx);
        if (row == null) {
            row = sheet.createRow(rowIdx);
        }
        Cell cell = row.createCell(colIdx);
        cell.setCellValue(data);
    }
}
