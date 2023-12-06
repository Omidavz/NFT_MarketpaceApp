package com.omidavz.nftmarketplaceapp.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omidavz.nftmarketplaceapp.collections
import com.omidavz.nftmarketplaceapp.nfts
import com.omidavz.nftmarketplaceapp.ui.theme.NftMarketplaceAppTheme

@Composable
fun NFTList() {
    LazyRow(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 30.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(nfts){ nft ->
            NFTCard(
                title = nft.title ,
                subtitle = nft.subtitle,
                image = painterResource(id = nft.image),
                likes = nft.likes,
                eth = nft.eth
            )
        }
    }
}

@Preview
@Composable
fun NFTListPreview() {
    NftMarketplaceAppTheme {
        NFTList()
    }
}