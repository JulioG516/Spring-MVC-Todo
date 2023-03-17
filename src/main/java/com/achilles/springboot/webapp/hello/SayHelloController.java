package com.achilles.springboot.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // htpp://localhost:8080/say-hello
    @GetMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! what are you learning today ?";
    }


    @GetMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html lang=\"en\">");
        sb.append("<head>\n");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    //  "say-hello-jsp" -> sayHello.jsp
    //  src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @GetMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";  // view resolver
    }

}
