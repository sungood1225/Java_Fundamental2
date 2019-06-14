package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawling_Upgrade {
	
	private String getKoreanDate(String date){//date => "Jun 13, 2019"
		String koreanDate = null;
		SimpleDateFormat from = new SimpleDateFormat(
				"MMM dd, yyyy", Locale.US);
		SimpleDateFormat to = new SimpleDateFormat(
				"yyyy�� MM�� dd��",Locale.KOREAN);
		
		try {
			java.util.Date d = from.parse(date);
			koreanDate = to.format(d);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return koreanDate;
		
	}
	
	
	public void execute(String sheetName, String coinName, String startDate, String endDate){
		HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
		HSSFSheet sheet = workbook.createSheet(sheetName); // �� ��Ʈ(Sheet) ����
		HSSFRow row = null;
		HSSFCell cell = null;
		String url = "https://coinmarketcap.com/currencies/"+
		coinName+"/historical-data/?start="+startDate+"&end="+endDate;
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//headElements�� Ÿ��Ʋ ���� �������� ���� Elements
		Elements headElements = doc.select(
				//Ŭ������ �տ� ��. �±� ���� ��������.
				".table-responsive .table thead tr");
		//bodyElements�� �ǵ����� ������ �������� ���� Elements
		Elements bodyElements = doc.select(
				".table-responsive .table tbody tr");
		int rowIndex = 0;
	
		for(int i = 0; i < headElements.size();i++){
			row = sheet.createRow(rowIndex++); // ������ ���� 0������ ����
			Element e = (Element) headElements.get(i); //<tr> �ϳ��ۿ� ����
			String date = e.child(0).text();//e.child(0) => <th>
			cell = row.createCell(0); // ���� ���� 0������ ����
			cell.setCellValue(getKoreanDate(date));// ������ ���� ������ ����
			
			String open = e.child(1).text();
			cell = row.createCell(1); // ���� ���� 0������ ����
			cell.setCellValue(open); // ������ ���� ������ ����
			
			String high = e.child(2).text();
			cell = row.createCell(2); // ���� ���� 0������ ����
			cell.setCellValue(high); // ������ ���� ������ ����
			
			String low = e.child(3).text();
			cell = row.createCell(3); // ���� ���� 0������ ����
			cell.setCellValue(low); // ������ ���� ������ ����
			
			
			String close = e.child(4).text();
			cell = row.createCell(4); // ���� ���� 0������ ����
			cell.setCellValue(close); // ������ ���� ������ ����
			
			String volume = e.child(5).text();
			cell = row.createCell(5); // ���� ���� 0������ ����
			cell.setCellValue(volume); // ������ ���� ������ ����
						
			String marketCap = e.child(6).text();
			cell = row.createCell(6); // ���� ���� 0������ ����
			cell.setCellValue(marketCap); // ������ ���� ������ ����
			
			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t\t%s%n", 
					date, open, high, low, close, volume, marketCap);
			}
		
		

		
		
		for(int i = 0; i < bodyElements.size();i++){
			row = sheet.createRow(rowIndex++); // ������ ���� 0������ ����
			Element e = (Element) bodyElements.get(i); //<tr> �ϳ��ۿ� ����
			String date = e.child(0).text();//e.child(0) => <th>
			cell = row.createCell(0); // ���� ���� 0������ ����
			cell.setCellValue(date);// ������ ���� ������ ����
			
			String open = e.child(1).text();
			cell = row.createCell(1); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(open)); // ������ ���� ������ ����
			
			String high = e.child(2).text();
			cell = row.createCell(2); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(high)); // ������ ���� ������ ����
			
			String low = e.child(3).text();
			cell = row.createCell(3); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(low)); // ������ ���� ������ ����
			
			
			String close = e.child(4).text();
			cell = row.createCell(4); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(close)); // ������ ���� ������ ����
			
			String volume = e.child(5).text();//"18,669,407,147" ���ڿ��� �Ǿ� ����. �޸���������.
			volume = volume.replaceAll(",", "");
			cell = row.createCell(5); // ���� ���� 0������ ����
			cell.setCellValue(Long.parseLong(volume)); // ������ ���� ������ ����
					
			String marketCap = e.child(6).text();
			marketCap = marketCap.replaceAll(",", "");
			cell = row.createCell(6); // ���� ���� 0������ ����
			cell.setCellValue(Long.parseLong(marketCap)); // ������ ���� ������ ����
			
			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t\t%s%n", 
					date, open, high, low, close, volume, marketCap);
			}
		
		
		try {
			FileOutputStream fileoutputstream = new FileOutputStream("c:\\down\\"+coinName+".xlsx");
			workbook.write(fileoutputstream);
			fileoutputstream.close();
			System.out.println("�������ϻ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�������ϻ�������");
		}
	}
	
	public static void main(String[] args) {
		
		CoinCrawling_Upgrade c = new CoinCrawling_Upgrade();
		c.execute("��Ʈ����","bitcoin","20180614","20190614");//=> bitcoin
		c.execute("�̴�����","ethereum","20180614","20190614");//=> ethereum
		c.execute("����","ripple","20180614","20190614");//=> ripple

	}
}
