package webAppController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class WebAppController {

	@RequestMapping("jspExample")
	public String sayExampleJSP() {
		return "SayHello";
	}
	
}
