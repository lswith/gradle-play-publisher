package de.triplet.gradle.play

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory

internal val APPLICATION_NAME = "gradle-play-publisher"
internal val PLAY_STORE_GROUP = "Play Store"

internal val JSON_FACTORY by lazy { JacksonFactory.getDefaultInstance() }
internal val HTTP_TRANSPORT by lazy { GoogleNetHttpTransport.newTrustedTransport() }

internal val TRACKS = listOf("alpha", "beta", "rollout", "production")

internal val MIME_TYPE_APK = "application/vnd.android.package-archive"
internal val MIME_TYPE_IMAGE = "image/*"

internal val LISTING_PATH = "listing/"
internal val RESOURCES_OUTPUT_PATH = "build/outputs/play"

internal val MAX_SCREENSHOTS_SIZE = 8

internal val MAX_CHARACTER_LENGTH_FOR_TITLE = 30
internal val MAX_CHARACTER_LENGTH_FOR_SHORT_DESCRIPTION = 80
internal val MAX_CHARACTER_LENGTH_FOR_FULL_DESCRIPTION = 4000
internal val MAX_CHARACTER_LENGTH_FOR_WHATS_NEW_TEXT = 500

internal val FILE_NAME_FOR_CONTACT_EMAIL = "contactEmail"
internal val FILE_NAME_FOR_CONTACT_PHONE = "contactPhone"
internal val FILE_NAME_FOR_CONTACT_WEBSITE = "contactWebsite"
internal val FILE_NAME_FOR_DEFAULT_LANGUAGE = "defaultLanguage"

internal val FILE_NAME_FOR_TITLE = "title"
internal val FILE_NAME_FOR_SHORT_DESCRIPTION = "shortdescription"
internal val FILE_NAME_FOR_FULL_DESCRIPTION = "fulldescription"
internal val FILE_NAME_FOR_VIDEO = "video"
internal val FILE_NAME_FOR_WHATS_NEW_TEXT = "whatsnew"

internal val IMAGE_TYPE_FEATURE_GRAPHIC = "featureGraphic"
internal val IMAGE_TYPE_ICON = "icon"
internal val IMAGE_TYPE_PHONE_SCREENSHOTS = "phoneScreenshots"
internal val IMAGE_TYPE_PROMO_GRAPHIC = "promoGraphic"
internal val IMAGE_TYPE_SEVEN_INCH_SCREENSHOTS = "sevenInchScreenshots"
internal val IMAGE_TYPE_TEN_INCH_SCREENSHOTS = "tenInchScreenshots"
internal val IMAGE_TYPE_TV_BANNER = "tvBanner"
internal val IMAGE_TYPE_TV_SCREENSHOTS = "tvScreenshots"
internal val IMAGE_TYPE_WEAR_SCREENSHOTS = "wearScreenshots"

internal val IMAGE_TYPES = arrayOf(
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
internal val LOCALE_REGEX = Regex("^(fil|[a-z]{2}(-([A-Z]{2}|419))?)\\z")
