package com.omidavz.nftmarketplaceapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    // body1
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    //bode2
    bodyMedium = TextStyle(
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    ),
    bodySmall = TextStyle(
        color = Color(235,235,245),
        textAlign = TextAlign.Center),

    // h1
    headlineLarge = TextStyle(
        color = Color.White,
        fontSize = 36.sp,
        fontWeight = FontWeight.Bold,
    ),
    // h2
    headlineMedium = TextStyle(
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        color = Color.White
    ),
    // h3
    headlineSmall = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.White,
        textAlign = TextAlign.Center
    ),
    // h4
    titleLarge = TextStyle(
        fontSize = 22.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
    ),
    // h5
    titleMedium = TextStyle(
        color = Color.White,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    ),
    // h6
    titleSmall = TextStyle(
        fontSize = 17.sp,
        color = Color.White,
        fontWeight = FontWeight.SemiBold
    ),
    // subtitle 1
    labelLarge = TextStyle(
        color = Color.White,
        fontWeight = FontWeight.SemiBold,
        fontSize = 13.sp,
        textAlign = TextAlign.Left
    ),
    // subtitle 2
    labelMedium = TextStyle(
        color = Color(235,235,245).copy(0.6f),
        fontSize = 13.sp,
        textAlign = TextAlign.Right
    ),
    // button
    labelSmall = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.SemiBold
    )








    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)