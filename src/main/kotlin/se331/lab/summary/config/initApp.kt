package se331.lab.summary.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import se331.lab.summary.entity.AuctionItem
import se331.lab.summary.entity.Bids

import se331.lab.summary.repository.BidsRepository
import se331.lab.summary.repository.AuctionItemRepository
import javax.transaction.Transactional

@Component
class initApp : ApplicationListener<ApplicationReadyEvent>{
    @Autowired
    var auctionRepository : AuctionItemRepository? = null;

    @Autowired
    var bidsRepository : BidsRepository? = null

    @Transactional
    override fun onApplicationEvent(applicationReadyEvent: ApplicationReadyEvent) {
        var tempItem : AuctionItem

        var bid1 : Bids
        var bid2 : Bids
        var bid3 : Bids
        var bid4 : Bids
        var bid5 : Bids
    }

}