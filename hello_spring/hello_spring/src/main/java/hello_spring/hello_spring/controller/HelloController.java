package hello_spring.hello_spring.controller;

import hello_spring.hello_spring.HelloSpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "inflearn");
        return "hello";
    }

    @GetMapping("hello_mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template"; //file의 이름을 정해 주는 것이다.
    }

    @GetMapping("hello_string")
    @ResponseBody()
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; //이렇게 body부에 직접 내용을 적어주겠다는 것이다.
    }

    @GetMapping("hello_api")
    @ResponseBody()
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello(); //객체 생성
        hello.setName(name);

        return hello; //이렇게 단순한 string이 아니라 객체를 넘겼을때, 어떻게 되는지를 보는 것이다.
    }

    static class Hello{
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}
