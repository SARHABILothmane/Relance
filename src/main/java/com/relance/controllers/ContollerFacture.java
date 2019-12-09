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
import com.relance.Entity.Factures;
import com.relance.services.I_ServiceClients;
import com.relance.services.I_ServicesFactures;

@Controller
public class ContollerFacture {
	@Autowired
	I_ServicesFactures ServiceFactur;

@RequestMapping("/afficheFrt")	
	public String affiche(@RequestParam("id") int id  ,Model M ) {
	List<Factures> l = ServiceFactur.selectAllFacture(id);
	Factures ff = new Factures();
	M.addAttribute("id", id);
	M.addAttribute("f", ff);
	M.addAttribute("showAll", l);
	return "factures";
}


@RequestMapping("/SaveFct")
public String save(@ModelAttribute("f") Factures f) {
	ServiceFactur.addFacture(f);
	System.out.println(f);
	String ss="redirect:/afficheFrt?id="+f.getClient().getId();
	return ss;

}

@RequestMapping("/updateFrt/{id}/{idF}")
public String update(@PathVariable("idF") int id ,  Model model ) {
	Factures f = ServiceFactur.selectFacture(id);
	List<Factures> l = ServiceFactur.selectAllFacture(f.getClient().getId());
	model.addAttribute("showAll", l);
	model.addAttribute("f",f);
//    service.UpdatePerson(p);
return "/factures";
}
//
@RequestMapping("/delete/{id}/{idF}")
public String delete(@PathVariable("idF") int id ) {
	Factures f = ServiceFactur.selectFacture(id);
	ServiceFactur.DeleteFacture(id);
	String ss="redirect:/afficheFrt?id="+f.getClient().getId();
	return ss;
}
}
