package ui.uiComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import model.UserInfo
import myresume.composeapp.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProfileInfoSideBar(
    userInfo: UserInfo,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxHeight()
            .width(300.dp)
            .offset(y = 4.dp),
        shape = MaterialTheme.shapes.small
    ) {
        Column(
            modifier = Modifier.padding(
                top = 16.dp,
                start = 8.dp,
                end = 8.dp
            ),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfilePicture(userInfo.pictureProfile)
            UserDetails(userInfo)
        }
    }
}

@Composable
fun ProfilePicture(
    picture: DrawableResource,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier.size(190.dp).clip(CircleShape),
        painter = painterResource(picture),
        contentDescription = ""
    )
}

@Composable
fun UserDetails(
    userInfo: UserInfo,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth(), elevation = 4.dp) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.Start
        ) {
            UserDetailsItem(
                icon = painterResource(Res.drawable.name_svg),
                text = userInfo.fullName
            )
            UserDetailsItem(
                icon = painterResource(Res.drawable.birthdate_svg),
                text = userInfo.birthDate
            )
            UserDetailsItem(
                icon = painterResource(Res.drawable.phone_svg),
                text = userInfo.phoneNumber
            )
            UserDetailsItem(
                icon = painterResource(Res.drawable.mail_svg),
                text = userInfo.email
            )
        }
    }
}

@Composable
fun UserDetailsItem(
    icon: Painter,
    text: String,
    modifier: Modifier = Modifier
) {
    val rubikRegular = Font(Res.font.rubik_light)
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(16.dp),
            painter = icon,
            contentDescription = null
        )
        Text(
            text = text,
            style = MaterialTheme.typography.body2.copy(
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily(rubikRegular)
            )
        )
    }
}

