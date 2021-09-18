package se331.lab.summary.entity

import lombok.*
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

    @OneToMany(mappedBy = "bidedItem")
    var bidsList : List<Bids>? = null

    @OneToOne(mappedBy = "bidsId")
    var successfulBids : Bids? = null
}