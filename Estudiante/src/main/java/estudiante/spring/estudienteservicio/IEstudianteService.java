package estudiante.spring.estudienteservicio;

import java.util.List;
import estudiante.spring.modeloentity.Estudiante;

public interface IEstudianteService {
	public List<Estudiante> listar();
	public Estudiante insertar(Estudiante estudiante);
	public void  borrar(Long id);
	public Estudiante findById(Long id);

}
