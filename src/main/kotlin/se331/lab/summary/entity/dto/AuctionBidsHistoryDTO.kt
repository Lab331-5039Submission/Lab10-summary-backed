package se331.lab.summary.entity.dto

import lombok.Data
import lombok.Builder
import lombok.NoArgsConstructor
import lombok.AllArgsConstructor

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class AuctionBidsHistoryDTO {
    var itemID : Long = 0;
    var description : String? = null
    var type : String? = null
}