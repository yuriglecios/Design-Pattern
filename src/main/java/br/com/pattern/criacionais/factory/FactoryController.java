package br.com.pattern.criacionais.factory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {

    private final Factory factory;

    public FactoryController(Factory factory) {
        this.factory = factory;
    }

    @PostMapping("/salvar")
    public String salvar(@RequestParam String tipo){
        IUsuario usuario = factory.getUsuario(tipo);
        usuario.salvar();
        return "Salvo com sucesso";
    }
}
