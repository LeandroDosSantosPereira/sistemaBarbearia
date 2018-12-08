package br.com.dao;

import model.ModelUsuario;
import br.com.Conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class DAOUsuario extends ConexaoMySql {

    /**
     * grava Usuario
     *
     * @param pModelUsuario return int
     */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO USUARIOS ("
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario"
                    + ") VALUES ("
                    + "'" + pModelUsuario.getNomeUsuario() + "',"
                    + "'" + pModelUsuario.getLoginUsuario() + "',"
                    + "'" + pModelUsuario.getSenhaUsuario() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Usuario
     *
     * @param pIdUsuario return ModelUsuario
     */
    public ModelUsuario getUsuarioDAO(int pIdUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario"
                    + " FROM"
                    + " USUARIOS"
                    + " WHERE"
                    + " id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setLoginUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * recupera uma lista de Usuario return ArrayList
     */
    public ArrayList<ModelUsuario> getListaUsuarioDAO() {
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario"
                    + " FROM"
                    + " USUARIOS"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setLoginUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
     * atualiza Usuario
     *
     * @param pModelUsuario return boolean
     */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE USUARIOS SET "
                    + "id_usuario = '" + pModelUsuario.getIdUsuario() + "',"
                    + "nome_usuario = '" + pModelUsuario.getNomeUsuario() + "',"
                    + "login_usuario = '" + pModelUsuario.getLoginUsuario() + "',"
                    + "senha_usuario = '" + pModelUsuario.getSenhaUsuario() + "'"
                    + " WHERE "
                    + "id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Usuario
     *
     * @param pIdUsuario return boolean
     */
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM USUARIOS "
                    + " WHERE "
                    + "id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean getValidarUsuarioDAO(ModelUsuario pmodelUsuario) {

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario"
                    + " FROM"
                    + " USUARIOS"
                    + " WHERE"
                    + " login_usuario =" + "'" + pmodelUsuario.getLoginUsuario() + "'" + " AND senha_usuario =" + "'" + pmodelUsuario.getSenhaUsuario() + "'"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {

            this.fecharConexao();
        }

    }
}
