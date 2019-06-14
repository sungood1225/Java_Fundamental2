package java_20190613;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIExamCaptchaNkeyResult {

    public static void main(String[] args) {
        String clientId = "JEZRWAdJwf2hjioVrPAr";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
        String clientSecret = "_EkkDwFuzA";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
        try {
            String code = "1"; // Ű �߱޽� 0,  ĸ�� �̹��� �񱳽� 1�� ����
            String key = "5ZYyt8KLweacNDL1"; // ĸ�� Ű �߱޽� ���� Ű��
            String value = "81RE4C"; // ����ڰ� �Է��� ĸ�� �̹��� ���ڰ�
            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ key + "&value="+ value;

            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // ���� �߻�
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
