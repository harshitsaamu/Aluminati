package aakashresearchlabs.org.aluminati.fragments.chatfragment

import aakashresearchlabs.org.aluminati.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ChatFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    companion object {
        fun newInstance(): ChatFragment {
            return ChatFragment()
        }

    }

}
