package se331.lab.summary.entity.dto

import lombok.Data
import lombok.Builder
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class AuctionItemDTO {
    var itemID : Long = 0;
    var description : String? = null
    var type : String? = null
    var status : Boolean? = false

    var winner : AuctionBidsDTO? = null
}