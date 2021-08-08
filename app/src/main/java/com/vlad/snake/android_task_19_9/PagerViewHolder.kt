package com.vlad.snake.android_task_19_9

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    //В этом методе мы передаем данные из PagerItem в нашу верстку item.xml
    fun onBind(item: PagerItem) {
        //корневой элемент item.xml
        itemView.container.setBackgroundColor(item.color)
        //Текстовое поле
        itemView.textView.text = item.text
    }
}