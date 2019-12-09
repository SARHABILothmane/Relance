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
import com.relance.services.I_ServiceClients;

@Controller
public class ControllerClient {
@Autowired
I_ServiceClients ServiceClient;


@RequestMapping("/afficheClt")
public String affiche(Model M ) {
	List<Clients> l = ServiceClient.selectionAll();
	Clients cc = new Clients();
	M.addAttribute("c", cc);
	M.addAttribute("showAll", l);
	return "index";
}


@RequestMapping("/SaveClt")
public String save(@ModelAttribute("c") Clients c) {
	ServiceClient.addclient(c);
	return "redirect:/afficheClt";

}

@RequestMapping("/updateClt")
public String update(@RequestParam("id") int id ,  Model model ) {
	Clients c = ServiceClient.selectClient(id);
	List<Clients> l = ServiceClient.selectionAll();
	
	model.addAttribute("showAll", l);
	model.addAttribute("c",c);
//    service.UpdatePerson(p);
return "index";
}

@RequestMapping("/delete/{id}")
public String delete(@PathVariable("id") int id ) {
	ServiceClient.DeleteClient(id);
return "redirect:/afficheClt";
}

}
