/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.vendasy2.controller;

import a.vendasy2.dao.DAOProdutosVendasProdutos;
import a.vendasy2.model.ModelProdutosVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author jose_
 */
public class ControllerProdutosVendasProdutos {
    
    private DAOProdutosVendasProdutos dAOProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController (int pCodigoVenda){
        return this.dAOProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }
}
