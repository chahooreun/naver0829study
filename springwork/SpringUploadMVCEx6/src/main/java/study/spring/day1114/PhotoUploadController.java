package study.spring.day1114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhotoUploadController {
	
	@PostMapping("/member/upload1")
	public String upload()
	{
		return "member/result";
	}
	
	
}
