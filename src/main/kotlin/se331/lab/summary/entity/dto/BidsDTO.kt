package se331.lab.summary.entity.dto

import lombok.Data
import lombok.Builder
import lombok.NoArgsConstructor
import lombok.AllArgsConstructor

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class BidsDTO {
    var bidsId : Long? = 0
    var amount : Double? = 0.0
    var datetime : String? = "2000-01-01"
    var bidsHistory : List<AuctionBidsHistoryDTO>? = null
}