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
		 return "login";
	  }
	  
	  @GetMapping("/dashboard")
	  public String dashboard()
	  {
		  return "dashboard";
	  }
	  
	  
	  @GetMapping("/profile")
	  public String getProfile()
	  {
		  return "profile";
	  }
	  
}
