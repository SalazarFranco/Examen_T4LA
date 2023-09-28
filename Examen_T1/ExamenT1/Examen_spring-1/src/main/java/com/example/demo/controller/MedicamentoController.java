package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.Medicamento;
import repositorio.MedicamentoRepositorio;

@Controller
@RequestMapping("/medicamentos")
public class MedicamentoController {
	@Autowired
	private MedicamentoRepositorio medicamentoRepositorio;
	
	@GetMapping("/")
	public String listarMedicamentos(Model model) {
		List<Medicamento> medicamentos = medicamentoRepositorio.findAll();
		model.addAttribute("medicamentos", medicamentos);
		return "listarMedicamentos";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarMedicamento(@PathVariable Integer id) {
		medicamentoRepositorio.deleteById(id);
		return "redirect:/medicamentos/";
	}
}
