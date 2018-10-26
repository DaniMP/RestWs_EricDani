package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FactorialController {

    @RequestMapping("/factorial")
    public String fact (@RequestParam(value="numero",defaultValue="5") int numero){

        int factorial = 1;
        for(int i=1;i<=numero;i++) {
            factorial=factorial*i;
        }

        String frase = "El factorial de "+numero+" es "+factorial;
        return frase;
    }

}

