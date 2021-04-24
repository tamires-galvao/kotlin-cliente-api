package br.edu.facec.cliente.service

import br.edu.facec.cliente.entity.Estado
import br.edu.facec.cliente.repository.EstadoRepository
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class EstadoService(private val repository: EstadoRepository) {

    fun findAll(pageable: Pageable) = repository.findAll(pageable)

    fun findById(id: UUID): Estado? = repository.findByIdOrNull(id)

    fun save(estado: Estado): Estado = repository.save(estado)

    fun exists(id: UUID) = repository.existsById(id)

    fun deleteById(id: UUID) = repository.deleteById(id)

}