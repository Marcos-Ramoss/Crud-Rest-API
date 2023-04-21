package com.innovatec.SmartSoluctions.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.innovatec.SmartSoluctions.funcionarios.Funcionarios;

@EnableJpaRepositories
public interface FuncionarioRepository extends JpaRepository<Funcionarios, Long> {

	
	
}
