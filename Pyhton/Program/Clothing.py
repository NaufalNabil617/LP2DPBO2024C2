from Product import Product

class Clothing(Product):
    def __init__(self):
        super().__init__()
        self.size = ""
        self.material = ""
        self.gender = ""

    # Getter dan setter untuk size
    def getsize(self):
        return self.size

    def setsize(self, size):
        self.size = size

    # Getter dan setter untuk material
    def getmaterial(self):
        return self.material

    def setmaterial(self, material):
        self.material = material

    # Getter dan setter untuk gender
    def getgender(self):
        return self.gender

    def setgender(self, gender):
        self.gender = gender
