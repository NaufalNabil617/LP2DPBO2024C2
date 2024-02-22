/*Saya Naufal Nabil Anugrah (2201090) mengerjakan LP2 dalam mata kuliah
DPBO keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include "Shirt.cpp"
#include "Tabel.cpp"
#include <bits/stdc++.h>
#include <string>
using namespace std;

int main() {
    list<Shirt> llist;
    int n = 0;
    int i = 0;
    string ID, name, brand, price, size, material, gender, color, sleeve_type;

    cout << "Masukkan jumlah data:" << endl;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cout << "Masukkan data:" << endl;
        cin >> ID >> name >> brand >> price >> size >> material >> gender >> color >> sleeve_type;

        // Instansiasi data
        Shirt temp;
        temp.setID(ID);
        temp.setName(name);
        temp.setBrand(brand);
        temp.setPrice(price);
        temp.setSize(size);
        temp.setMaterial(material);
        temp.setGender(gender);
        temp.setColor(color);
        temp.setSleeveType(sleeve_type);

        // Masukkan data ke dalam list
        llist.push_back(temp);
    }

    Tabel tab;
    tab.setBaris(llist.size()+1);   
    tab.setKolom(9);                    

    string arrstr[llist.size()+1][9];

    arrstr[0][0] = "ID";
    arrstr[0][1] = "Nama";
    arrstr[0][2] = "Merk";
    arrstr[0][3] = "Harga";
    arrstr[0][4] = "Ukuran";
    arrstr[0][5] = "Bahan";
    arrstr[0][6] = "Jenis Kelamin";
    arrstr[0][7] = "Warna";
    arrstr[0][8] = "Panjang Lengan";


     for(list<Shirt>::iterator it = llist.begin(); it != llist.end(); it++) {
        arrstr[i+1][0] =  it->getID();
        arrstr[i+1][1] =  it->getName();
        arrstr[i+1][2] =  it->getBrand();
        arrstr[i+1][3] =  it->getPrice();
        arrstr[i+1][4] =  it->getSize();
        arrstr[i+1][5] =  it->getMaterial();
        arrstr[i+1][6] =  it->getGender();
        arrstr[i+1][7] =  it->getColor();
        arrstr[i+1][8] =  it->getSleeveType();
        
        i++;
    }

   tab.buatTabel(llist.size()+1, 9, arrstr);

    cout << endl;

    return 0;
}
