package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/7/5.
 */
@Controller
public class LoadController {
   @RequestMapping("/load")
    public String load(Model m){
      m.addAttribute("msg","helloWrold");
       return  "/show";
   }


}


