package Java_SpringBoot.RegistroAluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Java_SpringBoot.domain.model.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

    boolean existsByAccountNumber(String accountNumber);
}