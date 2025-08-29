package com.example.app.service;

import com.example.app.models.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(int id);

	void inserir(Cliente cliente);

	void atualizar(int id, Cliente cliente);

	void deletar(int id);

}
