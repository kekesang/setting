package com.yasi.controller;

import com.yasi.pojo.SSysman;
import com.yasi.service.IsysloginService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
public class loginController {
	@Autowired
	private IsysloginService syslogin;
	@RequestMapping("/Sys")
	public String Index(Model model) {
		return "syslogin";
		
	}
	@SuppressWarnings("unused")
	@RequestMapping("/Syslogin")
	@ResponseBody
	public String Login(String account,String password){
		
	    SSysman sysman = new SSysman() ;
	    sysman.setSysNo(account);
	    sysman.setSysPassword(password);
	    JSONArray json=new JSONArray();
	   int flag=0;
		List< SSysman> list = new ArrayList< SSysman>();
	    if(null!=sysman){
	    	
			try {
				list = syslogin.selectlogin(sysman);
				if(!list.isEmpty()){
		    		flag=1;
		    		json.add(flag);
		    	
		    	}
		    	
			} catch (Exception e) {
				json.add(flag);
			}
	    	
	    }
	    else{
	    	flag=2;
	    	json.add(flag);
	    }
	    	return json.toString();
	}
	@RequestMapping("/userlogin")
	@ResponseBody
	public String userLogin(String account,String password){
		
		return null;
		
	   
	}
}
