package ui.uiCore

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import model.UserInfo
import myresume.composeapp.generated.resources.*
import myresume.composeapp.generated.resources.Res
import myresume.composeapp.generated.resources.birthdate_svg
import myresume.composeapp.generated.resources.mail_svg
import myresume.composeapp.generated.resources.name_svg
import myresume.composeapp.generated.resources.phone_svg
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

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
