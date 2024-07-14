package model

import org.jetbrains.compose.resources.DrawableResource

data class UserInfo(
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val email: String,
    val phoneNumber:String,
    val pictureProfile: DrawableResource,
    val linkedinLink:String,
    val githubLink:String
) {
    val fullName: String
        get() = "$lastName $firstName"
}
