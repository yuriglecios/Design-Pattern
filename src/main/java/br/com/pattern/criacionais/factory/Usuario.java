package br.com.pattern.criacionais.factory;

import org.springframework.stereotype.Component;

@Component("usuario")
public class Usuario implements IUsuario{
    @Override
    public void salvar() {

    }
}
