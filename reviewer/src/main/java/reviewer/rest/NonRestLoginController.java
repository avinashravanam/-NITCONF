package reviewer.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class NonRestLoginController {
	
	  @GetMapping("/login")
	  public String login()
	  {
		  System.out.println("hello login");
		 return "login";
	  }
	  
	  @GetMapping("/dashboard")
	  public String dashboard()
	  {
		  System.out.println("hello dashboard");
		  return "dashboard";
	  }
}
