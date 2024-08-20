package com.ngen.ecom.utils

import android.app.Activity
import android.content.ContentResolver
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.ParcelFileDescriptor
import android.provider.OpenableColumns
import android.webkit.MimeTypeMap
import java.io.File
import java.io.FileDescriptor
import java.io.IOException

object ImageUri {
    @Throws(IOException::class)
    fun getBitmapFromUri(activity: Activity, uri: Uri): Bitmap {
        val contentResolver = activity.contentResolver

        val takeFlags: Int = Intent.FLAG_GRANT_READ_URI_PERMISSION or
                Intent.FLAG_GRANT_WRITE_URI_PERMISSION
        // Check for the freshest data.
        contentResolver.takePersistableUriPermission(uri, takeFlags)

        //getting bitmap from URI
        val parcelFileDescriptor: ParcelFileDescriptor =
            contentResolver.openFileDescriptor(uri, "r")!!
        val fileDescriptor: FileDescriptor = parcelFileDescriptor.fileDescriptor
        val image: Bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor)
        parcelFileDescriptor.close()
        return image
    }

    fun getMimeType(activity: Activity, uri: Uri): String? {
        //Check uri format to avoid null
        val extension: String? = if (uri.scheme == ContentResolver.SCHEME_CONTENT) {
            //If scheme is a content
            val mime = MimeTypeMap.getSingleton()
            mime.getExtensionFromMimeType(activity.contentResolver.getType(uri))
        } else {
            //If scheme is a File
            //This will replace white spaces with %20 and also other special characters. This will avoid returning null values on file name with spaces and special characters.
            MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(uri.path?.let { File(it) }).toString())
        }
        return extension
    }

    fun getFileName(contentResolver: ContentResolver, selectedImageUri: Uri): String {
        var name = ""
        val returnCursor = contentResolver.query(selectedImageUri, null, null, null, null)
        if (returnCursor != null) {
            val nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            returnCursor.moveToFirst()
            name = returnCursor.getString(nameIndex)
            returnCursor.close()
        }

        return name
    }
}