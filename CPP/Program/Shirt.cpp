#include <iostream> 
#include <string>
#include "Clothing.cpp"
using namespace std;

class Shirt : public Clothing {
private:
    string color;
    string sleeve_type;

public:
    Shirt() {

    }

    // Getter dan setter untuk color
    string getColor() {
        return this->color;
    }

    void setColor(string color) {
        this->color = color;
    }

    // Getter dan setter untuk sleeve_type
    string getSleeveType() {
        return this->sleeve_type;
    }

    void setSleeveType(string sleeve_type) {
        this->sleeve_type = sleeve_type;
    }
    ~Shirt(){
        
    }
};
