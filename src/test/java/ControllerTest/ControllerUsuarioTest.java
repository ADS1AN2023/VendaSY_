package ControllerTest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jose_
 */
import a.vendasy2.controller.ControllerUsuario;
import a.vendasy2.model.ModelUsuario;
import a.vendasy2.dao.DAOUsuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControllerUsuarioTest {

    private ControllerUsuario controllerUsuario;
    private DAOUsuario daoUsuario;

    @BeforeEach
    public void setUp() {
        // Crie uma instância do ControllerUsuario
        controllerUsuario = new ControllerUsuario();

        // Crie um mock para o DAOUsuario
        daoUsuario = Mockito.mock(DAOUsuario.class);
        controllerUsuario.daoUsuario = daoUsuario;
    }

@Test
    public void testSalvarUsuarioController() {
        ModelUsuario usuario = new ModelUsuario();
        usuario.setUsuNome("Usu teste");
        usuario.setUsuLogin("login teste");
        usuario.setUsuSenha("123456789");

        // Simule o retorno do DAOUsuario
        Mockito.when(daoUsuario.salvarUsuarioDAO(usuario)).thenReturn(1); // Retorne o valor desejado (por exemplo, 1) aqui

        int resultado = controllerUsuario.salvarUsuarioController(usuario);

        // Verifique se o resultado é maior que 0 para indicar que o usuário foi salvo com sucesso
        assertTrue(resultado > 0);
    }

   @Test
    public void testAtualizarUsuarioController() {
        ModelUsuario usuario = new ModelUsuario();
        usuario.setIdUsuario(1);
        usuario.setUsuNome("Usu teste");
        usuario.setUsuLogin("login teste");
        usuario.setUsuSenha("987654321");

        // Simule o retorno do DAOUsuario
        Mockito.when(daoUsuario.atualizarUsuarioDAO(usuario)).thenReturn(true); // Retorne o valor desejado (true) aqui

        boolean resultado = controllerUsuario.atualizarUsuarioController(usuario);

        // Verifique se o resultado é verdadeiro para indicar que o usuário foi atualizado com sucesso
        assertTrue(resultado);
    }
}

