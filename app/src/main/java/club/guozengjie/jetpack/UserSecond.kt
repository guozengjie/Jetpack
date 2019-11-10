package club.guozengjie.jetpack

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class UserSecond : BaseObservable() {
    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.firstName)
        }
    @get:Bindable
    var lastName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.lastName)
        }
}