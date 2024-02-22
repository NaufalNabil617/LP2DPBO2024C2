<?php
require ('Clothing.php');

class Shirt extends Clothing{
 
    private $color = '';
    private $sleeve_type = '';
    
    //Konstruktor
    public function __construct( $color = '', $sleeve_type = ''){
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
      
    }
    
    //Getter setter color
    public function set_color($color){
        $this->color = $color;
    }

    public function get_color(){
        return $this->color;
    }
    
    //Getter setter sleeve type
    public function set_sleeve_type($sleeve_type){
        $this->sleeve_type = $sleeve_type;
    }

    public function get_sleeve_type(){
        return $this->sleeve_type;
    }

  

}

?>