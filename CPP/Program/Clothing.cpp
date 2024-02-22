#include <iostream> 
#include <string>
#include "Product.cpp"
using namespace std;

class Clothing : public Product {
private:
    string size;
    string material;
    string gender;

public:
    Clothing(){

    }

    // Getter dan setter untuk size
    string getSize() {
        return this->size;
    }

    void setSize(string size) {
        this->size = size;
    }

    // Getter dan setter untuk material
    string getMaterial() {
        return this->material;
    }

    void setMaterial(string material) {
        this->material = material;
    }

    // Getter dan setter untuk gender
    string getGender() {
        return this->gender;
    }

    void setGender(string gender) {
        this->gender = gender;
    }
    ~Clothing(){

    }
};
