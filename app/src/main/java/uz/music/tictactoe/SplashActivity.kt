package uz.music.tictactoe

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*
import maes.tech.intentanim.CustomIntent.customType

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()



        animation.addAnimatorListener(object :Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {

            }

            override fun onAnimationEnd(p0: Animator?) {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                customType(this@SplashActivity,"bottom-to-up");
                /*var intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)*/
            }

            override fun onAnimationCancel(p0: Animator?) {

            }

            override fun onAnimationRepeat(p0: Animator?) {

            }
        })

/*
        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        imageViewLogo.startAnimation(anim)

        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }, 1000)*/


    }
}