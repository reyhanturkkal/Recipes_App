package com.example.recipesapp

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.bumptech.glide.Glide
import com.example.recipesapp.databinding.ActivityRecipeBinding

class RecipeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeBinding
    var imgCrop=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).load(intent.getStringExtra("img")).into(binding.itemImage)
        binding.tittle.text=intent.getStringExtra("tittle")
        binding.stepData.text=intent.getStringExtra("des")
        binding.stepData.setTextAppearance(R.style.TextViewStyle)
        var ing =intent.getStringExtra("ing")?.split("\n".toRegex())?.dropLastWhile { it.isEmpty() }?.toTypedArray()
        binding.time.text=ing?.get(0)
        binding.ingData.text= "${binding.ingData.text} \n ${ing?.get(1)}".trimIndent()
        binding.ingData.setTextAppearance(R.style.TextViewStyle)
        for(i in 2 until  ing!!.size-1 ){
            binding.ingData.text=
                "${binding.ingData.text} \n🟢 ${ing[i]}".trimIndent()
        }

        binding.step.background=null
        binding.step.setTextAppearance(R.style.TextViewStyle)

        binding.step.setOnClickListener {

            binding.step.setTextAppearance(R.style.TextViewStyle)
            binding.ing.setTextAppearance(R.style.TextViewStyle)

            binding.step.setBackgroundResource(R.drawable.btn_ing)
            binding.ing.background=null
            binding.stepScroll.visibility=View.VISIBLE
            binding.ingScroll.visibility=View.GONE
        }

        binding.ing.setOnClickListener {
            binding.ing.setTextAppearance(R.style.TextViewStyle)
            binding.step.setTextAppearance(R.style.TextViewStyle)

            binding.ing.setBackgroundResource(R.drawable.btn_ing)
            binding.step.background=null
            binding.ingScroll.visibility=View.VISIBLE
            binding.stepScroll.visibility=View.GONE
        }

        binding.fullScreen.setOnClickListener {

            if (imgCrop){
                binding.itemImage.scaleType=ImageView.ScaleType.FIT_CENTER
                Glide.with(this).load(intent.getStringExtra("img")).into(binding.itemImage)
                binding.fullScreen.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP)
                binding.shade.visibility= View.GONE
                imgCrop=!imgCrop
            }else{
                binding.itemImage.scaleType=ImageView.ScaleType.CENTER_CROP
                Glide.with(this).load(intent.getStringExtra("img")).into(binding.itemImage)
                binding.fullScreen.setColorFilter(null)
                binding.shade.visibility= View.GONE
                imgCrop=!imgCrop
            }
        }
    binding.backBtn.setOnClickListener {
        finish()
    }
    }
}