package com.mad.instagramclone.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = Black,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = White,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun InstagramCloneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    // Determine the color scheme based on the system theme and dynamic color settings
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            // Use dynamic color scheme if dynamicColor is true and system version is S or above
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        // Use predefined dark or light color scheme based on the system theme
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    val systemUiController = rememberSystemUiController()

    // Custom theme for the status bar color
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            if(darkTheme){
                // If the theme is dark, set the status bar color to a dark color
                window.statusBarColor = 0xFF212121.toInt()
                systemUiController.setSystemBarsColor(
                    color = Color(0xFF212121.toInt())
                )
                // Set the status bar icons to light for better visibility on dark background
                WindowCompat.getInsetsController(window, view)?.isAppearanceLightStatusBars = false
            }else{
                // If the theme is light, set the status bar color to white
                window.statusBarColor = Color.White.toArgb()
                systemUiController.setSystemBarsColor(
                    color = Color.White
                )
                // Set the status bar icons to dark for better visibility on light background
                WindowCompat.getInsetsController(window, view)?.isAppearanceLightStatusBars = true
            }
        }
    }

    // Apply the determined color scheme and typography to the MaterialTheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
