package data

import model.UserInfo
import myresume.composeapp.generated.resources.Res
import myresume.composeapp.generated.resources.photo_profile

val myInfo = UserInfo(
    firstName = "Eric Eugène",
    lastName = "RANDRIANARISOA",
    birthDate = "23-08-1989",
    phoneNumber = "034 01 542 02",
    email = "raneric@gmail.com",
    pictureProfile = Res.drawable.photo_profile,
    linkedinLink = "https://www.linkedin.com/in/eric-eug%C3%A8ne-randrianarisoa-a853696a/",
    githubLink = "https://github.com/raneric"
)