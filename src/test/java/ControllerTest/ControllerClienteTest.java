/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerTest;
import a.vendasy2.controller.ControllerCliente;
import a.vendasy2.model.ModelCliente;
import a.vendasy2.dao.DAOCliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
/**
 *
 * @author jose_
 */
public class ControllerClienteTest {
     private ControllerCliente controllerCliente;
    private DAOCliente daoCliente;

    @BeforeEach
    public void setUp() {
        // Crie uma instância do ControllerCliente
        controllerCliente = new ControllerCliente();

        // Crie um mock para o DAOCliente
        daoCliente = Mockito.mock(DAOCliente.class);
        controllerCliente.daoCliente = daoCliente;
    }

@Test
public void testAtualizarClienteController() {
    // Crie uma instância do ModelCliente com os dados para atualização
    ModelCliente cliente = new ModelCliente();
    cliente.setIdCliente(1);
    cliente.setCliNome("João do teste");
    cliente.setCliEndereco("Rua Teste");
    cliente.setCliBairro("Bairro teste");
    cliente.setCliCidade("Cidade teste");
    cliente.setCliUf("UF teste");
    cliente.setCliCep("32310210");
    cliente.setCliTelefone("31973737373");

    // Configure o comportamento do mock do DAOCliente para retornar true
    when(daoCliente.atualizarClienteDAO(cliente)).thenReturn(true);

    // Execute o método atualizarClienteController
    boolean resultado = controllerCliente.atualizarClienteController(cliente);

    // Verifique se o resultado é true (ou seja, a atualização foi bem-sucedida)
    assertTrue(resultado);

    // Verifique se o método atualizarClienteDAO do mock foi chamado com o cliente correto
    verify(daoCliente).atualizarClienteDAO(cliente);
}
}
