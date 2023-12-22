package com.mad.instagramclone.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mad.instagramclone.R

// Define a custom font family named "lobster"
val lobster = FontFamily(
    // Add a thin weight font to the family
    Font(R.font.lobster_custom, FontWeight.Thin),
    // Add a bold weight font to the family
    Font(R.font.lobster_custom, FontWeight.Bold),
    // Add a medium weight font to the family
    Font(R.font.lobster_custom, FontWeight.Medium),
    // Add a semi-bold weight font to the family
    Font(R.font.lobster_custom, FontWeight.SemiBold),
    // Add a normal weight font to the family
    Font(R.font.lobster_custom, FontWeight.Normal)
)


//Default fonts for our app
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
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