package fi.haagahelia.excersice.web;

import fi.haagahelia.excersice.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HandleController {

    @GetMapping("/hello")
    public String hello(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John","Doe"));
        students.add(new Student("Micheal","Qi"));
        students.add(new Student("Danel","Rose"));


        model.addAttribute("students",students);


        return "hello";
    }




}
