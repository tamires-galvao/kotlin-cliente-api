package br.edu.facec.cliente.service

import br.edu.facec.cliente.entity.Cidade
import br.edu.facec.cliente.repository.CidadeRepository
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class CidadeService(private val repository: CidadeRepository) {

    fun findAll(pageable: Pageable) = repository.findAll(pageable)

    fun findById(id: UUID): Cidade? = repository.findByIdOrNull(id)

    fun save(cidade: Cidade): Cidade = repository.save(cidade)

    fun exists(id: UUID) = repository.existsById(id)

    fun deleteById(id: UUID) = repository.deleteById(id)

}