package intifada.example.com.submission;

import java.io.Serializable;

public class Wisata implements Serializable {
    private String name, remarks;
    private int photo;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getRemarks() { return remarks; }

    public void setRemarks(String remarks) { this.remarks = remarks; }

    public int getPhoto() { return photo; }

    public void setPhoto(int photo) { this.photo = photo; }
}
