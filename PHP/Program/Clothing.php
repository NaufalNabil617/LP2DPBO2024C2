<?php
require ('Product.php');

class Clothing extends Product{
 
    private $size = '';
    private $material = '';
    private $gender = '';
    //Konstruktor
    public function __construct( $size = '', $material = '' , $gender = ' '  ){
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }
    
    //Getter setter size
    public function set_size($size){
        $this->size = $size;
    }

    public function get_size(){
        return $this->size;
    }
    
    //Getter setter material
    public function set_material($material){
        $this->material = $material;
    }

    public function get_material(){
        return $this->material;
    }

    //Getter setter gender
    public function set_gender($gender){
        $this->gender = $gender;
    }

    public function get_gender(){
        return $this->gender;
    }

}

?>