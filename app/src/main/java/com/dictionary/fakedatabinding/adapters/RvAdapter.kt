package com.dictionary.fakedatabinding.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.dictionary.fakedatabinding.R
import com.dictionary.fakedatabinding.model.Person
import com.dictionary.fakedatabinding.databinding.SingleItemBinding

class RvAdapter(list:ArrayList<Person>) : RecyclerView.Adapter<RvAdapter.RvViewHolder>(){

    val listOfPerson  = list

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RvViewHolder {
        val binding = DataBindingUtil.inflate<SingleItemBinding>(
            LayoutInflater.from(p0.context), R.layout.single_item,p0,false
        )
        return RvViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listOfPerson.size
    }

    override fun onBindViewHolder(p0: RvViewHolder, p1: Int) {
        p0.binding.person = listOfPerson[p1]
    }

    class RvViewHolder(item: SingleItemBinding) : RecyclerView.ViewHolder(item.root){
        val binding:SingleItemBinding = item
    }
}