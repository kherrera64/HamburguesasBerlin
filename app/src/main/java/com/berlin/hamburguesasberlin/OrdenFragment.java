package com.berlin.hamburguesasberlin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;


public class OrdenFragment extends Fragment {

    private AppBarLayout appBar;
    private TabLayout tabs;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancestate)
    {
        View v;
        v = inflater.inflate(R.layout.fragment_orden, container, false);

//        View contenedor = (View)container.getParent();
//        appBar = (AppBarLayout)contenedor.findViewById(R.id.appbar);
//        tabs = new TabLayout(getActivity());
//        appBar.addView(tabs);
//
//        viewPager = (ViewPager)v.findViewById(R.id.container);
//        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getFragmentManager());
//        viewPager.setAdapter(pagerAdapter);
//        tabs.setupWithViewPager(viewPager);

        return  v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        appBar.removeView(tabs);
    }

    public class ViewPagerAdapter extends FragmentStatePagerAdapter{

        public ViewPagerAdapter(FragmentManager fragmentManager) {

            super(fragmentManager);
        }

        String[] titulosTabs = {"HAMBURGUESAS", "POLLO", "POSTRES"};

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new productoFragment();
                case 1:
                    return new productoFragment();
                case 2:
                    return new productoFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
           return titulosTabs[position];
        }

    }

}
