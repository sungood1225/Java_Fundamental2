package java_20190613;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class APIExamCaptchaImage {

    public static void main(String[] args) {
        String clientId = "JEZRWAdJwf2hjioVrPAr";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "_EkkDwFuzA";//애플리케이션 클라이언트 시크릿값";
        try {
            String key = "5ZYyt8KLweacNDL1"; // https://openapi.naver.com/v1/captcha/nkey 호출로 받은 키값
            String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
            	//이미지 데이터가 InputStream으로 들어옴. 바이너리 파일. 
                InputStream is = con.getInputStream();
                int read = 0;
                //참고로 바이트는 8190 byte가 네트워크에서 제일 빠르다. 여긴 이미지라서 용량이 작으니 1024도 상관 없음.
                byte[] bytes = new byte[1024];
                // 랜덤한 이름으로 파일 생성(시간을 이용하여 유일값)
                //원래는 Long.valueOf(new Date().getTime()).toString(); 비효율적... String.valueof로 바꾸자.
                String tempname = String.valueOf(new Date().getTime());
                //사용자마다 어느 경로에 위치할지를 모르니, 아예 경로를 안쓰면 클래스파일이 있는 위치에 파일이 생성된다. 
                //le f = new File("tempname" + ".jpg");
                //우리는 다운 폴더로 바꾸자!
                File f = new File("c:\\down\\"+tempname + ".jpg");
                //f.createNewFile();
                FileOutputStream outputStream = new FileOutputStream(f);
                while ((read =is.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
                is.close();
                outputStream.close();
            } else {  // 에러 발생
            	//inputstram -> reader -> 속도가 더 빠른 bufferedread로 ~!
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