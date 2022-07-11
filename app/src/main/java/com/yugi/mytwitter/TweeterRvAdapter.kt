package com.yugi.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweeterRvAdapter (var tweeterList: List<Tweets>):
     RecyclerView.Adapter<TweeterViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweeterViewHolder {
          var itemView= LayoutInflater.from(parent.context)
               .inflate(R.layout.tweet_list_item1,parent,false)
          return TweeterViewHolder(itemView)
     }

     override fun onBindViewHolder(holder: TweeterViewHolder, position: Int) {
          var currentTweets=tweeterList.get(position)
          holder.tvName.text=currentTweets.name
          holder.tvNickname.text=currentTweets.Nickname
          holder.tvDate.text=currentTweets.Date
          holder.tvAkirachix.text=currentTweets.Akirachix
          holder.tvChallenge.text=currentTweets.Challenge
          holder.tvDescribe.text=currentTweets.Describe
          holder.tvComment.text=currentTweets.Comment
          holder.tvRetweet.text=currentTweets.Retweet
          holder.tvLike.text=currentTweets.Like



     }

     override fun getItemCount(): Int {
          return  6
     }
}

class TweeterViewHolder(itemView: View):
RecyclerView.ViewHolder(itemView){
     var imgImage1=itemView.findViewById<ImageView>(R.id.imgImage1)
     var tvName=itemView.findViewById<TextView>(R.id.tvName)
     var tvNickname=itemView.findViewById<TextView>(R.id.tvNickname)
     var imgVerified=itemView.findViewById<ImageView>(R.id.imgVerified)
     var tvDate=itemView.findViewById<TextView>(R.id.tvDate)
     var tvAkirachix=itemView.findViewById<TextView>(R.id.tvAkirachix)
     var tvChallenge=itemView.findViewById<TextView>(R.id.tvChallenge)
     var tvDescribe=itemView.findViewById<TextView>(R.id.tvDescribe)
     var imgComment=itemView.findViewById<ImageView>(R.id.imgComment)
     var tvComment=itemView.findViewById<TextView>(R.id.tvComment)
     var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
     var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)
     var imgLike=itemView.findViewById<ImageView>(R.id.imgLike)
     var tvLike=itemView.findViewById<TextView>(R.id.tvLike)
     var imgDownload=itemView.findViewById<ImageView>(R.id.imgDownload)

}
