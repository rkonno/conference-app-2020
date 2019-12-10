package io.github.droidkaigi.confsched2020.model

@AndroidParcelize
data class Speaker(
    val id: SpeakerId,
    val name: String,
    val tagLine: String?,
    val bio: String?,
    val imageUrl: String?,
    val twitterUrl: String?,
    val githubUrl: String?,
    val blogUrl: String?,
    val companyUrl: String?
) : AndroidParcel
