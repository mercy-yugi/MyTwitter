package com.yugi.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.yugi.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


   displayTweets()

    }
    fun displayTweets(){
        var tweet1=Tweets("Mercy YUgi","@mercy_achy","10/10/2020","#AKIRACHIX","30DaysOfCode","My day today was very interesting. Igot to  learn how to use recycler views and card views. It was a very fun exercise. kOTLIN IS EVERYTHING TO ME","1000","2000","3000","10")
        var tweet2=Tweets("Mercy Kirigo","@mercy_achy","10/10/2020","#AKIRACHIX","30DaysOfCode","My day today was very interesting. Igot to  learn how to use recycler views and card views. It was a very fun exercise. kOTLIN IS EVERYTHING TO ME","1000","2000","3000","10")
        var tweet3=Tweets("Mercy Chepchichir","@mercy_achy","10/10/2020","#AKIRACHIX","30DaysOfCode","My day today was very interesting. Igot to  learn how to use recycler views and card views. It was a very fun exercise. kOTLIN IS EVERYTHING TO ME","1000","2000","3000","10")
        var tweet4=Tweets("Mercy Wacera","@mercy_achy","10/10/2020","#AKIRACHIX","30DaysOfCode","My day today was very interesting. Igot to  learn how to use recycler views and card views. It was a very fun exercise. kOTLIN IS EVERYTHING TO ME","1000","2000","3000","10")
        var tweet5=Tweets("Mercy Naliaka","@mercy_achy","10/10/2020","#AKIRACHIX","30DaysOfCode","My day today was very interesting. Igot to  learn how to use recycler views and card views. It was a very fun exercise. kOTLIN IS EVERYTHING TO ME","1000","2000","3000","10")
        var tweet6=Tweets("Mercy Nyagechi","@mercy_achy","10/10/2020","#AKIRACHIX","30DaysOfCode","My day today was very interesting. Igot to  learn how to use recycler views and card views. It was a very fun exercise. kOTLIN IS EVERYTHING TO ME","1000","2000","3000","10")

        var tweetList=listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6)
        var twitterAdapter=TweeterRvAdapter(tweetList)
        binding.rvTwitter.layoutManager=LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter
    }
}