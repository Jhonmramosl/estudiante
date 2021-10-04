package estudiante.spring.estudienteservicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estudiante.spring.modelodao.EstudianteDAO;
import estudiante.spring.modeloentity.Estudiante;

	@Service
public class EstudianteService implements IEstudianteService {
	@Autowired
	private EstudianteDAO estudiantedao;
	@Override
	public List<Estudiante> listar(){
		return estudiantedao.findAll();
	}
	@Override
	public Estudiante insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudiantedao.save(estudiante);
	}
	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		estudiantedao.deleteById(id);
		
	}
	@Override
	public Estudiante findById(Long id) {
		// TODO Auto-generated method stub
		return estudiantedao.findById(id).orElse(null);
	}
	
	
}
