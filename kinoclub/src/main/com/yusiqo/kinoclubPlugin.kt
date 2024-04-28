package com.yusiqo

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class FullHDFilmizlesenePlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(FullHDFilmizlesene())
        registerExtractorAPI(RapidVid())
        registerExtractorAPI(TRsTX())
        registerExtractorAPI(VidMoxy())
    }
}
