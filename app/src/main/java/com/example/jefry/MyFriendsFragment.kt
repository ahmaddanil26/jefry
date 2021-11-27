package com.example.jefry




import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(
            MyFriend("Jefry", "Laki-laki", "Jefry@gmail.com,"
                , "081234567890", "Nganjuk")
        )
        listTeman.add(
            MyFriend("prakoso", "Laki-laki", "jefry12@gmail.com",
                "081234567890", "Nganjuk")
        )
        listTeman.add(
            MyFriend("falah", "Laki-laki", "falah@gmail.com",
                "081234567890", "NGanjuk")
        )
        listTeman.add(
            MyFriend("salwa", "perempuan", "salwa@gmail.com",
                "081234567890", "malang")
        )
        listTeman.add(
            MyFriend("pakey", "Laki-laki", "jefry2@gmail.com",
                "081234567890", "nganjuk")
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}