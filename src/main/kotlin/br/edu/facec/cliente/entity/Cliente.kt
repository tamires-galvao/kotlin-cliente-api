package br.edu.facec.cliente.entity

import org.hibernate.validator.constraints.Length
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class Cliente(
    @Id
    @GeneratedValue
    val id: UUID?,

    @Column
    @field:NotBlank(message = "Nome do cliente deve ser informado!")
    @field:Length(message = "Nome do cliente deve ter no máximo 100 caracteres", max = 100)
    val nomeCliente: String,

    @Column(name = "sexo")
    @Enumerated(value = EnumType.STRING)
    @field:NotBlank(message = "Informe FEMINO ou MASCULINO!")
    @field:Length(message = " Deve ter no máximo 9 caracteres", max = 9)
    val sexo: Sexo,

    @Column(name = "documento")
    @field:NotBlank(message = "Informe seu CPF ou CNPJ!")
    @field:Length(message = "O documento deve ter no maximo 14 caracteres", max = 14 )
    val documento: String,

    @Column(name = "endereco_fk")
    @field:NotNull(message = "Endereço deve ser informado!")
    @ManyToOne
    val enderecoId: UUID,


)
