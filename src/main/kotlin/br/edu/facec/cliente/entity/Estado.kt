package br.edu.facec.cliente.entity

import org.hibernate.validator.constraints.Length
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Estado(

    @Id
    @GeneratedValue
    val id: UUID?,

    @Column(name = "nome")
    @field:NotBlank(message = "Nome do Estado deve ser informado.")
    @field:Length(message="Nome do Estado deve ter no máximo 100 caracteres",  max = 100)
    val nome: String,

    @Column(name = "uf")
    @field:NotBlank(message = "Uf deve ser informada!")
    @field:Length(message = "Uf deve ter no máximo 2 caracteres", max = 2)
    val uf: String

)
