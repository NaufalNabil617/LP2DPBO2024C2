#include <iostream> 
#include <string>

using namespace std;

class Product {
private:
    string ID;
    string name;
    string brand;
    string price;

public:
    Product() {

    }

    //Getter dan setter untuk ID
    string getID() {
        return this->ID;
    }

    void setID(string ID) {
        this->ID = ID;
    }

    //Getter dan setter untuk name
    string getName() {
        return this->name;
    }

    void setName(string name) {
        this->name = name;
    }

    //Getter dan setter untuk brand
    string getBrand() {
        return this->brand;
    }

    void setBrand(string brand) {
        this->brand = brand;
    }

    //Getter dan setter untuk price
    string getPrice() {
        return this->price;
    }

    void setPrice(string price) {
        this->price = price;
    }

    ~Product(){

        }
};