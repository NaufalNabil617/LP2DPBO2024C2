<?php

class Product{

    private $ID = '';
    private $name = '';
    private $brand = '';

    private $price = '';

    //KONSTRUKTUR
    public function __construct( $ID = '', $name = '' , $brand = '' , $price = ' ') {
        $this->ID = $ID;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    //Getter setter ID
    public function set_ID($ID){
        $this->ID = $ID;
    }

    public function get_ID(){
        return $this->ID;
    }
    
    //Getter setter name
    public function set_name($name){
        $this->name = $name;
    }

    public function get_name(){
        return $this->name;
    }

    //Getter setter brand
    public function set_brand($brand){
        $this->brand = $brand;
    }

    public function get_brand(){
        return $this->brand;
    }

    //Getter setter price
    public function set_price($price){
        $this->price = $price;
    }

    public function get_price(){
        return $this->price;
    }
}

?>