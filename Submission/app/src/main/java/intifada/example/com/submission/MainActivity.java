package intifada.example.com.submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Wisata> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("HitSleman");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(WisataData.getListData());

        showRecyclerCardView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = null;
        switch (item.getItemId()){
            case R.id.action_cardview:
                title = "HitSleman";
                showRecyclerCardView();
                break;
            case R.id.action_tentang:
                showAbout();
                title = "Tentang";
                break;
        }
        setActionBarTitle(title);
        return super.onOptionsItemSelected(item);
    }

    private void showAbout(){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewWisataAdapter cardViewWisataAdapter = new CardViewWisataAdapter(new CustomOnItemClickListener() {
            @Override
            public void onItemClicked(Wisata item, int position) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("data", item);
                startActivity(intent);
            }
        });
        cardViewWisataAdapter.setListWisata(list);
        rvCategory.setAdapter(cardViewWisataAdapter);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    private void showSelectedWisata(Wisata wisata){
        Toast.makeText(this, "Kamu memilih "+wisata.getName(), Toast.LENGTH_SHORT).show();
    }

    private void share (Wisata wisata) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, ""+wisata.getName());
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);

    }
}
