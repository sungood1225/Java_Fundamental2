package java_20190613;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.crypto.Data;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BitcoinData {
		
	public static void main(String[] args) {
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO: handle exception
		}

		Elements elements = doc.select(".table-responsive");
		Elements title = elements.select("th");
		for (int i = 0; i < title.size(); i++) {
			Element temp = title.get(i);
			System.out.println(temp.text());
		}
		Elements tdEle = elements.select("td");
		for (int i = 0; i < tdEle.size(); i++) {
			Element temp1 = tdEle.get(i);
			System.out.println(temp1.text());
		}
		




	}
}
