package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import modelo.Medicamento;

public interface MedicamentoRepositorio extends JpaRepository<Medicamento, Integer> {

}
