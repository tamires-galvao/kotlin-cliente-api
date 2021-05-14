package br.edu.facec.cliente.entity

import org.hibernate.validator.constraints.Length
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class Endereco(
    @Id
    @GeneratedValue
    val id: UUID?,

    @Column(name = "cep")
    @field:NotBlank(message = "Informe seu cep!")
    @field:Length(message = " Deve ter no máximo 8 caracteres", max = 8)
    val cep: String,

    @Column(name = "rua")
    @field:NotBlank(message = "Informe o nome da Rua!")
    @field:Length(message = "Nome da rua deve ter no máximo 100 caracteres", max = 100)
    val rua: String,

    @Column(name = "numero")
    @field:NotBlank(message = "Informe seu numero!")
    @field:Length(message = "Nome do cliente deve ter no máximo 100 caracteres", max = 100)
    val numero: String,

    @Column(name = "bairro")
    @field:NotBlank(message = "Informe seu bairro!")
    @field:Length(message = "Nome do bairro deve ter no máximo 100 caracteres", max = 100)
    val bairro: String,

    @Column(name = "complemento")
    @field:NotBlank(message = "Informe seu complemento!")
    @field:Length(message = "Complemento deve ter no máximo 100 caracteres", max = 100)
    val complemento: String,

    @Column(name = "cidade_fk")
    @field:NotNull(message = "Informe sua cidade!")
    val cidadeId: UUID,

)
