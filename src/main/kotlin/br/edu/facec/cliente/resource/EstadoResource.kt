package br.edu.facec.cliente.resource

import br.edu.facec.cliente.entity.Estado
import br.edu.facec.cliente.service.EstadoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
class EstadoResource(private val service: EstadoService) {

    @PostMapping("/estados")
    fun post(@RequestBody @Valid estado: Estado): ResponseEntity<Estado> {
        val saved = service.save(estado)
        return ResponseEntity.status(HttpStatus.CREATED).body(saved)
    }

    @DeleteMapping("/estados/{id}")
    fun delete(@PathVariable("id") id: UUID): ResponseEntity<Estado> {
        if (!service.exists(id)) {
            return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .build()
        }
        service.deleteById(id)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }

}