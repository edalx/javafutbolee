/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.dacopancm.jfee.sp.service;

import io.dacopancm.jfee.exceptions.JfeeCustomException;
import io.dacopancm.jfee.sp.model.Usuario;

/**
 *
 * @author anunaki
 */
public interface UsuarioService {

    public Usuario getUsuario(String usr_ci);

    public void updateUsuario(Usuario u);

    public void failLoginUser(String ci);

    public void requestPassword(String userName);
}
