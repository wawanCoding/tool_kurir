package com.bgwn.toolkurir.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bgwn.toolkurir.R


class FragmentChat : Fragment(), IMainContract.Chat {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentChat().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun onShowProgress() {
        TODO("Not yet implemented")
    }

    override fun onHideProgress() {
        TODO("Not yet implemented")
    }

    override fun onShowDialogSimpanKontak() {
        TODO("Not yet implemented")
    }

    override fun onHideDialogSimpanKontak() {
        TODO("Not yet implemented")
    }

    override fun changeMode() {
        TODO("Not yet implemented")
    }

    override fun changeView() {
        TODO("Not yet implemented")
    }
}