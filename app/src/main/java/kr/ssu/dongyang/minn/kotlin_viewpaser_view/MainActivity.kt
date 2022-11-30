package kr.ssu.dongyang.minn.kotlin_viewpaser_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kr.ssu.dongyang.minn.kotlin_viewpaser_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val texList = listOf<String>("Spring", "Summer", "Fall", "Winter")
        val customAdapter = CustomPagerAdapter()
        customAdapter.textList = texList
        binding.viewPaser.adapter = customAdapter

        val tabTitles = listOf<String>("봄", "여름", "가을", "겨울")
        TabLayoutMediator(binding.tabLayout, binding.viewPaser){tab, position ->
            tab.text = tabTitles[position]
        }.attach()

    }
}