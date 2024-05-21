package com.boxtime.praveen.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.boxtime.praveen.Modules.Task
import com.boxtime.praveen.R
import java.text.SimpleDateFormat
import java.util.*

class TaskRVVBListAdapter(
    private val isList: MutableLiveData<Boolean>,
    private val deleteUpdateCallback: (type: String, position: Int, task: Task) -> Unit,
) : ListAdapter<Task, RecyclerView.ViewHolder>(DiffCallback()) {

    companion object {
        private const val VIEW_TYPE_LIST = 0
        private const val VIEW_TYPE_GRID = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_GRID) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.view_task_grid_layout, parent, false)
            GridTaskViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.view_task_list_layout, parent, false)
            ListTaskViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val task = getItem(position)
        when (holder) {
            is ListTaskViewHolder -> holder.bind(task)
            is GridTaskViewHolder -> holder.bind(task)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (isList.value!!) VIEW_TYPE_LIST else VIEW_TYPE_GRID
    }

    inner class ListTaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(task: Task) {
            itemView.apply {
                // Find your views by ID and set the data
                findViewById<TextView>(R.id.titleTxt).text = task.title
                findViewById<TextView>(R.id.descrTxt).text = task.description
                findViewById<TextView>(R.id.dateTxt).text = SimpleDateFormat("dd-MMM-yyyy HH:mm:ss a", Locale.getDefault()).format(task.date)

                findViewById<View>(R.id.deleteImg).setOnClickListener {
                    if (adapterPosition != RecyclerView.NO_POSITION) {
                        deleteUpdateCallback.invoke("delete", adapterPosition, task)
                    }
                }

                findViewById<View>(R.id.editImg).setOnClickListener {
                    if (adapterPosition != RecyclerView.NO_POSITION) {
                        deleteUpdateCallback.invoke("update", adapterPosition, task)
                    }
                }
            }
        }
    }

    inner class GridTaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(task: Task) {
            itemView.apply {
                // Find your views by ID and set the data
                findViewById<TextView>(R.id.titleTxt).text = task.title
                findViewById<TextView>(R.id.descrTxt).text = task.description
                findViewById<TextView>(R.id.dateTxt).text = SimpleDateFormat("dd-MMM-yyyy HH:mm:ss a", Locale.getDefault()).format(task.date)

                findViewById<View>(R.id.deleteImg).setOnClickListener {
                    if (adapterPosition != RecyclerView.NO_POSITION) {
                        deleteUpdateCallback.invoke("delete", adapterPosition, task)
                    }
                }

                findViewById<View>(R.id.editImg).setOnClickListener {
                    if (adapterPosition != RecyclerView.NO_POSITION) {
                        deleteUpdateCallback.invoke("update", adapterPosition, task)
                    }
                }
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Task>() {
        override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean {
            return oldItem == newItem
        }
    }
}
