package com.mobilebreakero.domain.utils

import kotlin.Exception

sealed class ResponseState<out R> {
    data class Success<out T>(val data: T) : ResponseState<T>()
    data class Error(val exception: Exception) : ResponseState<Nothing>()
    data object Loading : ResponseState<Nothing>()
    data object Idle : ResponseState<Nothing>()
}