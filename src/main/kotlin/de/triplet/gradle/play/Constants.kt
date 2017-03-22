package de.triplet.gradle.play

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory

val APPLICATION_NAME = "gradle-play-publisher"
val PLAY_STORE_GROUP = "Play Store"

val JSON_FACTORY by lazy { JacksonFactory.getDefaultInstance() }
val HTTP_TRANSPORT by lazy { GoogleNetHttpTransport.newTrustedTransport() }

val TRACKS = listOf("alpha", "beta", "rollout", "production")

val MIME_TYPE_APK = "application/vnd.android.package-archive"
val MIME_TYPE_IMAGE = "image/*"

val LISTING_PATH = "listing/"
val RESOURCES_OUTPUT_PATH = "build/outputs/play"

val MAX_SCREENSHOTS_SIZE = 8

val MAX_CHARACTER_LENGTH_FOR_TITLE = 30
val MAX_CHARACTER_LENGTH_FOR_SHORT_DESCRIPTION = 80
val MAX_CHARACTER_LENGTH_FOR_FULL_DESCRIPTION = 4000
val MAX_CHARACTER_LENGTH_FOR_WHATS_NEW_TEXT = 500

val FILE_NAME_FOR_CONTACT_EMAIL = "contactEmail"
val FILE_NAME_FOR_CONTACT_PHONE = "contactPhone"
val FILE_NAME_FOR_CONTACT_WEBSITE = "contactWebsite"
val FILE_NAME_FOR_DEFAULT_LANGUAGE = "defaultLanguage"

val FILE_NAME_FOR_TITLE = "title"
val FILE_NAME_FOR_SHORT_DESCRIPTION = "shortdescription"
val FILE_NAME_FOR_FULL_DESCRIPTION = "fulldescription"
val FILE_NAME_FOR_VIDEO = "video"
val FILE_NAME_FOR_WHATS_NEW_TEXT = "whatsnew"

val IMAGE_TYPE_FEATURE_GRAPHIC = "featureGraphic"
val IMAGE_TYPE_ICON = "icon"
val IMAGE_TYPE_PHONE_SCREENSHOTS = "phoneScreenshots"
val IMAGE_TYPE_PROMO_GRAPHIC = "promoGraphic"
val IMAGE_TYPE_SEVEN_INCH_SCREENSHOTS = "sevenInchScreenshots"
val IMAGE_TYPE_TEN_INCH_SCREENSHOTS = "tenInchScreenshots"
val IMAGE_TYPE_TV_BANNER = "tvBanner"
val IMAGE_TYPE_TV_SCREENSHOTS = "tvScreenshots"
val IMAGE_TYPE_WEAR_SCREENSHOTS = "wearScreenshots"

val IMAGE_TYPES = arrayOf(
        IMAGE_TYPE_ICON,
        IMAGE_TYPE_FEATURE_GRAPHIC,
        IMAGE_TYPE_PHONE_SCREENSHOTS,
        IMAGE_TYPE_SEVEN_INCH_SCREENSHOTS,
        IMAGE_TYPE_TEN_INCH_SCREENSHOTS,
        IMAGE_TYPE_PROMO_GRAPHIC,
        IMAGE_TYPE_TV_BANNER,
        IMAGE_TYPE_TV_SCREENSHOTS,
        IMAGE_TYPE_WEAR_SCREENSHOTS
)

// region '419' is a special case in the play store that represents latin america
// 'fil' is a special case in the play store that represents Filipino
val LOCALE_REGEX = Regex("^(fil|[a-z]{2}(-([A-Z]{2}|419))?)\\z")
