package com.centroafuera.miprimerservidor

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class House(private var name : String, private var region : String, private var words : String, private var miembros : String) {

    @Id
    @GeneratedValue
    private val id: Long? = null

    override fun equals(other: Any?): Boolean {
        if (other is House){
            return other.id == id && id != null
        } else {
            return false
        }
    }

    override fun hashCode() : Int{
        return Objects.hash(id, name, region, words, miembros)
    }

    override fun toString(): String {
        return "Casa $name de la region $region. Lema: $words. Miembros destacados: $miembros"
    }
}