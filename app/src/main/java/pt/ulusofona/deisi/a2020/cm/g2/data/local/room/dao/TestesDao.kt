package pt.ulusofona.deisi.a2020.cm.g2.data.local.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import pt.ulusofona.deisi.a2020.cm.g2.data.local.entities.Teste

@Dao
interface TestesDao {

    @Insert
    suspend fun insert(testes: Teste)

    @Query("SELECT * FROM testes")
    suspend fun getAll(): List<Teste>

    @Query("SELECT * FROM testes WHERE resultado = :resultado")
    suspend fun getByResultado(resultado: String): Teste


    @Query("SELECT * FROM testes ORDER BY data DESC")
    suspend fun sortedByDescending(): List<Teste>

    @Query("SELECT * FROM testes ORDER BY data ASC")
    suspend fun sortedByAscending(): List<Teste>

}