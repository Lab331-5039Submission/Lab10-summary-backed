package se331.lab.summary.repository

import org.springframework.data.jpa.repository.JpaRepository
import se331.lab.summary.entity.Bids

interface BidsRepository : JpaRepository<Bids,Long> {
    override fun findAll(): List<Bids>
}