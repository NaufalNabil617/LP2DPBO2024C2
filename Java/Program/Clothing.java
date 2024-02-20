public class Clothing extends Product{
    String size;
    String material;
    String gender;

    public Clothing(){
        
    }

    //Getter dan setter untuk size
    public String getsize(){
        return this.size;
    }
    public void setsize(String size){
        this.size = size;
    }

    //Getter dan setter untuk material
    public String getmaterial(){
        return this.material;
    }

    public void setmaterial(String material){
        this.material = material;
    }

    //Getter dan setter untuk gender
    public String getgender(){
        return this.gender;
    }

    public void setgender(String gender){
        this.gender = gender;
    }
}