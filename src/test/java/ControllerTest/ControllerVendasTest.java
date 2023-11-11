package ControllerTest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jose_
 */
import a.vendasy2.controller.ControllerVendas;
import a.vendasy2.model.ModelVendas;
import a.vendasy2.dao.DAOVendas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.time.LocalDate;



import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControllerVendasTest {

    private ControllerVendas controllerVendas;
    private DAOVendas daoVendas;

    @BeforeEach
    public void setUp() {
        // Crie uma instância do ControllerVendas
        controllerVendas = new ControllerVendas();

        // Crie um mock para o DAOVendas
        daoVendas = Mockito.mock(DAOVendas.class);
        controllerVendas.daoVendas = daoVendas;
    }



@Test
    public void testExcluirVendasController() {
        int idVenda = 1; // Insira um ID de venda válido para o teste

        // Simule o retorno do DAOVendas
        Mockito.when(daoVendas.excluirVendasDAO(idVenda)).thenReturn(true); // Retorne o valor desejado (true) aqui

        boolean resultado = controllerVendas.excluirVendasController(idVenda);

        // Verifique se o resultado é verdadeiro para indicar que a venda foi excluída com sucesso
        assertTrue(resultado);
    }
}

