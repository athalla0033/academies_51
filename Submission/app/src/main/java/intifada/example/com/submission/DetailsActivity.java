package intifada.example.com.submission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    private TextView nama, keterangan;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        nama = findViewById(R.id.nama);
        keterangan = findViewById(R.id.keterangan);
        gambar = findViewById(R.id.gambar);
        Wisata data = (Wisata) getIntent().getSerializableExtra("data");

        nama.setText(data.getName());
        keterangan.setText(data.getRemarks());
        Glide.with(this).load(data.getPhoto()).into(gambar);
    }
}
