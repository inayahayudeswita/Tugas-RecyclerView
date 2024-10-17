package com.pam.recyclerviewsample
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pam.recyclerviewsample.ItemsViewModel


class CustomAdapter(private val mList:List<ItemsViewModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)


        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]


        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(ItemsViewModel.image)


        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.text
        holder.subjudul.text = ItemsViewModel.subjudul
        holder.gambar.setImageResource(ItemsViewModel.image)

    }


    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
        //        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val subjudul: TextView = itemView.findViewById(R.id.subjudul)
        val gambar: ImageView = itemView.findViewById(R.id.gambar)
    }
}
