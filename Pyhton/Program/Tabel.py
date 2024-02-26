class Tabel:
    def __init__(self):
        self.baris = 0
        self.kolom = 0

    def __init__(self, baris, kolom):
        self.baris = baris
        self.kolom = kolom

    # Getter dan setter untuk baris
    def getBaris(self):
        return self.baris

    def setBaris(self, baris):
        self.baris = baris

    # Getter dan setter untuk kolom
    def getKolom(self):
        return self.kolom

    def setKolom(self, kolom):
        self.kolom = kolom

    # Method untuk menampilkan list dalam bentuk tabel
    def buatTabel(self, data):
        max_len = [0] * self.kolom
        for i in range(self.kolom):
            for j in range(self.baris):
                max_len[i] = max(max_len[i], len(data[j][i]))

        for i in range(self.baris):
            for j in range(self.kolom):
                for k in range(max_len[j]):
                    print("-", end="")
                print("--", end="")
            print("---------")
            for j in range(self.kolom):
                print("|" + data[i][j], end="")
                print(" " * (max_len[j] - len(data[i][j])) + "  ", end="")
            print("|")
        for j in range(self.kolom):
            for k in range(max_len[j]):
                print("-", end="")
            print("--", end="")
        print("---------")
