package com.innovatec.SmartSoluctions.funcionarios;


import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Funcionarios {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // responsabilidade para o banco de dados
		private Long id;
		private String Nome;
		private String Email;
		private String Cargo;
		private String Funcao;
		private String Endereco;
		private int CPF;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getCargo() {
			return Cargo;
		}
		public void setCargo(String cargo) {
			Cargo = cargo;
		}
		public String getFuncao() {
			return Funcao;
		}
		public void setFuncao(String funcao) {
			Funcao = funcao;
		}
		public String getEndereco() {
			return Endereco;
		}
		public void setEndereco(String endereco) {
			Endereco = endereco;
		}
		public int getCPF() {
			return CPF;
		}
		public void setCPF(int cPF) {
			CPF = cPF;
		}
		@Override
		public int hashCode() {
			return Objects.hash(CPF, Cargo, Email, Endereco, Funcao, Nome, id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Funcionarios other = (Funcionarios) obj;
			return CPF == other.CPF && Objects.equals(Cargo, other.Cargo) && Objects.equals(Email, other.Email)
					&& Objects.equals(Endereco, other.Endereco) && Objects.equals(Funcao, other.Funcao)
					&& Objects.equals(Nome, other.Nome) && Objects.equals(id, other.id);
		}
		
		
				
}
