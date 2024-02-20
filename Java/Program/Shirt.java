public class Shirt extends Clothing{
    String color;
    String sleeve_type;

    public Shirt(){
        
    }

    //Getter dan setter untuk color
    public String getcolor(){
        return this.color;
    }
    public void setcolor(String color){
        this.color = color;
    }

    //Getter dan setter untuk sleeve_type
    public String getsleeve_type(){
        return this.sleeve_type;
    }

    public void setsleeve_type(String sleeve_type){
        this.sleeve_type = sleeve_type;
    }

    //Getter dan setter untuk gender
    public String getgender(){
        return this.gender;
    }

    public void setgender(String gender){
        this.gender = gender;
    }
}