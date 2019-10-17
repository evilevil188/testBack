package backend.com;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
public class AnnouncementControl {
	
	
	
	@RequestMapping("/userlogin")  
    //read the provided form data  
    public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m)  
    {  
		System.out.println("get name = " + name + " , pass = " + pass);
		if("admin".equals(name) && "admin123".equals(pass)) {
			System.out.println("right");
			  return "menu";
		}else {
			System.out.println("error");
			  return "home";
		}
    }  

	
	//locale change
//	@Controller
//	public class SpringInternationalizationController {

		@RequestMapping("/localechange")
		public String staticLocale(Model model) {
			return "test2";
		}

//	}
	
	
//	@RequestMapping("/login")
//	  public String processLogin(
//			  @RequestParam("name") String name,
//			  @RequestParam("word") String pass){
//		System.out.println("get name = " + name + " , get pass = " +pass);
//		if("admin".equals(name) && "admin123".equals(pass)) {
//			System.out.println("right");
//			  return "hello";
//		}else {
//			System.out.println("error");
//			  return "login";
//		}
//		
//	  }
}