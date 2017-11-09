package cn.cqie.ctr;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCtr {
	@RequestMapping(value="get/{userName}")
	public String getString(@PathVariable String userName){
		
		return userName;
	}
}
