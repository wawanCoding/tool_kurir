package com.bgwn.toolkurir.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bgwn.toolkurir.R

class FragmentSetting : Fragment(), IMainContract.Setting {

    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        arguments?.let {

        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
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

    override fun onEditMode() {
        TODO("Not yet implemented")
    }

    override fun onSaveSetting() {
        TODO("Not yet implemented")
    }
}