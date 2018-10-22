package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class FactController {
    private static final String template = "Hola, %s!";
    private final AtomicLong cant = new AtomicLong();

    @RequestMapping("/factorial")
    public Fact fact(@RequestParam(value="numero",defaultValue="4") int numero) {
        Fact fact;
        fact = new Fact(numero);

        for(int i=1;i<fact.getNum();i++) {
            fact.setNum(fact.getNum()* i);
        }
        return fact;
    }
}
