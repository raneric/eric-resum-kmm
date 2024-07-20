package data

import model.SkillData
import model.UserInfo
import myresume.composeapp.generated.resources.*

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

val mobileSkills = SkillData(
    tittle = "Mobile",
    skills = mapOf(
        "Android" to Res.drawable.android,
        "JetpackCompose" to Res.drawable.compose
    )
)

val programmingLanguage = SkillData(
    tittle = "Programming Language",
    skills = mapOf(
        "Kotlin" to Res.drawable.kotlin,
        "Java" to Res.drawable.java,
        "JavaScript" to Res.drawable.js
    )
)

val web = SkillData(
    tittle = "Front-End",
    skills = mapOf(
        "React.js" to Res.drawable.react,
        "Html" to Res.drawable.html5,
        "CSS3" to Res.drawable.css3
    )
)

val techSkills = listOf(programmingLanguage, mobileSkills, web)
