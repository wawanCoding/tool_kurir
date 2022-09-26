package com.bgwn.toolkurir.main

interface IMainContract {
    interface Chat{
        fun initView()
        fun onShowProgress()
        fun onHideProgress()
        fun onShowDialogSimpanKontak()
        fun onHideDialogSimpanKontak()
        fun changeMode()
        fun changeView()
    }

    interface Setting{
        fun initView()
        fun onShowProgress()
        fun onHideProgress()
        fun onEditMode()
        fun onSaveSetting()
    }

    interface Presenter{
        fun sendChat(number: String, cost: String)
        fun call(number: String)
        fun saveNumber(number: Number, name: String)
        fun getSharedPreferenceNumber()
        fun getSettingApp()
    }
}