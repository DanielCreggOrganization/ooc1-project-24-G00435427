package ie.atu.videogameManager;

public class game {
    //Instance Variables
    
    private int Game_Id; // Unique ID
    private String Genre;
    private  float Storage_SizeGB;
    private int units_sold;
    private boolean ismultiplayer;

    //Constructor
    public game(int Game_Id, String Genre, double Storage_Size, int units_sold, boolean ismultiplayer){
        this.Game_Id = Game_Id;
        this.Genre = Genre;
        this.Storage_SizeGB = Storage_SizeGB;
        this.units_sold = units_sold;
        this.ismultiplayer = ismultiplayer;
    }


    public int getGame_Id(){
        return this.Game_Id;
    }
    public int getunits_sold(){
        return this.units_sold;
    }
    public float getstorage_size(){
        return this.Storage_SizeGB;
    }
    public String getgenre(){
        return this.Genre;
    }
    public boolean ismultiplayer(){
        return this.ismultiplayer;
    }

    public void setunits_sold(int units_sold){
        this.units_sold = units_sold;
    }
    public void setstorage_size(float storage_size){
        this.Storage_SizeGB = Storage_SizeGB;
    }
    public void setgenre (String genre){
        this.Genre = Genre;
    }
    
}

class videogame extends game {
    
        public videogame(int Game_Id, String Genre, float storage_SizeGB, int units_sold, boolean ismultiplayer) {
            super(Game_Id, Genre, storage_SizeGB, units_sold, ismultiplayer);
    }
}

