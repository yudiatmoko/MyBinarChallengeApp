package com.jaws.mybinarchallengeapp.page.fragmenthomepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent
import com.jaws.mybinarchallengeapp.R
import com.jaws.mybinarchallengeapp.adapter.RecyclerViewAdapterCategory
import com.jaws.mybinarchallengeapp.adapter.RecyclerViewAdapterMenu
import com.jaws.mybinarchallengeapp.databinding.FragmentHomePageBinding
import com.jaws.mybinarchallengeapp.model.Category
import com.jaws.mybinarchallengeapp.model.Menu

class FragmentHomePage : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomePageBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerViewCategory()
        setRecyclerViewMenu()
    }

    private fun setRecyclerViewMenu() {
        // Add Category List
        val menuList = mutableListOf<Menu>(
            Menu(R.drawable.img_grilled_chicken, "Ayam Bakar", "Rp. 50000"),
            Menu(R.drawable.img_fried_chicken, "Ayam Goreng", "Rp. 40000"),
            Menu(R.drawable.img_smashed_chicken, "Ayam Geprek", "Rp. 35000"),
            Menu(R.drawable.img_chicken_satay, "Sate Ayam", "Rp. 30000"),
        )

        // Create Adapter
        val recyclerViewAdapterMenu = RecyclerViewAdapterMenu(menuList)

        // Create Layout Manager
        val layoutManagerMenu = FlexboxLayoutManager(requireContext())
        layoutManagerMenu.flexDirection = FlexDirection.ROW
        layoutManagerMenu.justifyContent = JustifyContent.SPACE_BETWEEN

        // Create RecyclerView
        val recyclerViewMenu = binding.rvMenu

        // Set LayoutManager on RecyclerView
        recyclerViewMenu.layoutManager = layoutManagerMenu

        // Set Adapter on RecyclerView
        recyclerViewMenu.adapter = recyclerViewAdapterMenu
    }

    private fun setRecyclerViewCategory() {

        // Add Category List
        val categoryList = mutableListOf<Category>(
            Category(R.string.nasi, R.drawable.img_rice),
            Category(R.string.mie, R.drawable.img_noodle),
            Category(R.string.snack, R.drawable.img_snack),
            Category(R.string.minuman, R.drawable.img_drink)
        )

        // Create Adapter
        val recyclerViewAdapterCategory = RecyclerViewAdapterCategory(categoryList)

        // Create Layout Manager
        val layoutManagerCategory = FlexboxLayoutManager(requireContext())
        layoutManagerCategory.flexDirection = FlexDirection.ROW
        layoutManagerCategory.justifyContent = JustifyContent.SPACE_BETWEEN

        // Create RecyclerView
        val recyclerViewCategory = binding.rvCategory

        // Set LayoutManager on RecyclerView
        recyclerViewCategory.layoutManager = layoutManagerCategory

        // Set Adapter on RecyclerView
        recyclerViewCategory.adapter = recyclerViewAdapterCategory
    }
}