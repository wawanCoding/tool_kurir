package com.bgwn.toolkurir.main

class MainPresenter(private var iChatView :IMainContract.Chat, var iSettingView :IMainContract.Setting) : IMainContract.Presenter {


    override fun sendChat(number: String, cost: String) {
        iChatView
    }

    override fun call(number: String) {

    }

    override fun saveNumber(number: Number, name: String) {

    }


    override fun getSharedPreferenceNumber() {

    }

    fun getChatText() {

    }

    override fun getSettingApp() {
        iSettingView.onSaveSetting()
    }
}