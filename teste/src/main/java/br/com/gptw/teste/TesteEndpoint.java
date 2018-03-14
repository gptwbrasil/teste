package br.com.gptw.teste;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class TesteEndpoint {

    @RequestMapping(method = RequestMethod.GET, path = "/teste1")
    @ResponseBody
    public Object teste1() {

        Map<String, Object> ret = new HashMap<>();
        ret.put("status", "ok");
        return ret;

    }
}
