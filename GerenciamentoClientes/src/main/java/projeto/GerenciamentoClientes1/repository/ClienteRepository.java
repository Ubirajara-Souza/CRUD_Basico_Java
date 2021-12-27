package projeto.GerenciamentoClientes1.repository;

import  org.springframework.data.jpa.repository.JpaRepository;

import projeto.GerenciamentoClientes1.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
