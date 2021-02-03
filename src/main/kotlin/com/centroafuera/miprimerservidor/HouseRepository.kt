package com.centroafuera.miprimerservidor

import org.springframework.data.jpa.repository.JpaRepository

interface HouseRepository : JpaRepository<House, Long>

