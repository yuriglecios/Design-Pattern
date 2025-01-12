package br.com.pattern.criacionais.factory;

import org.springframework.stereotype.Component;

@Component("administrador")
public class Administrador implements IUsuario{
    @Override
    public void salvar() {

    }
}
