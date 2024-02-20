/*Saya Naufal Nabil Anugrah (2201090) mengerjakan LP2 dalam mata kuliah
DPBO keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Shirt> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String ID, name, brand, price, size, material, gender, color, sleeve_type;
        System.out.println("Masukkan jumlah data:");
        n = sc.nextInt();

        for(int i =0; i<n; i++){
            System.out.println("Masukkan data:");
            ID = sc.next();
            name = sc.next(); 
            brand = sc.next();
            price = sc.next();
            size = sc.next();
            material = sc.next();
            gender = sc.next();
            color = sc.next();
            sleeve_type = sc.next();

            //Instansiasi data
            Shirt temp = new Shirt(); 
            temp.setID(ID);
            temp.setname(name);
            temp.setbrand(brand);
            temp.setprice(price);
            temp.setsize(size);
            temp.setmaterial(material);
            temp.setgender(gender);
            temp.setcolor(color);
            temp.setsleeve_type(sleeve_type);

            //Masukan data kedalam list
            list.add(temp);

        }

        Tabel tab = new Tabel();
        String[][] arrstr = new String[list.size()+1][9];
        arrstr[0][0] = "ID";
        arrstr[0][1] = "Nama";
        arrstr[0][2] = "Merk";
        arrstr[0][3] = "Harga";
        arrstr[0][4] = "Ukuran";
        arrstr[0][5] = "Bahan";
        arrstr[0][6] = "Jenis Kelamin";
        arrstr[0][7] = "Warna";
        arrstr[0][8] = "Panjang Lengan";
        
        for(int i = 0; i < list.size(); i++){
            arrstr[i+1][0] = list.get(i).getID();
            arrstr[i+1][1] = list.get(i).getname();
            arrstr[i+1][2] = list.get(i).getbrand();
            arrstr[i+1][3] = list.get(i).getprice();
            arrstr[i+1][4] = list.get(i).getsize();
            arrstr[i+1][5] = list.get(i).getmaterial();
            arrstr[i+1][6] = list.get(i).getgender();
            arrstr[i+1][7] = list.get(i).getcolor();
            arrstr[i+1][8] = list.get(i).getsleeve_type();
        }
        System.out.println();
        System.out.println("Data Baju");
        tab.buatBaris(list.size()+1, 9, arrstr);
        System.out.println();
        
        
        sc.close();
    }
}