package com.omidavz.nftmarketplaceapp.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.omidavz.nftmarketplaceapp.ui.theme.NftMarketplaceAppTheme
import com.omidavz.nftmarketplaceapp.ui.theme.Typography

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier
            .padding(bottom = 35.dp),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "NFT Marketplace",
                        style = Typography.headlineMedium
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color.White
                )
            )

        },

        containerColor = Color(33, 17, 52)
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 50.dp)
                .verticalScroll(rememberScrollState())
        ) {
            CategoryList()
            Text(
                text = "Trending Collections",
                style = Typography.titleMedium
            )

            CollectionList()

            Text(
                text = "Top seller",
                style = Typography.titleMedium
            )
            NFTList()
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    NftMarketplaceAppTheme {
        HomeScreen()
    }

}