package tech.skot.libraries.video

import tech.skot.core.components.SKComponentViewMock

class SKVideoViewMock(
    override val url: String,
    override val useCache: Boolean,
    override val onFullScreen:((fullScreen:Boolean)->Unit)?,
    playingInitial: Boolean,
    soundInitial: Boolean
) : SKComponentViewMock(), SKVideoVC {
    override var playing: Boolean = playingInitial
    override var sound: Boolean = soundInitial


    override fun setCurrentPosition(position: Long) {

    }

    override val currentPosition: Long?
        get() = null

    override fun onPause() {
    }

    override fun onResume() {
    }
}