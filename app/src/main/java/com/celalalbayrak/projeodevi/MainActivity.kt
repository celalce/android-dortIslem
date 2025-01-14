package com.celalalbayrak.projeodevi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.celalalbayrak.projeodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
/*** burada iki sayı değişkeni oluşturuluyor ve Double olarak yapıldı.. */

    var number1 : Double? = null 
    var number2 : Double? = null
    var sonuc : Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }






    }

//bakalım bu yorum toplama fonksiyonudur. yeni bir yorumdur.
    fun toplama(view: View) {
    number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null) {
            sonuc= number1!! + number2!!
            binding.textView.text = sonuc.toString()
        }else{
            binding.textView.text = "Sonuc : "
        }


    }
//bu bir bölme fonksiyonudur. yeni bir yorum yapıyorum. ve yeni bir yorum daha 

    fun bolme(view: View) {
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (number1 != null && number2 != null) {
            sonuc = number1!! / number2!!
            binding.textView.text = sonuc.toString()
        }else{
            binding.textView.text = "Sonuc : "
        }

    }
    
    
    //yeni bir çarpma fonksiyonu yorumu 
    fun carpma(view: View) {
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (number1 != null && number2 != null) {
            sonuc = number1!! * number2!!

            binding.textView.text = sonuc.toString()
        }else{
            binding.textView.text = "Sonuc : "
        }

    }fun cikarma(view: View) {
    number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (number1 != null && number2 != null) {
            sonuc = number1!! - number2!!
            binding.textView.text = sonuc.toString()
        }else{
            binding.textView.text = "Sonuc : "
        }
    }




}