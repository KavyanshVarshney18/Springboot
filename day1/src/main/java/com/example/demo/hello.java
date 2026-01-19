    package com.example.demo;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;
    @RestController
    public class hello {
        @GetMapping("/hello")
        public String hello(){
            return "This is the first line";
        }

        @GetMapping("/about")
        public String about(){
            return "This is about page";
        }

        @GetMapping("/contact")
        public String contact(){
            return "This is contact page";
        }


    }
