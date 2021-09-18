package se331.lab.summary.entity.dto

import lombok.*
import se331.lab.summary.entity.Bids
import javax.persistence.*

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
class AuctionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    var itemID : Long = 0;
    var description : String? = null
    var type : String? = null
    var status : Boolean? = false

    @OneToOne(mappedBy = "bidsId")
    var winner : Bids? = null
}