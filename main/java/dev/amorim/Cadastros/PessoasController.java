package dev.amorim.Cadastros;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class PessoasController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }
}



