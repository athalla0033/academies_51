package intifada.example.com.submission;

import java.util.ArrayList;

public class WisataData {

    public static String[][] data = new String[][]{
            {"Museum Gunung Merapi", "Mendalami sejarah dan kedahsyatan Gunung Merapi di Museum Gunung Merapi", "http://192.168.137.1/Dicoding/submission/1-1-MuseumGunungMerapi-By-ceb0l.jpg"},
            {"Bukit Klangon", "Melihat sisi eksotik Gunung Merapi di Bukit Klangon", "http://192.168.137.1/Dicoding/submission/2-1-BukitKlangon-By-chaniiiss.jpg"},
            {"Lava Tour Merapi", "Memeras adrenalin di Lava Tour Merapi", "http://192.168.137.1/Dicoding/submission/4-1-LavaTourMerapi-By-krisnaharja.jpg"},
            {"The Lost World Castle", "Menilik benteng unik di kaki Merapi di The Lost World Castle", "http://192.168.137.1/Dicoding/submission/6-1-TheLostWorldCastle-By-hamenang.jpg"},
            {"Kaliadem", "Menikmati Merapi dengan tenang di Kaliadem", "http://192.168.137.1/Dicoding/submission/7-1-Kaliadem-By-msetyantoko.jpg"},
            {"Candi Sambisari", "Kecantikan yang tersembunyi di Candi Sambisari", "http://192.168.137.1/Dicoding/submission/11-1-CandiSambisari-By-annisadewi_delinda.jpg"},
            {"Candi Ijo", "Candi Ijo, candi tertinggi di Jogja", "http://192.168.137.1/Dicoding/submission/14-2-CandiIjo-By-jack.jpg"},
            {"Jogja Bay Pirates", "Bermain air di Jogja Bay Pirates Adventure Waterpark", "http://192.168.137.1/Dicoding/submission/15-1-Jogjabay.jpg"},
            {"Blue Lagoon", "Pemandian alami di Blue Lagoon", "http://192.168.137.1/Dicoding/submission/18-1-BlueLagoon-By-iwank_markzaid.jpg"},
            {"Green Kayen", "Green Kayen, spot wisata potensial di ConCat", "http://192.168.137.1/Dicoding/submission/19-1-GreenKayen-By-acieldt92.jpg"},
            {"Kids Fun Park", "Kids Fun Park, surga bermain si kecil", "http://192.168.137.1/Dicoding/submission/20-3-KidsFun.jpg"}
    };

    /*public static String[][] data = new String[][]{
            {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg"},
            {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
    };*/

    public static ArrayList<Wisata> getListData(){
        Wisata wisata = null;
        ArrayList<Wisata> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            wisata = new Wisata();
            wisata.setName(data[i][0]);
            wisata.setRemarks(data[i][1]);
            wisata.setPhoto(data[i][2]);

            list.add(wisata);
        }

        return list;
    }
}
