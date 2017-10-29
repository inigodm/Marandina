package com.inigo.marandina.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.ArrayList

class PlayerActivity : AppCompatActivity() {

    /**
     * The [android.support.v4.view.PagerAdapter] that will provide
     * fragments for each of the sections. We use a
     * [FragmentPagerAdapter] derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * [android.support.v4.app.FragmentStatePagerAdapter].
     */
    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    /**
     * The [ViewPager] that will host the section contents.
     */
    private var mViewPager: ViewPager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager, Bundle())
        mViewPager = findViewById<View>(R.id.container) as ViewPager
        (mViewPager as ViewPager).adapter = mSectionsPagerAdapter
    }

    /**
     * A [FragmentPagerAdapter] that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    inner class SectionsPagerAdapter(fm: FragmentManager, internal var bundle: Bundle) : FragmentStatePagerAdapter(fm) {
        internal var pf: MutableList<Fragment> = ArrayList(3)

        init {
            //pf.add(PlayerFragment.newInstance(bundle))
            pf.add(LoadingFragment())
        }

        override fun getItem(position: Int): Fragment {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if (pf[position] == null) {
                //pf[position] = PlayerFragment.newInstance(bundle)
            }
            return pf[position]
        }

        override fun getCount(): Int {
            return pf.size
        }

        override fun getPageTitle(position: Int): CharSequence {
            return "Title"
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    class LoadingFragment : Fragment() {

        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            val rootView = inflater!!.inflate(R.layout.loading, container, false)
            return rootView
        }

        companion object {

            /**
             * Returns a new instance of this fragment for the given section
             * number.
             */
            fun newInstance(bundle: Bundle): LoadingFragment {
                return LoadingFragment()
            }
        }
    }
}