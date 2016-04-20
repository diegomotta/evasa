package com.evasa.evasa;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import fragments.ControlOperativo;
import fragments.ControlOperativoSegundo;
import fragments.ControlOperativoTercero;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Cargar menu nav_view";
    //Definicion de variables
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private static final int ITEMS = 3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) super.findViewById(R.id.viewpager);

        //Activa el toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //tabLayout=(TabLayout) findViewById(R.id.tabs);

        navigationView = (NavigationView) findViewById(R.id.nav_view);



        //Configuración de la vista de navegación de artículos, y un receptor(Listener) para manejar el evento clic sobre un articulo del menú de navegación
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                //Closing drawer on item click
                drawerLayout.closeDrawers();
                //Check to see which item was being clicked and perform appropriate action

                switch (menuItem.getItemId()) {
                    case R.id.ctrlOperative:
                        // removeTab();
                        setTitle("Control operativo");
                        Setup(R.id.ctrlOperative, MainActivity.this );
                        return true;
                    case R.id.ctrlTracing:
                        //removeTab();
                        setTitle("Control de seguimiento");
                        Setup(R.id.ctrlTracing,MainActivity.this );
                        return true;
                    default:
                        return false;

                }

            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };
        //Setting the actionbarToggle to drawer layout
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();

    }

    private void Setup(int id, Activity  activity){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        switch (id){
            case R.id.ctrlOperative:
//                if(adapter.getmFragmentTitleList().size() > 0) {
//                    adapter.getmFragmentTitleList().clear();
//                }
//
//                 adapter.addFragment(new ControlOperativo(), "Eventos");
//                adapter.notifyDataSetChanged();
                ((MainActivity)activity).setCurrentItem(0, true);
                break;
            case R.id.ctrlTracing:

                break;
            case R.id.sendDate:


                break;
        }

        viewPager.setAdapter(adapter);
        //tabLayout.setupWithViewPager(viewPager);
    }

    public void removeTab() {
        for(int i=1 ; i < tabLayout.getTabCount();i++){
            tabLayout.removeTabAt(i);
        }
    }

    //Clase para visualizar los fragmentos y los tabs en el viewpager
//    class ViewPagerAdapter extends FragmentStatePagerAdapter {
//        private  List<Fragment> mFragmentList = new ArrayList<>();
//        private  List<String> mFragmentTitleList = new ArrayList<>();
//
//        public List<String> getmFragmentTitleList() {
//            return mFragmentTitleList;
//        }
//
//        public List<Fragment> getmFragmentList() {
//            return mFragmentList;
//        }
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//
//            switch (position){
//                case 0:
//                    ControlOperativo fragmentOperativo = new ControlOperativo();
//                    return fragmentOperativo;
//                case 1:
//                    ControlOperativoSegundo fragmentOperativoSegundo = new ControlOperativoSegundo();
//                    return  fragmentOperativoSegundo;
//            }
//            return null;
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title) {
//
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//
//            return mFragmentTitleList.get(position);
//        }
//
//        //this is called when notifyDataSetChanged() is called
//        @Override
//        public int getItemPosition(Object object) {
//            // refresh all fragments when data set changed
//            return   POSITION_NONE;
//        }
//
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            if (position >= getCount()) {
//                FragmentManager manager = ((Fragment) object).getFragmentManager();
//                FragmentTransaction trans = manager.beginTransaction();
//                trans.remove((Fragment) object);
//                trans.commit();
//
//            }
//
//        }

   // }
   public static class ViewPagerAdapter extends FragmentPagerAdapter {


       public ViewPagerAdapter(FragmentManager fragmentManager) {
           super(fragmentManager);
       }

       @Override
       public int getCount() {
           return ITEMS;
       }

       @Override
       public Fragment getItem(int position) {
            switch (position){
                case 0:
                    ControlOperativo fragmentOperativo = new ControlOperativo();
                    return fragmentOperativo;
                case 1:
                    ControlOperativoSegundo fragmentOperativoSegundo = new ControlOperativoSegundo();
                    return  fragmentOperativoSegundo;
                case 2:
                    ControlOperativoTercero fragmentOperativoTercero = new ControlOperativoTercero();
                    return  fragmentOperativoTercero;
            }
            return null;
       }
   }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setCurrentItem (int item, boolean smoothScroll) {
        viewPager.setCurrentItem(item, smoothScroll);
    }
}


