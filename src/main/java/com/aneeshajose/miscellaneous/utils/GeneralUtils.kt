package com.aneeshajose.miscellaneous.utils

import java.math.BigInteger
import java.util.*
import java.util.Collections.emptyList

fun <T> convertCollectionOfListsToSingularLists(collections: Collection<List<T>>?): List<T> {
    return collections?.flatten() ?: emptyList()
}

fun <T> singleElementAsArrayList(item: T?): ArrayList<T> {
    return if (item == null) arrayListOf() else arrayListOf(item)
}

fun isAlphabetsOnly(string: String?): Boolean {
    return string?.all { it.isLetter() } ?: false
}



fun getType(c: Class<*>): Int {
    return BigInteger(c.simpleName.toByteArray()).toInt() + c.simpleName.hashCode() * 31
}


fun isListNullOrEmpty(list: List<*>?): Boolean {
    return list.isNullOrEmpty()
}

fun getFileExtension(fileName: String?): String {
    return fileName?.substringAfterLast(".") ?: ""
}