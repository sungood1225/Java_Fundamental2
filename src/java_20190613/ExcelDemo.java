package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) {
		HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
		HSSFSheet sheet = workbook.createSheet("��Ʈ��"); // �� ��Ʈ(Sheet) ����
		HSSFRow row = sheet.createRow(0); // ������ ���� 0������ ����
		HSSFCell cell = row.createCell(0); // ���� ���� 0������ ����
		cell.setCellValue("�׽�Ʈ ������"); // ������ ���� ������ ����
		
		cell = row.createCell(1); // ���� ���� 0������ ����
		cell.setCellValue("�׽�Ʈ ������1"); // ������ ���� ������ ����
		
		cell = row.createCell(2); // ���� ���� 0������ ����
		cell.setCellValue("�׽�Ʈ ������2"); // ������ ���� ������ ����
		
		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("�׽�Ʈ ������");
		
		cell = row.createCell(1); // ���� ���� 0������ ����
		cell.setCellValue("�׽�Ʈ ������1"); // ������ ���� ������ ����
		
		cell = row.createCell(2); // ���� ���� 0������ ����
		cell.setCellValue("�׽�Ʈ ������2"); // ������ ���� ������ ����
		
		
		try {
			FileOutputStream fileoutputstream = new FileOutputStream("c:\\down\\test.xlsx");
			workbook.write(fileoutputstream);
			fileoutputstream.close();
			System.out.println("�������ϻ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�������ϻ�������");
		}

	}
}
