package com.ServiciosWeb.CloudAPI.Services;

import com.ServiciosWeb.CloudAPI.Entidad.Usuario;
import com.ServiciosWeb.CloudAPI.Repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;

@SecondaryRow
@AllArgsConstructor
public class ServicioUsuario {

    private RepositorioUsuario repositorioUsuario;

    public Usuario buscarUrl(String url) {
        return repositorioUsuario.findByurl(url);
    }

    public void guardarUsuarioActualizar(Usuario usuario) {
        repositorioUsuario.save(usuario);
    }

    public void eliminarUsuario(String nombre) {
        repositorioUsuario.delete(repositorioUsuario.findBynombre(nombre));
    }
}
