package se331.lab.summary.entity

import lombok.*
import se331.lab.summary.entity.dto.AuctionItem
import javax.persistence.*

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
class Bids {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    var bidsId : Long? = 0
    var amount : Double? = 0.0
    var datetime : String? = "2000-01-01"

    @OneToMany
    var bideditem : List<AuctionItem>? = null
}