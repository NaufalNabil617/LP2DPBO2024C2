class Product:
    def __init__(self):
        self.ID = ""
        self.name = ""
        self.brand = ""
        self.price = ""

    # Getter dan setter untuk ID
    def getID(self):
        return self.ID

    def setID(self, ID):
        self.ID = ID

    # Getter dan setter untuk name
    def getname(self):
        return self.name

    def setname(self, name):
        self.name = name

    # Getter dan setter untuk brand
    def getbrand(self):
        return self.brand

    def setbrand(self, brand):
        self.brand = brand

    # Getter dan setter untuk price
    def getprice(self):
        return self.price

    def setprice(self, price):
        self.price = price
