package club.guozengjie.jetpack

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class User {
    val firstName = ObservableField<String>()
    val lastName = ObservableField<String>()
    val age = ObservableInt()
}