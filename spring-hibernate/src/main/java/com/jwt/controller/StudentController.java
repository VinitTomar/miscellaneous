package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Employee;
import com.jwt.model.Student;
import com.jwt.service.EmployeeService;
import com.jwt.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	public StudentController() {
		System.out.println("StudentController()");
	}

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "")
	public String listStudent(Model model) throws IOException {
		List<Student> listStudent = studentService.getAllStudent();
		model.addAttribute("listStudent", listStudent);
		return "students";
	}

	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public String newStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "StudentForm";
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveEmployee(@Valid Student student, BindingResult result, Model m) {
		int sid=student.getId();
		if(result.hasErrors()){
			System.out.println("Student has error := "+ result.hasErrors());
			return "StudentForm";
		}
		m.addAttribute("Student",student);
		if (sid == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			studentService.addStudent(student);
		} else {
			studentService.updateStudent(student);
		}
		
		
		return "redirect:/students";
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public String deleteEmployee(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		studentService.deleteStudent(studentId);
		return "redirect:/students";
	}

	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public String editContact(Model model,HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		Student student = studentService.getStudent(studentId);		
		model.addAttribute("student", student);
		return "StudentForm";
	}

}
