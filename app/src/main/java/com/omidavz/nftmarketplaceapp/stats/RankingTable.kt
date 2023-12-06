package com.omidavz.nftmarketplaceapp.stats

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omidavz.nftmarketplaceapp.Ranking
import com.omidavz.nftmarketplaceapp.rankings
import com.omidavz.nftmarketplaceapp.ui.theme.NftMarketplaceAppTheme

@Composable
fun RankingTable(rankings: List<Ranking>) {
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        itemsIndexed(rankings){index , ranking ->
            RankingRow(index = index,
                title = ranking.title,
                image = ranking.image,
                change = ranking.percentChange,
                eth = ranking.eth
            )

        }
    }
}

@Preview
@Composable
fun RankingTablePreview() {
    NftMarketplaceAppTheme {
        RankingTable(
            rankings = rankings
        )
    }
}