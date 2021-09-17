package com.empresa.service;


import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public Medicamento insertaActualiza(Medicamento obj);
	
	public List<Medicamento> listaMedicamento();
	
	void eliminarMedicamento(int idMedicamento);
	
	public Optional<Medicamento> obtienePorId(int idMedicamento);
	
	public List<Medicamento> obtienePorNombreLike(String prefix);
	
	public List<Medicamento> obtieneStockMayorQue(int stock);

}
