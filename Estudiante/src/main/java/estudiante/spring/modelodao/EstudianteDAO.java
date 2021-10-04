package estudiante.spring.modelodao;

import org.springframework.data.jpa.repository.JpaRepository;

import estudiante.spring.modeloentity.Estudiante;

public interface EstudianteDAO  extends JpaRepository<Estudiante, Long> {

}
