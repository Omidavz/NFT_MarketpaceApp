package com.omidavz.nftmarketplaceapp.onboarding

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.omidavz.nftmarketplaceapp.R
import com.omidavz.nftmarketplaceapp.ui.theme.NftMarketplaceAppTheme
import com.omidavz.nftmarketplaceapp.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OnboardingScreen(
    navigateAction : () -> Unit
) {

    Scaffold {
        Box {
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(id = R.drawable.bg1),
                contentDescription = "Background Image",
                contentScale = ContentScale.Crop

            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 32.dp, vertical = 80.dp)
                    .fillMaxSize()
            ) {
                Column(
                ) {
                    Text(
                        text = "Welcome to NFT",
                        style = Typography.headlineLarge

                        )
                    Text(
                        text = "Marketplace",
                        style = Typography.headlineLarge


                        )
                }


                Spacer(
                    modifier = Modifier
                        .fillMaxHeight(0.58f)
                )




                Card(
                    elevation = CardDefaults.cardElevation(4.dp),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color.White.copy(0.1f),
                            shape = RoundedCornerShape(27.dp)
                        )
                        .clip(RoundedCornerShape(27.dp))
                ) {
                    Surface() {
                        Image(
                            painter = painterResource(id = R.drawable.cardblur),
                            contentDescription = "Card Background ",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop,
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(27.dp)
                        ) {
                            Text(
                                text = "Explore and Mint NFTs",
                                style = Typography.bodyMedium
                            )
                            Text(
                                text = "You can buy and sell the NFTs of the best artists in the world",
                                style = Typography.bodySmall
                            )
                            Spacer(modifier = Modifier.padding(bottom = 27.dp))
                            Button(
                                onClick = navigateAction,
                                modifier = Modifier,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(151, 169, 246, alpha = 0x32),
                                    contentColor = Color.White
                                )

                            ) {
                                Text(
                                    text = "Get started now",
                                    modifier = Modifier.padding(
                                        horizontal = 40.dp,
                                        vertical = 4.dp
                                    ),
                                    style = Typography.labelSmall
                                )
                            }


                        }
                    }
                }
            }
        }

    }
}


@Preview
@Composable
fun CardPreview() {
    NftMarketplaceAppTheme {
        OnboardingScreen {

        }
    }
}

