package java_20190613;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class NaverCaptcha {
	public String getKey() {
		// return으로 리턴해주려면 try 로컬변수가 아닌 메소드 변수로 있어야 한다! 옮긴 이유.
		StringBuffer response = new StringBuffer();
		String clientId = "JEZRWAdJwf2hjioVrPAr";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "_EkkDwFuzA";// 애플리케이션 클라이언트 시크릿값";
		try {
			String code = "0"; // 키 발급시 0, 캡차 이미지 비교시 1로 세팅
			// url요청
			String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return response.toString();
	}

	// 이미지를 반환하면 true, 아니면 false. boolean은 메소드명을 보통 Is~로 만든다.
	public boolean isCreateImage(String key) {
		boolean isSuccess = false;
		String clientId = "JEZRWAdJwf2hjioVrPAr";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "_EkkDwFuzA";// 애플리케이션 클라이언트 시크릿값";
		try {
			// String key = "5ZYyt8KLweacNDL1"; //
			// https://openapi.naver.com/v1/captcha/nkey
			// 호출로 받은 키값
			String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				// 이미지 데이터가 InputStream으로 들어옴. 바이너리 파일.
				InputStream is = con.getInputStream();
				int read = 0;
				// 참고로 바이트는 8190 byte가 네트워크에서 제일 빠르다. 여긴 이미지라서 용량이 작으니 1024도 상관
				// 없음.
				byte[] bytes = new byte[1024];
				// 랜덤한 이름으로 파일 생성(시간을 이용하여 유일값)
				// 원래는 Long.valueOf(new Date().getTime()).toString(); 비효율적...
				// String.valueof로 바꾸자.
				String tempname = String.valueOf(new Date().getTime());
				// 사용자마다 어느 경로에 위치할지를 모르니, 아예 경로를 안쓰면 클래스파일이 있는 위치에 파일이 생성된다.
				// le f = new File("tempname" + ".jpg");
				// 우리는 다운 폴더로 바꾸자!
				File f = new File("c:\\down\\" + tempname + ".jpg");
				// f.createNewFile();
				FileOutputStream outputStream = new FileOutputStream(f);
				while ((read = is.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}
				is.close();
				outputStream.close();
				isSuccess = true;
			} else { // 에러 발생
				// inputstram -> reader -> 속도가 더 빠른 bufferedread로 ~!
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				br.close();
				// System.out.println(response.toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return isSuccess;
	}

	public String getResult(String key, String value) {
		String clientId = "JEZRWAdJwf2hjioVrPAr";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "_EkkDwFuzA";// 애플리케이션 클라이언트 시크릿값";
		StringBuffer response = new StringBuffer();
		try {
			String code = "1"; // 키 발급시 0, 캡차 이미지 비교시 1로 세팅
			//String key = "5ZYyt8KLweacNDL1"; // 캡차 키 발급시 받은 키값
			//String value = "81RE4C"; // 사용자가 입력한 캡차 이미지 글자값
			String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code + "&key=" + key + "&value="
					+ value;

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;

			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		} return response.toString();
	}
	
	public static void main(String[] args) {
		NaverCaptcha n = new NaverCaptcha();
		//String key = n.getKey();
		String key = "JsWcXOFS9c4kqWhT";
		//System.out.println(key);
		/*if(n.isCreateImage(key)){
			System.out.println("이미지 생성 성공");

		}else{
			System.out.println("이미지 생성 실패");
		}*/

		String value = "NRHAE6";
		String result = n.getResult(key, value);
		System.out.println(result);

	}

}
