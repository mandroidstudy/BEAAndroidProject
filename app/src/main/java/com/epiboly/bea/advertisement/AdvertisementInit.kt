package com.epiboly.bea.advertisement

import android.app.Application
import com.epiboly.bea.rich.R
import com.ifmvo.togetherad.csj.TogetherAdCsj
import kotlin.random.Random

/**
 * @author mao
 * @time 2022/12/25
 * @describe
 */
class AdvertisementInit {
    companion object{
        @JvmStatic
        fun initAd(context:Application){
            //初始化穿山甲
            TogetherAdCsj.init(context = context, adProviderType = AdProviderType.CSJ.type, csjAdAppId = "5358164", appName = context.getString(
                R.string.app_name))
            //初始化广点通
//            TogetherAdGdt.init(context = context, adProviderType = AdProviderType.GDT.type, gdtAdAppId = "1201369644")

            //950758827
            val asList = listOf("951570314", "951570316", "950758827","951570356")
            val random = Random(System.currentTimeMillis());
            val index = (0..3).random(random)
            val rewardId :String= asList[index]
            TogetherAdCsj.idMapCsj = mutableMapOf(
                TogetherAdAlias.AD_SPLASH to "888050848",
                TogetherAdAlias.AD_REWARD to rewardId

            )

//            TogetherAdGdt.idMapGDT = mutableMapOf(
//                TogetherAdAlias.AD_SPLASH to "8024566207295469",
//                TogetherAdAlias.AD_REWARD to "5094367207170546"
//            )
        }
    }
}