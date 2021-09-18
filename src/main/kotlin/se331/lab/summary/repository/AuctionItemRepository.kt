package se331.lab.summary.repository

import org.springframework.data.jpa.repository.JpaRepository
import se331.lab.summary.entity.AuctionItem

interface AuctionItemRepository : JpaRepository<AuctionItem,Long> {
    override fun findAll() : List<AuctionItem>
}