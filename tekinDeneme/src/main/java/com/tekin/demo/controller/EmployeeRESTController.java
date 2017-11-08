package com.tekin.demo.controller;

import com.google.gson.Gson;
import com.tekin.demo.model.Employee;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mustafa.tekin on 02/10/2017.
 */
@Controller
@RequestMapping("/deneme")
public class EmployeeRESTController {

    private List<Employee> getEmployeesCollection() {
        List<Employee> employees = new ArrayList<Employee>();

        Employee empOne = new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        Employee empTwo = new Employee(2, "Amit", "Singhal", "asinghal@yahoo.com");
        Employee empThree = new Employee(3, "Kirti", "Mishra", "kmishra@gmail.com");


        employees.add(empOne);
        employees.add(empTwo);
        employees.add(empThree);

        return employees;
    }

    @RequestMapping(value = "/employees")
    public ModelAndView getAllEmployeesHTML(HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("page");
        mav.addObject("employees", getEmployeesCollection());
        return mav;
    }

    @RequestMapping(value = "/modelmap", method = RequestMethod.GET)
    public String getAllEmployeesModelMap(ModelMap model) {
        model.addAttribute("employees", getEmployeesCollection());
        return "deneme";
    }

    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public String getAllEmployeesJSON(Model model) throws ParseException, JSONException {
        List<Employee> list = getEmployeesCollection();
        model.addAttribute(list);
        return "jsonTemplate";
    }
}
