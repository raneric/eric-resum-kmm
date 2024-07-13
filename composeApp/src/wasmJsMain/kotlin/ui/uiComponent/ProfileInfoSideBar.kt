package ui.uiComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import myresume.composeapp.generated.resources.Res
import myresume.composeapp.generated.resources.photo_profile
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProfileInfoSideBar(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxHeight()
            .width(300.dp)
            .offset(y = 4.dp),
        shape = MaterialTheme.shapes.small,
        elevation = 3.dp
    ) {
        Column(
            modifier = Modifier.padding(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfilePicture()
        }
    }
}

@Composable
fun ProfilePicture(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(190.dp).clip(CircleShape),
        painter = painterResource(Res.drawable.photo_profile),
        contentDescription = ""
    )
}