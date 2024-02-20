public class Tabel {
    private int baris;
    private int kolom;

    Tabel() {

    }

    //Constructor 
    Tabel(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
    }

    //Getter dan setter untuk baris
    public int getBaris(){
        return baris;
    }

    public void setBaris(int baris){
        this.baris = baris;
    }

    //Getter dan setter untuk kolom
    public int getKolom(){
        return kolom;
    }

    public void setKolom(int kolom){
        this.kolom = kolom;
    }

    //Method untuk menampilkan list dalam bentuk tabel
    public void buatBaris(int baris, int kolom, String[][] data){
        int i = 0, j = 0;
        int max[] = new int[kolom];
        for (i = 0; i < kolom; i++) {
            max[i] = 0;
            for (j = 0; j < baris; j++) {
                if (data[j][i].length() > max[i]) {
                    max[i] = data[j][i].length();
                }
            }
        }

        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                for (int k = 0; k < max[j]; k++) {
                    System.out.print("-");
                }
                System.out.print("--");
            }
            System.out.println("---------");
            for (j = 0; j < kolom; j++) {
                System.out.print("|" + data[i][j]);
                for (int k = 0; k < max[j] - data[i][j].length(); k++) {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println("|");
        }
        for (j = 0; j < kolom; j++) {
            for (int k = 0; k < max[j]; k++) {
                System.out.print("-");
            }
            System.out.print("--");
        }
        System.out.println("---------");
    }
}