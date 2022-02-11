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
import eu.eleo.dogglers.const.Layout
import eu.eleo.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(private val context: Context, private val layout: Int): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    /** TODO: Initialize the data using the List found in data/DataSource
        Initialize view elements
     */
    class DogCardViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val dogname: TextView = view.findViewById(R.id.dog_name)
        val dogage: TextView = view.findViewById(R.id.dog_age)
        val doghobby: TextView = view.findViewById(R.id.dog_hobby)
        val dogimage: ImageView = view.findViewById(R.id.dog_image)

        // TODO: Declare and initialize all of the list item UI components
    }

    override fun onCreateViewHolder(parent: ViewGroup, Layout: Int): DogCardViewHolder {
        when (Layout) {
            3 -> adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            else -> adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.



        // TODO Inflate the layout

        // TODO: Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.
        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = 0 // TODO: return the size of the data set instead of 0

    override fun onBindViewHolder(holder: DogCardAdapter.DogCardViewHolder, position: Int) {
        // TODO: Get the data at the current position
        // TODO: Set the image resource for the current dog
        // TODO: Set the text for the current dog's name
        // TODO: Set the text for the current dog's age
        val resources = context?.resources
        resources?.getDrawable(R.drawable.dogs, dogs.image)
        resources?.getString(R.string.dog_hobbies. dog.hobbies)
        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
        resources?.getString(R.string.dog_hobbies, dog.hobbies)

    }
}
