package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.dto.DelitoDto;
import co.edu.iudigital.app.model.Delito;

public interface IDelitoService {
	
	public List<DelitoDto> findAll();
	
	public Delito findById(Long Id);
	
	public Delito save(Delito delito);
	
	public void delete(Long id);
}
