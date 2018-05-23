package com.akeditzz.paytmlayout;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    LinearLayout ll_portfolio,ll_market,ll_newsfeed,ll_leaderboard;
    TextView tv_portfolio,tv_market,tv_newsfeed,tv_leaderboard;
    ImageView iv_portfolio,iv_market,iv_newsfeed,iv_leaderboard;

    Portfolio portfolio;
    Market market;
    Newsfeed newsfeed;
    Leaderboard leaderboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        drawerLayout = findViewById(R.id.drawerLayout);

        portfolio = new Portfolio();
        market = new Market();
        newsfeed = new Newsfeed();
        leaderboard = new Leaderboard();

        ll_portfolio = findViewById(R.id.ll_portfolio);
        ll_market = findViewById(R.id.ll_market);
        ll_newsfeed = findViewById(R.id.ll_newsfeed);
        ll_leaderboard = findViewById(R.id.ll_leaderboard);

        tv_portfolio = findViewById(R.id.tv_portfolio);
        tv_market = findViewById(R.id.tv_market);
        tv_newsfeed = findViewById(R.id.tv_newsfeed);
        tv_leaderboard = findViewById(R.id.tv_leaderboard);

        iv_portfolio = findViewById(R.id.iv_portfolio);
        iv_market = findViewById(R.id.iv_market);
        iv_newsfeed = findViewById(R.id.iv_newsfeed);
        iv_leaderboard = findViewById(R.id.iv_leaderboard);

        setDefaultFragment();

        ll_portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetBottomClickUI();
                setDefaultFragment();


            }
        });
        ll_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetBottomClickUI();
                setMarketFragment();

            }
        });
        ll_newsfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetBottomClickUI();
                setNewsFeedFragment();

            }
        });
        ll_leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetBottomClickUI();
                setLeaderBoardFragment();

            }
        });

    }

    private void setDefaultFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,portfolio,"").commit();
        tv_portfolio.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        iv_portfolio.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent), PorterDuff.Mode.SRC_IN);
    }

    private void setMarketFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,market,"").commit();
        tv_market.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        iv_market.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent), PorterDuff.Mode.SRC_IN);
    }
    private void setNewsFeedFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,newsfeed,"").commit();
        tv_newsfeed.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        iv_newsfeed.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent), PorterDuff.Mode.SRC_IN);
    }
    private void setLeaderBoardFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,leaderboard,"").commit();
        tv_leaderboard.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        iv_leaderboard.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent), PorterDuff.Mode.SRC_IN);
    }

    public void openDrawer(){
        drawerLayout.openDrawer(Gravity.START);
    }


    private void resetBottomClickUI(){
        tv_portfolio.setTextColor(ContextCompat.getColor(this, R.color.black));
        tv_market.setTextColor(ContextCompat.getColor(this, R.color.black));
        tv_newsfeed.setTextColor(ContextCompat.getColor(this, R.color.black));
        tv_leaderboard.setTextColor(ContextCompat.getColor(this, R.color.black));

        iv_portfolio.setColorFilter(ContextCompat.getColor(this, R.color.black), PorterDuff.Mode.SRC_IN);
        iv_market.setColorFilter(ContextCompat.getColor(this, R.color.black), PorterDuff.Mode.SRC_IN);
        iv_newsfeed.setColorFilter(ContextCompat.getColor(this, R.color.black), PorterDuff.Mode.SRC_IN);
        iv_leaderboard.setColorFilter(ContextCompat.getColor(this, R.color.black), PorterDuff.Mode.SRC_IN);
    }

}
