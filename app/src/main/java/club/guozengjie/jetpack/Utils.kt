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
            .load(imgUrl)
            .into(view)
    }
}