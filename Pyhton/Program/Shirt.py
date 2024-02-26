from Clothing import Clothing

class Shirt(Clothing):
    def __init__(self):
        super().__init__()
        self.color = ""
        self.sleeve_type = ""

    # Getter dan setter untuk color
    def getcolor(self):
        return self.color

    def setcolor(self, color):
        self.color = color

    # Getter dan setter untuk sleeve_type
    def getsleeve_type(self):
        return self.sleeve_type

    def setsleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type
