package ui.uiComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp
import myresume.composeapp.generated.resources.*
import org.jetbrains.compose.resources.painterResource
import ui.theme.primaryBlue

@Composable
fun SocialNetworkBar(modifier: Modifier = Modifier) {
    val iconSize = 26.dp
    Column(
        modifier = modifier
            .fillMaxHeight()
            .drawBehind {
                drawLine(
                    strokeWidth = 0.2f,
                    color = primaryBlue,
                    start = Offset(size.width, 0f),
                    end = Offset(size.width, size.height)
                )
            }
            .padding(
                vertical = 16.dp
            ),
        verticalArrangement = Arrangement.Bottom
    ) {
        IconButton(onClick = {}) {
            Image(
                modifier = Modifier.size(iconSize),
                painter = painterResource(Res.drawable.github),
                contentDescription = ""
            )
        }
        IconButton(onClick = {}) {
            Image(
                modifier = Modifier.size(iconSize),
                painter = painterResource(Res.drawable.gitlab),
                contentDescription = ""
            )
        }
        IconButton(onClick = {}) {
            Image(
                modifier = Modifier.size(iconSize),
                painter = painterResource(Res.drawable.linkdin),
                contentDescription = ""
            )
        }
        IconButton(onClick = {}) {
            Image(
                modifier = Modifier.size(iconSize),
                painter = painterResource(Res.drawable.stackoverflow),
                contentDescription = ""
            )
        }
    }
}

