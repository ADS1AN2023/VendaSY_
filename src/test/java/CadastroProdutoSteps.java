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
import a.vendasy2.view.ViewProduto;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class CadastroProdutoSteps {

    private ViewProduto viewProduto = new ViewProduto();
    private ControllerProdutos controllerProdutos = new ControllerProdutos();
    private ModelProdutos modelProdutos = new ModelProdutos();
    private String mensagem;

    @Dado("que o usuário está na página de cadastro de produtos")
    public void que_o_usuário_está_na_página_de_cadastro_de_produtos() {
        viewProduto.setVisible(true);
    }

    @Quando("o usuário preenche o campo {string} com {string}")
    public void o_usuário_preenche_o_campo_com(String campo, String valor) {
        if (campo.equals("Nome")) {
            viewProduto.getJtfNome().setText(valor);
        } else if (campo.equals("Estoque")) {
            viewProduto.getJtfEstoque().setText(valor);
        } else if (campo.equals("Valor")) {
            viewProduto.getJtfValor().setText(valor);
        }
    }

    @E("o usuário clica no botão {string}")
    public void o_usuário_clica_no_botão(String botao) {
        if (botao.equals("Salvar")) {
            viewProduto.getJbSalvar().doClick();
        }
    }

    @Entao("o sistema deve exibir a mensagem {string}")
    public void o_sistema_deve_exibir_a_mensagem(String mensagemEsperada) {
        this.mensagem = controllerProdutos.getMensagem();
        Assert.assertEquals(mensagemEsperada, this.mensagem);
    }

    @E("o produto {string} deve estar na lista de produtos cadastrados")
    public void o_produto_deve_estar_na_lista_de_produtos_cadastrados(String nomeProduto) {
        modelProdutos = controllerProdutos.retornarProdutoControllerPeloNome(nomeProduto);
        Assert.assertNotNull(modelProdutos);
    }
}
