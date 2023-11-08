package a.vendasy2.controller;

import a.vendasy2.model.ModelVendasProdutos;
import java.util.ArrayList;
import a.vendasy2.dao.DAOVendasProdutos;

/**
*
* @author Jose_
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProduto
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProduto);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pIdVendaProduto
    * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pIdVendaProduto
    * @return boolean
    */
    public boolean excluirVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }

    /**
     * Salva uma lista de produtos da venda
     * @param pListaModelVendasProdutos
     * @return 
     */
    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
       return this.daoVendasProdutos.salvarVendasProdutosDAO(pListaModelVendasProdutos);
    }
}
