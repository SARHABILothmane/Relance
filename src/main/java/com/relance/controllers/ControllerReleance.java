package com.relance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.relance.Entity.Relance;
import com.relance.Entity.type_de_relance;
import com.relance.services.I_ServicesRelance;
import com.relance.services.I_ServicesTypeRelance;

@Controller
public class ControllerReleance {
	
@Autowired
I_ServicesRelance ServiceRelance;
@Autowired
I_ServicesTypeRelance servicetyperelance;
@RequestMapping("/relance")
public String SelectAllRelance(@RequestParam("id") int id , Model m) {
		List<Relance> l = ServiceRelance.selcetionAllRelance();
		Relance r =  new Relance();
		m.addAttribute("r", r);
		m.addAttribute("showAllRelance", l);
		m.addAttribute("id", id);
		List<type_de_relance> li = servicetyperelance.selcetionAllTypeRelance();

		m.addAttribute("showAll", li);
		return "relance";
}
@RequestMapping("/SaveRelance")
public String Saverelance(@ModelAttribute("r") Relance re) {
	ServiceRelance.addUprelance(re);
	String ss = "redirect:/relance?id="+re.getId_facture().getId();
	return ss;
}

}
