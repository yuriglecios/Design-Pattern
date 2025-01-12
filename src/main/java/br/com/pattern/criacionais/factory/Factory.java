package br.com.pattern.criacionais.factory;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Factory {

    private final Map<String, IUsuario> tipoUsuario;

    public Factory(Map<String, IUsuario> tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public IUsuario getUsuario(String tipo){
        IUsuario usuario = tipoUsuario.get(tipo);
        if (usuario == null){
            throw new IllegalArgumentException("Tipo de usuário não encontrado");
        }
        return usuario;
    }
}
