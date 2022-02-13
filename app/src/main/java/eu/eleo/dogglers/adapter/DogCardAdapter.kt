/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package eu.eleo.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import eu.eleo.dogglers.R
import eu.eleo.dogglers.data.DataSource


class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    private val data = DataSource.dogs

    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {

        val dogName: TextView = view!!.findViewById(R.id.dog_name)
        val dogAge: TextView = view!!.findViewById(R.id.dog_age)
        val dogHobby: TextView = view!!.findViewById(R.id.dog_hobby)
        val dogImage: ImageView = view!!.findViewById(R.id.dog_image)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        Layout: Int
    ): DogCardViewHolder {
        val adapterLayout = when (layout) {
            1 -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false)
            }
            2 -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false)
            }
            else -> {
                LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            }

        }

        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        context?.resources
        val doggy = data[position]
        holder.dogImage.setImageResource(doggy.imageResourceId)
        holder.dogName.text = doggy.name
        holder.dogAge.text = context?.resources?.getString(R.string.dog_age, doggy.age)
        holder.dogHobby.text = context?.resources?.getString(R.string.dog_hobbies, doggy.hobbies)
    }
}
