package club.guozengjie.jetpack

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat

object Utils {
    @BindingConversion
    @JvmStatic
    fun convertBoolean(date: Boolean): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        return sdf.format(date)
    }

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(view: ImageView, imgUrl: String) {
        Glide.with(view)
            .load("https://upload.jianshu.io/users/upload_avatars/6854876/aa73746f-9296-43a1-996e-609df65b1392?imageMogr2/auto-orient/strip|imageView2/1/w/240/h/240")
            .into(view)
    }
}