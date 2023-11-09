/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.vendasy2.controller;
import a.vendasy2.dao.DAOProdutos;
import java.util.ArrayList;
import a.vendasy2.model.ModelProdutos;

/**
 *
 * @author jose_
 */
public class ControllerProdutos {
    private DAOProdutos daoProdutos = new DAOProdutos();
    
    /**
     * Salvar produtos Controller
     * @param pModelProdutos
     * @return int
     */
       public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
        }
       
 /**
  * Excluir um produto pelo código
  * @param pCodigo
  * @return boolean
  */      
 public boolean excluirProdutoController(int pCodigo){
     return this.daoProdutos.excluirProdutoDAO(pCodigo);
 }
 
/**
 * Altera um produto
 * @param pModelProdutos
 * @return 
 */
 public boolean alterarProdutoController(ModelProdutos pModelProdutos){
     return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
 }
    
 /**
  * Retornar produto pelo código
  * @param pCodigo
  * @return model produto
  */
 public ModelProdutos retornarProdutoController(int pCodigo){
     return this.daoProdutos.retornarProdutoDAO(pCodigo);
 }
 
 /**
  * Retornar produto pelo nome
  * @param pNomeProduto
  * @return model produto
  */
 public ModelProdutos retornarProdutoControllerS(String pNomeProduto){
     return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
 }
 
 /**
  * retornar uma lista de produtos
  * @return lista Model produtos
  */
 public ArrayList<ModelProdutos> retornarListaProdutoController(){
     return this.daoProdutos.retornarListaProdutosDAO();
 }

/**
 * Alterar lista de produtos no banco
 * @param pListaModelProdutos
 * @return 
 */ 
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
       return this.daoProdutos.alterarEstoqueProdutosDAO(pListaModelProdutos);
    }
}
