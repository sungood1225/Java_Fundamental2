package java_20190613;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class APIExamCaptchaImage {

    public static void main(String[] args) {
        String clientId = "JEZRWAdJwf2hjioVrPAr";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
        String clientSecret = "_EkkDwFuzA";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
        try {
            String key = "5ZYyt8KLweacNDL1"; // https://openapi.naver.com/v1/captcha/nkey ȣ��� ���� Ű��
            String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
            	//�̹��� �����Ͱ� InputStream���� ����. ���̳ʸ� ����. 
                InputStream is = con.getInputStream();
                int read = 0;
                //����� ����Ʈ�� 8190 byte�� ��Ʈ��ũ���� ���� ������. ���� �̹����� �뷮�� ������ 1024�� ��� ����.
                byte[] bytes = new byte[1024];
                // ������ �̸����� ���� ����(�ð��� �̿��Ͽ� ���ϰ�)
                //������ Long.valueOf(new Date().getTime()).toString(); ��ȿ����... String.valueof�� �ٲ���.
                String tempname = String.valueOf(new Date().getTime());
                //����ڸ��� ��� ��ο� ��ġ������ �𸣴�, �ƿ� ��θ� �Ⱦ��� Ŭ���������� �ִ� ��ġ�� ������ �����ȴ�. 
                //le f = new File("tempname" + ".jpg");
                //�츮�� �ٿ� ������ �ٲ���!
                File f = new File("c:\\down\\"+tempname + ".jpg");
                //f.createNewFile();
                FileOutputStream outputStream = new FileOutputStream(f);
                while ((read =is.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
                is.close();
                outputStream.close();
            } else {  // ���� �߻�
            	//inputstram -> reader -> �ӵ��� �� ���� bufferedread�� ~!
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
                System.out.println(response.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}