package com.example.design2;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;/*  creation of object from class Toolbar */
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drower);

        toolbar=(Toolbar) findViewById(R.id.toolbar); /*  creating a connection ffrom toolbar */
        setSupportActionBar(toolbar);
      // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerLayout = (DrawerLayout) findViewById(R.id.drower_layout); //getting reference of drower layout
        navigationView = (NavigationView) findViewById(R.id.navigation_view); //getting reference of drower layout
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);

        toggle.syncState();
    }


    @Override
    /*  onBackpressed method here is used to close navigation drawer only.  */
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){

            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
        super.onBackPressed();
    }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

    getMenuInflater().inflate(R.menu.menu_main,menu);
    return true;
//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    /* what happened when you click on any action or item */
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.itm1){
            Toast.makeText(getApplicationContext(),"Item 1 is selected",Toast.LENGTH_LONG).show();
        }
        else if(id == R.id.itm2){
            Toast.makeText(getApplicationContext(),"Item 2 is selected",Toast.LENGTH_LONG).show();
        }
        else if(id == R.id.itm3){
            Toast.makeText(getApplicationContext(),"Item 3 is selected",Toast.LENGTH_LONG).show();
        }
        else if(id==R.id.searchid){

        }
        else if(id==R.id.idcart){

        }
//        else if(id==android.R.id.home){
//            finish();//to make the activity to close
//
//        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    /* the codes inside this method is executed when user click on it/ any item on it  */
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.viewdish:
                Toast.makeText( getApplicationContext(),"View Dish", Toast.LENGTH_SHORT).show();
                break;
            case R.id.viewrecipie:
                Toast.makeText( getApplicationContext(),"View Recipie", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dish_id:
                Toast.makeText( getApplicationContext(),"Dish", Toast.LENGTH_SHORT).show();
                break;

            case R.id.recipie_id:
                Toast.makeText( getApplicationContext(),"recipie", Toast.LENGTH_SHORT).show();
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START); // this close navigation drower to the left

        return true;
    }

}
