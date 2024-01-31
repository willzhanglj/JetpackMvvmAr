package com.dream.jetpackmvvm.navigation

import androidx.navigation.Navigator
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.NavHostFragment


/**
 * 作者　: hegaojian
 * 时间　: 2021/6/29
 * 描述　: Hide - Show NavHostFragment
 */
class NavHostFragmentHideShow : NavHostFragment() {


    /**
     * @return 使用自己的FragmentNavigator
     */
    override fun createFragmentNavigator(): Navigator<out FragmentNavigator.Destination?> {
//        return FragmentNavigatorHideShow(requireContext(), childFragmentManager, containerId)
        return FragmentNavigatorHideShow(requireContext(), childFragmentManager, 0)
    }


//    private val containerId: Int
//        get() {
//            val id = id
//            return if (id != 0 && id != View.NO_ID) {
//                id
//                // Fallback to using our own ID if this Fragment wasn't added via
//                // add(containerViewId, Fragment)
//            } else R.id.nav_host_fragment_container
//        }
}