package it.nio74.Model;

import java.util.ArrayList;
import java.util.List;

import it.nio74.db.CorsoDAO;



public class GestoreCorsi {

	public List<Corso> getCorsiPeriodo(int periodo) {
		
		CorsoDAO dao =  new CorsoDAO();
		//Soluzione1
		/*
		List<Corso> corsi = dao.listAll();
		List<Corso> result = new ArrayList<Corso>();
		
		for(Corso c: corsi)
			if(c.getPd() == periodo) {
				
				result.add(c);
				
			}
		*/
		
		//Soluzione 2
		return dao.listCorsiByPD(periodo);
	}
	
	

}
