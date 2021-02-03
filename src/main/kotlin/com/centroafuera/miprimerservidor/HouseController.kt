package com.centroafuera.miprimerservidor

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HouseController (private val houseRepository: HouseRepository) {

    @GetMapping("/houses")
    fun getAllHouses() : List<House>{
        return houseRepository.findAll()
    }

    @GetMapping("/house/{id}")
    fun getHouse(@PathVariable id : Long) : House{
        return houseRepository.findById(id).get()
    }


}