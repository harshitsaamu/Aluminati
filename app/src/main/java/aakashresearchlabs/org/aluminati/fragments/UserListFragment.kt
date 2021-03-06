package aakashresearchlabs.org.aluminati.fragments

import aakashresearchlabs.org.aluminati.R
import aakashresearchlabs.org.aluminati.models.User
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_alumni_list.*

class UserListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_alumni_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val alumni = ArrayList<User>()
        val adapter = AlumniAdapter(alumni)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        alumni_list.layoutManager = layoutManager
        alumni_list.adapter = adapter
    }

    companion object {
        fun newInstance(): UserListFragment {
            return UserListFragment()
        }
    }
}

private class AlumniAdapter(private val userList: ArrayList<User>) : RecyclerView.Adapter<UserHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val alumItem = LayoutInflater.from(parent.context).inflate(R.layout.alum_item, parent, false) as LinearLayout
        return UserHolder(alumItem)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.populateHolder(userList[position])
    }
}

private class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // private val alumImage: ImageView = itemView.findViewById(R.id.alum_image)
    private val name: TextView = itemView.findViewById(R.id.alum_name)

    fun populateHolder(user: User) {
        name.text = user.name
    }
}