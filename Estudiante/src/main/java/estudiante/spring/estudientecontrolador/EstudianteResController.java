package estudiante.spring.estudientecontrolador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import estudiante.spring.estudienteservicio.IEstudianteService;
import estudiante.spring.modeloentity.Estudiante;

@RestController
@RequestMapping("/api")
public class EstudianteResController {
	@Autowired
	private IEstudianteService estudianteservice;

	@GetMapping("/estudiante")
	public List<Estudiante> listarEstudiantes() {
		return estudianteservice.listar();
	}

	@PostMapping("/estudiante")
	public Estudiante insertar(@RequestBody Estudiante estudiante) {
		return estudianteservice.insertar(estudiante);
	}

	@DeleteMapping("/estudiante/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		estudianteservice.borrar(id);
	}

	@PutMapping("/estudiante/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante update(@RequestBody Estudiante estudiante, @PathVariable Long id) {
		Estudiante actual = estudianteservice.findById(id);
		actual.setApellido(estudiante.getApellido());
		actual.setNombre(estudiante.getNombre());
		actual.setCarrera(estudiante.getCarrera());
		actual.setPromedio(estudiante.getPromedio());
		return actual;
	}
}
