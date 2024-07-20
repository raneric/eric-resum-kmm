package ui.uiCore

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProfilePicture(
    picture: DrawableResource,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier.size(160.dp).clip(CircleShape),
        painter = painterResource(picture),
        contentDescription = ""
    )
}
