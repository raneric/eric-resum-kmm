package ui.uiComponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import myresume.composeapp.generated.resources.Res
import myresume.composeapp.generated.resources.rubik_light
import org.jetbrains.compose.resources.Font
import ui.theme.darkPrimaryBlue
import ui.theme.wheatFontColor
import ui.theme.navigationTypo
import ui.theme.primaryBlue

@Composable
fun NavigationBar(modifier: Modifier = Modifier) {
    val rubikRegular = Font(Res.font.rubik_light)
    Row(
        modifier = modifier.fillMaxWidth().background(navGradientColor),
        horizontalArrangement = Arrangement.End
    ) {
        link.forEach {
            TextButton(onClick = {}) {
                Text(
                    text = it,
                    style = navigationTypo.copy(
                        color = wheatFontColor,
                        fontFamily = FontFamily(rubikRegular)
                    )
                )
            }
        }
    }
}

val pattern = arrayOf(
    0.0f to darkPrimaryBlue,
    0.3f to primaryBlue,
    0.7f to primaryBlue,
    1f to darkPrimaryBlue
)
val navGradientColor = Brush.horizontalGradient(colorStops = pattern)

private val link = listOf("About me", "Experiences", "Personal project", "My Resume")