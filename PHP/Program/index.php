<?php

require ('Shirt.php');

//List objek Shirt
$arrayshirt = array(); 

//Objek Shirt Ke 1
$shirt1 = new Shirt();

//Isi data
$shirt1->set_ID("01");
$shirt1->set_name("T-Shirt");
$shirt1->set_brand("Zara");
$shirt1->set_price("Rp.20000");
$shirt1->set_size("XXL");
$shirt1->set_material("Diamond");
$shirt1->set_gender("Pria");
$shirt1->set_color("Merah");
$shirt1->set_sleeve_type("Pendek");

//Masukan ke array
array_push($arrayshirt, $shirt1);

//Objek Shirt Ke 2
$shirt2 = new Shirt();

//Isi Data
$shirt2->set_ID("02");
$shirt2->set_name("Turtleneck");
$shirt2->set_brand("Dior");
$shirt2->set_price("Rp.2000000");
$shirt2->set_size("L");
$shirt2->set_material("Katun");
$shirt2->set_gender("Unisex");
$shirt2->set_color("Hitam");
$shirt2->set_sleeve_type("Panjang");

//Masukan ke array
array_push($arrayshirt, $shirt2);


//Objek Shirt Ke 3
$shirt3 = new Shirt();

//Isi Data
$shirt3->set_ID("03");
$shirt3->set_name("Dress");
$shirt3->set_brand("Gucii");
$shirt3->set_price("Rp.200000000");
$shirt3->set_size("L");
$shirt3->set_material("Sutra");
$shirt3->set_gender("Wanita");
$shirt3->set_color("Putih");
$shirt3->set_sleeve_type("Panjang");

//Masukan ke array
array_push($arrayshirt, $shirt3);

//Ouput tabel
echo "<h2><b><center>Data Baju</center></b></h2>";

echo "<center><table border='2'>";
    echo "<tr>
        <th> ID </th>
        <th> Nama </th>
        <th> Merk </th>
        <th> Harga </th>
        <th> Ukuran </th>
        <th> Bahan </th>
        <th> Jenis Kelamin </th>
        <th> Warna </th>
        <th> Panjang Lengan </th>
    </tr>";

    //Isi Tabel
    for ($i=0; $i < count($arrayshirt); $i++)
    {
        echo "<tr><td>";
        echo $arrayshirt[$i]->get_ID();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_name();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_brand();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_price();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_size();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_material();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_gender();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_color();
        echo "</td><td>";
        echo $arrayshirt[$i]->get_sleeve_type();
        echo "</td>";
        echo "</tr>";
    }
echo "</table> </center>";
        
?>