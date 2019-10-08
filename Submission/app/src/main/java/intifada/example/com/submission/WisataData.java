package intifada.example.com.submission;

import java.util.ArrayList;

public class WisataData {

    public static String[][] data = new String[][]{
            {"Museum Gunung Merapi", "Mendalami sejarah dan kedahsyatan Gunung Merapi di Museum Gunung Merapi", String.valueOf( R.drawable.museumgunungmerapi)},
            {"Bukit Klangon", "Melihat sisi eksotik Gunung Merapi di Bukit Klangon", String.valueOf( R.drawable.bukitklangon)},
            {"Lava Tour Merapi", "Memeras adrenalin di Lava Tour Merapi", String.valueOf( R.drawable.thelostworldcastle)},
            {"Kaliadem", "Menikmati Merapi dengan tenang di Kaliadem", String.valueOf( R.drawable.kaliadem)},
            {"Candi Sambisari", "Kecantikan yang tersembunyi di Candi Sambisari", String.valueOf( R.drawable.candisambisari)},
            {"Candi Ijo", "Candi Ijo, candi tertinggi di Jogja", String.valueOf( R.drawable.candiijo)},
            {"Jogja Bay Pirates", "Bermain air di Jogja Bay Pirates Adventure Waterpark",String.valueOf(  R.drawable.jogjabay)},
            {"Blue Lagoon", "Pemandian alami di Blue Lagoon", String.valueOf( R.drawable.bluelagoon)},
            {"Green Kayen", "Green Kayen, spot wisata potensial di ConCat", String.valueOf( R.drawable.greenkanyen)},
            {"Kids Fun Park", "Kids Fun Park, surga bermain si kecil", String.valueOf( R.drawable.kidsfun)}
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
            wisata.setPhoto(Integer.parseInt(data[i][2]));

            list.add(wisata);
        }

        return list;
    }
}
