package com.springbootlogin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootlogin.model.Student;
import com.springbootlogin.service.StudentService;

@Controller
public class StudentController {
      private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	 @GetMapping("/login") 
	    public String login() {
	    	   return "login";
	    }
    // handler method to handle list students and return model and view
	@GetMapping("/")
	public String listStudents(Model model) {
		     model.addAttribute("students", studentService.getAllStudents());
		     return "students";
	}
    @GetMapping("/new")
    public String createStudentForm(Model model) {
    	// create student object to hold student from data
    	Student student = new Student();
    	model.addAttribute("student", student);
    	return "create_student";
    	 
    }
    
    @PostMapping("/")
    public String saveStudent(@ModelAttribute ("student") Student student) {
    	       studentService.saveStudent(student);
    	       return "redirect:/";
    }
    
    @GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
    	       model.addAttribute("student", studentService.getStudentById(id));
    	       return "edit_student";
    }
    @PostMapping("/{id}")
    public String updateStudent(@PathVariable Long id,
    		     @ModelAttribute("student") Student student,
    		     Model model
    		) {
    	            // get student from database by id
    	            Student existingStudent = studentService.getStudentById(id);
    	            existingStudent.setId(id);
    	            existingStudent.setFirstName(student.getFirstName());
    	            existingStudent.setLastName(student.getLastName());
    	            existingStudent.setEmail(student.getEmail());
    	            // save upload student object
    	            studentService.updateStudent(existingStudent);
    	            return "redirect:/";
    	
    }
    // handler method to handle delete student request
    @GetMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
    	     studentService.deleteStudentById(id);
    	     return "redirect:/";
    }
	
	
}
