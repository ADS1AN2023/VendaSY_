package ControllerTest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jose_
 */
import a.vendasy2.controller.ControllerProdutos;
import a.vendasy2.model.ModelProdutos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControllerProdutosTest {

    private ControllerProdutos controllerProdutos;

    @BeforeEach
    public void setUp() {
        controllerProdutos = new ControllerProdutos();
    }

    @Test
    public void testAlterarEstoqueProdutoController() {
        // Crie uma lista de produtos para alterar o estoque
        ArrayList<ModelProdutos> listaProdutos = new ArrayList<>();
        // Crie alguns produtos para adicionar à lista
        ModelProdutos produto1 = new ModelProdutos();
        produto1.setIdProduto(1);
        produto1.setProNome("Produto 1");
        produto1.setProEstoque(10);

        ModelProdutos produto2 = new ModelProdutos();
        produto2.setIdProduto(2);
        produto2.setProNome("Produto 2");
        produto2.setProEstoque(5);

        // Adicione os produtos à lista
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        boolean result = controllerProdutos.alterarEstoqueProdutoController(listaProdutos);
        // Verifique se a operação de alteração de estoque foi bem-sucedida
        assertTrue(result);
    }

    @Test
    public void testRetornarListaProdutoController() {
        ArrayList<ModelProdutos> listaProdutos = controllerProdutos.retornarListaProdutoController();
        // Verifique se a lista de produtos não está vazia e contém pelo menos um produto
        assertTrue(!listaProdutos.isEmpty());
    }
}

