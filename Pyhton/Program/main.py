from Shirt import Shirt
from Tabel import Tabel

listShirt = []

print("Masukkan jumlah data:")
n = int(input())

for i in range(n):
    print("Masukkan data:")
    data = Shirt()

    ID = input()  
    name = input()        
    brand = input()       
    price = input()       
    size = input()        
    material = input()    
    gender = input()      
    color = input()       
    sleeve_type = input() 

    data.setID(ID)
    data.setname(name)
    data.setbrand(brand)
    data.setprice(price)
    data.setsize(size)
    data.setmaterial(material)
    data.setgender(gender)
    data.setcolor(color)
    data.setsleeve_type(sleeve_type)

    listShirt.append(data)


# Create an instance of the Tabel class
tab = Tabel(len(listShirt) + 1, 9)

arrstr = [["ID Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"]]

# Populate arrstr with shirt data
for data in listShirt:
    arrstr.append([data.getID(), data.getname(), data.getbrand(), data.getprice(), data.getsize(), data.getmaterial(), data.getgender(), data.getcolor(), data.getsleeve_type()])

# Display the table
tab.buatTabel(arrstr)



