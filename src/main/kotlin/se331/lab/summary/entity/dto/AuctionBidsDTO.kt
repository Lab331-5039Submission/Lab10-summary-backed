package se331.lab.summary.entity.dto

import lombok.Data
import lombok.Builder
import lombok.NoArgsConstructor
import lombok.AllArgsConstructor

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class AuctionBidsDTO {
    var bidsId : Long? = 0
}