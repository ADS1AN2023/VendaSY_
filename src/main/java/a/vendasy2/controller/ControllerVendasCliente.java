/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.vendasy2.controller;

import a.vendasy2.dao.DAOVendasCliente;
import java.util.ArrayList;
import a.vendasy2.model.ModelVendasCliente;

/**
 *
 * @author jose_
 */
public class ControllerVendasCliente {

    private DAOVendasCliente daoVendasCliente = new DAOVendasCliente();

    public ArrayList<ModelVendasCliente> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClienteDAO();
    }

}
