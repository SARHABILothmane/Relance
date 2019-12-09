package com.relance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.relance.Entity.Clients;
import com.relance.Entity.type_de_relance;
import com.relance.services.I_ServicesTypeRelance;

@Controller
public class ControllerTypeRelance {
@Autowired
I_ServicesTypeRelance servicetyperelance;
@RequestMapping("/typerelance")
public String typerelance(Model m) {
	List<type_de_relance> l = servicetyperelance.selcetionAllTypeRelance();
	type_de_relance tr = new type_de_relance();
	System.out.println(l);
	m.addAttribute("t", tr);
	m.addAttribute("showAll", l);
	return "typerelance";
}
@RequestMapping("/SaveTypeRelance")
public String savetr(@ModelAttribute("t") type_de_relance tp ) {
	servicetyperelance.addUptypeR(tp);
	return "redirect:/typerelance";
}
@RequestMapping("/updateTypeRelance")
public String update(@RequestParam("id") int id ,  Model model ) {
	type_de_relance tr = servicetyperelance.selectTypeRelanceId(id);
	List<type_de_relance> l = servicetyperelance.selcetionAllTypeRelance();
	model.addAttribute("showAll", l);
	model.addAttribute("t",tr);
//    service.UpdatePerson(p);
return "typerelance";
}
@RequestMapping("/deleteTypeRelance/{id}")
public String delete(@PathVariable("id") int id ) {
servicetyperelance.deletTypeRelance(id);
return "redirect:/typerelance";
}
}
