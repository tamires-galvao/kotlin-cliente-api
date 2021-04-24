package br.edu.facec.cliente.resource

import br.edu.facec.cliente.dto.HelloWorldDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldResource {

    @GetMapping("/hello-world")
    fun helloWorld(): HelloWorldDTO {
        return HelloWorldDTO()
    }

}