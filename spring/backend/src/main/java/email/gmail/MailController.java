package email.gmail;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class MailController {
	
	@Autowired
	private IMailService mailservice;

	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findPwd(@RequestParam String email) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		
		StringBuilder sb = new StringBuilder();
		String subject = "[EMAIL] 메일 전송하기";
		
		sb = new StringBuilder();
		sb.append("<div align='center' style='border:1px solid black; font-family:verdana'>");
		sb.append("<h3 style='color:blue;'>메일 전송</h3>");
		sb.append("<div style='font-size:130%'>");
		sb.append("메일 테스트</div><br/>");

		System.out.println(email);
		mailservice.send(subject, sb.toString(), "onlinetest901@gmail.com", email, null);

		resultMap.put("status", true);
		resultMap.put("resultMsg", "메일 전송 완료");
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}

}
